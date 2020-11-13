public class GradeStatus
{
	public static void status(String params)
	{
		System.out.println("Invoked status method");
		System.out.println(" ");
	}
	
	public static void status(String name,String name1)
	{
		System.out.println("Invoked 'status' with two parameters ");
		System.out.println("Invoked type is String and String");
		System.out.println("Student name: "+name);
		System.out.println("Student name: "+name);
		System.out.println(" ");
	}
	
	public static void status(String name,char grade)
	{
		System.out.println("Invoked 'status' with two parameters ");
		System.out.println("Invoked type is String and char");
		System.out.println("Name: "+name);
		System.out.println("Grade: "+grade);
		System.out.println(" ");
	}
	
	public static void status(char grade,String name)
	{
		System.out.println("Invoked 'status' with two parameters ");
		System.out.println("Invoked type is char and String");
		System.out.println("Grade: "+grade);
		System.out.println("Name: "+name);
	}
}