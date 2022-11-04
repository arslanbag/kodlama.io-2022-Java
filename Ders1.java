package intro;

public class Main {

	public static void main(String[] args) 
	{
		//camelCase isinlendirme standardı
		String ortaMetin = "İlginizi Çekebilir";
		String altMetin = "Vade Süresi";
		
		System.out.println(ortaMetin);
	
		//Tam sayı
		int vade = 12;
		
		//Küsüratlı sayı
		double dolarDun = 18.14;
		double dolarBugun = 18.10;
		
		//İki opsiyonlu değişken
		boolean dolarDustuMu = false;
		
		//Metinsel Değişken
		String okYonu = "";
		
		//ŞartBloğu
		if(dolarBugun < dolarDun) 
		{
			okYonu = "down.svg";
			
		}
		else if(dolarBugun > dolarDun) 
		{
			okYonu = "up.svg";
		}
		else 
		{
			okYonu = "equal.svg";
		}
		
		//Ok yönünü consola yazdır
		System.out.println(okYonu);
		
		//Diziler
		String[] krediler = {"Hızlı Kredi", "Maaşını Halkbank", "Mutlu Emekli"};
		
		//Dizileri yazdır
		for (int i = 0; i < krediler.length; i++) 
		{
			System.out.println(krediler[i]);
		}
		
		
	}

}
