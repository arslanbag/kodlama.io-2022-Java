package kodlama.io.Devs.businness.concretes.validate.tools;
public class Messages 
{
	private String head; 
	public Messages(String head)
	{
		this.head = head;
	}
	

	//validateMessage
	private final String emptyName = "%s adı boş bırakılamaz , ";
	private final String repeatName = " adlı, %s kaydı mevcut , ";
	private final String isNotFound = " numaralı, %s kaydı bulunamadı , ";
	
	//successMessage
	private final String successSave = " adlı %s kaydı başarı ile gerçekleşti";
	private final String successUpdate = " adlı %s güncellemesi başarı ile gerçekleşti";
	private final String successDelete = " adlı %s kaydının silme işlemi başarı ile gerçekleşti";
	private final String successGet = " adlı %s  başarı ile getirildi";
	private final String successGetAll = "%s 'na ait tüm kayıtlar başarı ile getirildi";
	
	//errorMessage
	private final String errorSave = "kayıt başarısız oldu!";
	private final String errorUpdate = "güncelleme başarısız oldu!";
	private final String errorDelete = "silme işlemi başarısız oldu!";
	private final String errorGet = " numaralı veri getirme işlemi başarısız oldu!";
	private final String errorGetAll = "veriler getirilemedi işlemi başarısız oldu!";
	
	//PRINT MESSAGE
	public void print(String operation, String input) 
	{
		String m= "";
		switch(operation) {
		  case "successSave":
			  m =   "#✓ " + inSquareBracket(input) + replace(successSave,head);
		    break;
		  case "successUpdate":
			  m =   "#✓ " + inSquareBracket(input) + replace(successUpdate,head);
		    break;
		  case "successDelete":
			  m =   "#✓ " + inSquareBracket(input) + replace(successDelete,head);
		    break;
		  case "successGet":
			  m =   "#✓ " + inSquareBracket(input) + replace(successGet,head);
		    break;
		  case "successGetAll":
			  m =   "#✓ " + inSquareBracket(input) + replace(successGetAll,head);
		    break;
		  case "errorSave":
			  m =   ((input == "") ? "#- " : input)  +  replace(errorSave,head);
		    break;
		  case "errorUpdate":
			  m =   ((input == "") ? "#- " : input)  + replace(errorUpdate,head);
		    break;
		  case "errorDelete":
			  m =   ((input == "") ? "#- " : input) + replace(errorDelete,head);
		    break;
		  case "errorGet":
			  m =    "#- " + inSquareBracket(input) + replace(errorGet,head);
		    break;
		  case "errorGetAll":
			  m =    "#- " +inSquareBracket(input) + replace(errorGetAll,head);
		    break;

		}
		System.out.println(m);
	}
	
	//RETURN MESSAGE
	public String getString(String operation, String input) 
	{
		String m= "";
		switch(operation) {
		  case "emptyName":
			  m =   "#!" + replace(emptyName,head);
		    break;
		  case "repeatName":
			  m =   "#!" + inSquareBracket(input) + replace(repeatName,head);
		    break;
		  case "isNotFound":
			  m =   "#!" + inSquareBracket(input) + replace(isNotFound,head);
		    break;
		}
		return m;
	}
	
	//TOOLS
	//replace
	public static String replace (String message, String ...replaces) 
	{
		for(String stringReplace : replaces) 
		{	
			message = String.format(message, stringReplace);
		}
		return message;
	}
	
	//inSquareBracket
	public static String inSquareBracket (String input) 
	{
		return "["+input+"]";
	}
	
}
