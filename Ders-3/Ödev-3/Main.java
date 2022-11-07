import java.util.ArrayList;
import Business.CategoryManager;
import Business.CourseManager;
import Business.InstructorManager;
import Core.Log.ConsoleLogger;
//import Core.Log.DatabaseLogger;
import Core.Log.Logger;
import DataAccess.Hibernate.HibernateCategoryDao;
import DataAccess.Hibernate.HibernateInstructorDao;
import DataAccess.Jbdc.JbdcCourseDao;
import Entities.Category;
import Entities.Course;
import Entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception 
	{
	/*Logger --------*/
		Logger[] loggers ={new ConsoleLogger()};// add  new DatabaseLogger()
		Logger[] emptyLoggers = {};//log kaydı !tutmamak için
		
	/*CATEGORY--------*/
		//CategoryManager
		CategoryManager categoryManager = new CategoryManager(loggers,new HibernateCategoryDao());
		
		//Categories
		ArrayList<Category> categories = new ArrayList<Category>();
		
		//Create and Add - Category 
		//*1
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Kariyer");
		category1.setUrl("/career");
			//manager
			categoryManager.add(category1, categories);
			//updateCategories
			categories.add(category1);
		
		//*2
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Tüm Kurslar");
		category2.setUrl("/all-courses");
			//manager
			categoryManager.add(category2, categories);
			//updateCategories
			categories.add(category2);
			
		//test Dao
			
			/*update category2*/
			//categories.remove(category2);
			//category2.setName("Kurslar");
			//categoryManager.update(category2,categories);
			//categories.add(category2);
			
			/*delete category2*/
			//categoryManager.delete(category2);
		
	/*COURSE-------- */
		//CourseManager
		CourseManager courseManager = new CourseManager(emptyLoggers,new JbdcCourseDao());
		
		//Courses
		ArrayList<Course> courses = new ArrayList<Course>();
		
		//Create and Add - Course 
		//*1
		Course course1 = new Course(1,"Java",(short)1,(double)100);
			//manager
			courseManager.add(course1, courses);
			//updateCategories
			courses.add(course1);
		
		//*2
		Course course2 = new Course(2,"C#",(short)5,(double)0);
			//manager
			courseManager.add(course2, courses);
			//updateCategories
			courses.add(course2);
			
		//test Dao
			
			/*update course2*/
			//courses.remove(course2);
			//course2.setName("C#Update");
			//course2.setLessonCount((short)10);
			//course2.setPrice((double)50);
			//courseManager.update(course2,courses);
			//courses.add(course2);
			
			/*delete course2*/
			//courseManager.delete(course2);
			
	/*INSTRUCTOR-------- */
		//InstructorManager
		InstructorManager instructorManager = new InstructorManager(emptyLoggers,new HibernateInstructorDao());
		
		//Create and Add - Instructor 
		//*1
		Instructor instructor1 = new Instructor(1,"Engin","Demiroğ");
			//manager
			instructorManager.add(instructor1);
		//*2
		Instructor instructor2 = new Instructor(2,"Aykut","Arslanbağ");
			//manager
			instructorManager.add(instructor2);
		
		//test Dao
			
			/*update*/
			//instructor2.setName("AykutUpdate");
			//instructor2.setLastName("ArslanbağUpdate");
			//instructorManager.update(instructor2);
			
			/*delete*/
			//instructorManager.delete(instructor2);
	}

}
