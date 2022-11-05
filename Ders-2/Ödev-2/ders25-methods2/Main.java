package methods2;

public class Main {

	public static void main(String[] args) 
	{
		//substring 
		String mesaj = "Bugün Hava Çok Güzel";
		String yeniMesaj = mesaj.substring(0,2);
		
		//Call return string method
		String sehir = sehirVer();
		
		//Call return int method
		int topla = topla(10, 15);
		
		//Call return int Arguments method
		int toplaArguments = toplaArguments(10, 15, 20 ,30);
		
		//Print console
		System.out.println(yeniMesaj);
		System.out.println(sehir);
		System.out.println(topla);
		System.out.println(toplaArguments);
		
		
	}
	
	public static int topla(int a, int b) 
	{
		return a+b;
	}
	
	public static int toplaArguments(int... sayilar) 
	{
		int toplam = 0;
		for(int arraySayi : sayilar) 
		{
			toplam += arraySayi;
		}
		return toplam; 
	}
	
	public static String sehirVer() 
	{
		return "Ankara";
	}

}
