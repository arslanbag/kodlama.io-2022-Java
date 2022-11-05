package methods;

public class Main 
{
	public static void main(String[] args) 
	{
		sayiBulmaca();
	}
	
	public static void sayiBulmaca() 
	{
		int [] sayilar = new int[] {1,2,5,9,7,0};
		int aranacak = 6;
		boolean varMi  = false;
		
		for(int sayi : sayilar ) 
		{
			if(sayi == aranacak) 
			{
				varMi = true;
				break;
			}
		}
		
		String varMiOut = "Sayi bulunamadı :";
		if(varMi) 
		{
			varMiOut = "Sayı Bulundu :";
		}
		
		mesajVer(varMiOut + aranacak);
		
	}
	
	public static void mesajVer(String varMiOut) 
	{
		System.out.println(varMiOut);
	}
}
