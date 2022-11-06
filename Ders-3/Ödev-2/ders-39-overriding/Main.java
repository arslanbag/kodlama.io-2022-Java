
public class Main {

	public static void main(String[] args) 
	{
		BaseKrediManager[] krediManagers = new BaseKrediManager[]
		{
				new OgretmenKrediManager(),
				new TarimKrediManager(),
				new OgrenciKrediManager(),
		};
		
		for (BaseKrediManager arrayBaseKrediManager : krediManagers) 
		{
			System.out.println(arrayBaseKrediManager.hesapla(1000));
		}
	}

}
