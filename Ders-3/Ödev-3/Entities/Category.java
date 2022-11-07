package Entities;

public class Category 
{
	//field
		int id;
		String name; 
		String url;
		
		//Constructor parameter
		public Category(int id, String name, String url) 
		{
			this.id = id;
			this.name = name;
			this.url = url;
		}
		
		//Constructor
		public Category() 
		{
			
		}

		//id
		public int getId() 
		{
			return id;
		}
		public void setId(int id) 
		{
			this.id = id;
		}
		
		//name
		public String getName() 
		{
			return name;
		}
		public void setName(String name) 
		{
			this.name = name;
		}
		
		//url
		public String getUrl() 
		{
			return url;
		}

		public void setUrl(String url) 
		{
			this.url = url;
		}
		
}
