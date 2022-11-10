CREATE TABLE `Musteriler`(
    `MusteriId` INT UNSIGNED NOT NULL AUTO_INCREMENT,
    `MusteriNo` INT NOT NULL,
    `Tip` INT NOT NULL,
    `KanalId` INT NOT NULL
);
ALTER TABLE
    `Musteriler` ADD PRIMARY KEY `musteriler_musteriid_primary`(`MusteriId`);
ALTER TABLE
    `Musteriler` ADD UNIQUE `musteriler_musterino_unique`(`MusteriNo`);
CREATE TABLE `TuzelMusteriler`(
    `Musteriid` INT UNSIGNED NOT NULL AUTO_INCREMENT,
    `Unvan` LINESTRING NOT NULL,
    `VergiNo` CHAR(10) NOT NULL
);
ALTER TABLE
    `TuzelMusteriler` ADD PRIMARY KEY `tuzelmusteriler_musteriid_primary`(`Musteriid`);
CREATE TABLE `GercekMusteriler`(
    `MusteriId` INT UNSIGNED NOT NULL AUTO_INCREMENT,
    `Ad` LINESTRING NOT NULL,
    `Soyad` LINESTRING NOT NULL,
    `TcKimlikNo` CHAR(11) NOT NULL
);
ALTER TABLE
    `GercekMusteriler` ADD PRIMARY KEY `gercekmusteriler_musteriid_primary`(`MusteriId`);
ALTER TABLE
    `GercekMusteriler` ADD UNIQUE `gercekmusteriler_tckimlikno_unique`(`TcKimlikNo`);
CREATE TABLE `Adresler`(
    `AdressId` INT UNSIGNED NOT NULL AUTO_INCREMENT,
    `MusteriId` INT NOT NULL,
    `Mahalle` LINESTRING NOT NULL,
    `Sokak` LINESTRING NOT NULL,
    `No` INT NOT NULL,
    `Daire` INT NOT NULL
);
ALTER TABLE
    `Adresler` ADD PRIMARY KEY `adresler_adressid_primary`(`AdressId`);
CREATE TABLE `Bilancolar`(
    `BilancoId` INT UNSIGNED NOT NULL AUTO_INCREMENT,
    `MusteriId` INT NOT NULL,
    `Tarih` DATETIME NOT NULL,
    `Tutar` DOUBLE NOT NULL
);
ALTER TABLE
    `Bilancolar` ADD PRIMARY KEY `bilancolar_bilancoid_primary`(`BilancoId`);
CREATE TABLE `Kanallar`(
    `KanalId` INT UNSIGNED NOT NULL AUTO_INCREMENT,
    `KanalAd` LINESTRING NOT NULL
);
ALTER TABLE
    `Kanallar` ADD PRIMARY KEY `kanallar_kanalid_primary`(`KanalId`);
CREATE TABLE `TicariFaaliyetler`(
    `TicariFaaliyetId` INT NOT NULL,
    `GercekMusteriId` INT UNSIGNED NOT NULL AUTO_INCREMENT,
    `BaslangicTarihi` DATETIME NOT NULL
);
ALTER TABLE
    `TicariFaaliyetler` ADD PRIMARY KEY `ticarifaaliyetler_ticarifaaliyetid_primary`(`TicariFaaliyetId`);
ALTER TABLE
    `TicariFaaliyetler` ADD UNIQUE `ticarifaaliyetler_gercekmusteriid_unique`(`GercekMusteriId`);
CREATE TABLE `Sendikalar`(
    `MusteriId` INT UNSIGNED NOT NULL AUTO_INCREMENT,
    `Ad` LINESTRING NOT NULL
);
ALTER TABLE
    `Sendikalar` ADD PRIMARY KEY `sendikalar_musteriid_primary`(`MusteriId`);
ALTER TABLE
    `Adresler` ADD CONSTRAINT `adresler_musteriid_foreign` FOREIGN KEY(`MusteriId`) REFERENCES `Musteriler`(`MusteriId`);
ALTER TABLE
    `Bilancolar` ADD CONSTRAINT `bilancolar_musteriid_foreign` FOREIGN KEY(`MusteriId`) REFERENCES `Musteriler`(`MusteriId`);
ALTER TABLE
    `Musteriler` ADD CONSTRAINT `musteriler_kanalid_foreign` FOREIGN KEY(`KanalId`) REFERENCES `Kanallar`(`KanalId`);
ALTER TABLE
    `TicariFaaliyetler` ADD CONSTRAINT `ticarifaaliyetler_gercekmusteriid_foreign` FOREIGN KEY(`GercekMusteriId`) REFERENCES `GercekMusteriler`(`MusteriId`);