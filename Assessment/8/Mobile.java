public class Mobile 
{
	public static void call(String contact)
	{
		System.out.println("Invoked call");
		System.out.println(" ");
	}
	
	public static void call(String contact1,String contact2)
	{
		System.out.println("Invoked 'call' with two parameters ");
		System.out.println("Invoked type is String and String");
		System.out.println("Contact: "+contact1);
		System.out.println("Contact: "+contact2);
		System.out.println(" ");
	}
	
	public static void call(String contact3,int noOfCalls)
	{
		System.out.println("Invoked 'call' with two parameters ");
		System.out.println("Invoked type is String and int");
		System.out.println("Contact: "+contact3);
		System.out.println("No. of calls: "+noOfCalls);
		System.out.println(" ");
	}
	
	public static void call(int noOfCalls,String contact4)
	{
		System.out.println("Invoked 'call' with two parameters ");
		System.out.println("Invoked type is int and String");
		System.out.println("No. of calls: "+noOfCalls);
		System.out.println("Contact: "+contact4);
	}
}