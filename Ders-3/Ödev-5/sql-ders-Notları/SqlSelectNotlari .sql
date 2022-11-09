--ANSII Standartı SQL
-- #SELECT

Select * from Customers 
--@ Customers tablosundaki tüm kolonları seç

Select ContactName, CompanyName, City from Customers
--@ Customers tablosundaki ContactName , CompanyName, City kolonlarını seç

Select ContactName Adi, CompanyName SirketAdi , City Sehir from Customers
--@Customers tablosundaki ContactName = Adi , CompanyName = SirketAdi , City = Sehir olarak kolonları güncelleyerek seç

Select * from Customers where City = 'London'
--@ Customers tablosundaki City kolonunda "London" yazan satırları seç *Not: Stringler tek tırnak içinde yazılır

--@ *Not: Sql Case Insensitive yani büyük/küçük harf duyarsız

Select * from Products 
--@ Products tablosundaki tüm kolonları seç

Select * from Products where categoryId = 1 or categoryId=3
--@ Products tablosundaki categoryId = 1  olan veya categoryId=3 olan satırları seç

Select * from Products where categoryId = 1 and UnitPrice=18
--@ Products tablosundaki categoryId = 1 olan ve UnitPrice=18 olan satırları seç

Select * from Products where UnitPrice > 18 or  UnitPrice < 1 or UnitPrice>=18 or UnitPrice <= 1 or UnitPrice<>20
--@ Products tablosundaki 
--@ UnitPrice 18 den büyük veya
--@ UnitPrice 1 den küçük veya
--@ UnitPrice 18 den büyük yada 18 e eşit veya
--@ UnitPrice 1 den küçük yada 1 e eşit veya
--@ UnitPrice 20 değilse 
--@ kriterlerindeki satırları seç

Select * from Products order by ProductName DESC
--@ Products tablosundaki tüm kolonları seç ve ProductName Kolonuna göre z-a (Sayısal veri ise azalarak(desending)) sırala

Select * from Products order by ProductName  ASC
--@ Products tablosundaki tüm kolonları seç ve ProductName Kolonuna göre a-z (Sayısal veri ise artarak(ascending)) sırala

Select * from Products order by ProductName  
--@ Products tablosundaki tüm kolonları seç ve ProductName Kolonuna göre a-z (Sayısal veri ise artarak) sırala
--@ *Not: Sıralama tipini belirtmezsek, asc(ascending) varsayılan olarak kullanılır önceki kod ile aynı sonucu çıkarır

Select * from Products order by ProductName ,CategoryID 
--@ Products tablosundaki tüm kolonları seç ve 
--@ önce ProductName göre sonra 
--@ ProductName sıralması bozulmayacak şekilde CategoryId ye göre Artan sırala

Select * from Products where categoryId=1 order by ProductName 
--@ Products tablosundaki categoryId=1 olan satırları seç ve ProductName' ne göre artan sırala

Select count(*) from Products
--@ Products tablosundaki satır sayısını seç

Select count(*) Adet from Products where CategoryId = 2
--@ Products tablosundaki CategoryId=2 olan satır sayısını seç ve degeri adet adlı kolonda tut

select categoryId , count(*) sayısı from Products group by CategoryID
--@ Product tablosundan CategoryId kolonunu seç ve bu kolonu tekrar etmeyecek şekilde sırala 
--@ count(*) komutu categoryId nin her verisinden kaç adet var, "sayısı" kolonunda göster

select categoryId , count(*) sayısı from Products group by CategoryID having count(*) < 10 
--@ önceki komuttan farklı olarak having komutu kullanılmıştır, önceki kodun sayısı kolonun çıktılarından 10 üzeri olanları seç
--@ Having kümülatif dataya yazılan koşuldur

select avg(UnitsInStock) ortalama from Products 
--@ Products Tablosundaki UnitsInStock kolonundaki tüm verilerin ortalamasını "ortalama" adlı sütunda göster 

select sum(UnitsInStock) toplam from Products 
--@ Products Tablosundaki UnitsInStock kolonundaki tüm verilerin toplamını "toplam" adlı sütunda göster 

--@*Not: Bir sorguda önce where çalışır

select Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName
from Products inner join Categories on Products.CategoryId = Categories.CategoryId
 --@ Products tablosunu Categories tablosu ile 
 --@ Products tablosundaki CategoryId'yi , Category Tablosundaki CategoryId'ye eşitleyerek birleştir.
 --@ Çıkan yeni tablodan Products tablosuna ait ProductId, ProductName, UnitPrice ve
 --@ Categori tablosuna ait CategoryName kolonlarını seç
 --@ *Not:  Tabloları birleştirme işlemine (join) Data Transformation object (DTO) denir

 select * from Products p left join [Order Details] od on p.ProductID = od.ProductID
 --@ Solda Products tablosu olacak şekilde [Order Details] tablosu ile p.ProductId = od.ProductId  şartını sağlayan tüm satırları ve
-- @ Solda taraftaki tabloda kayıt olan tüm satırları seç sağ taraftaki tabloda karşılığı yoksa değerini null göster
-- @ *Not: Boşluk ile tanımlanan tablo adları köşeli parantezlerle çağrılır [Order Details] 

 select od.ProductID from Products p left join [Order Details] od on p.ProductID = od.ProductID WHERE od.ProductID is null
 --@ Bir önceki komutta sağ taraftaki tabloda ProductId si null olan kayıtları seç
 --@ * Not: Null değeri tespit etmek için Where koşulu primary key'e uygulanır 

 select * from Products p right join [Order Details] od on p.ProductID = od.ProductID
 --@ left  joinin tam tersi mantığa sahiptir. sağdaki tabloda varsa veri getirilir soldaki karşılığı yoksa null değerini alır

select * from Products p inner join [Order Details] od on p.ProductID = od.ProductID
inner join Orders o on o.OrderID = od.OrderID
--@ birden fazla inner join kullanımı

