package Entities;

public class Course 
{
	//field
		int id;
		String name; 
		short lessonCount;
		double price;
		
		//Constructor Parameter
		public Course(int id, String name, short lessonCount, double price) 
		{
			super();
			this.id = id;
			this.name = name;
			this.lessonCount = lessonCount;
			this.price = price;
		}
	

		//Constructor
		public Course(){}

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
		
		//lessonCount
		public short getLessonCount() 
		{
			return lessonCount;
		}
		public void setLessonCount(short lessonCount) 
		{
			this.lessonCount = lessonCount;
		}
		
		//Price
		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}
		
}
