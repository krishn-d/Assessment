// Array	:	An array is a data structure, which can store a fixed-size collection of elements of the same data type, 
//				Array is used to store a collection of data, but it is often more useful to think of an array as a collection of variables of the same type.

//Ex.
public class ArrayEx
{
	public static void main(String[] boxes)
	{
		System.out.println("invoked main method by JVM");
		arrayOfEmail();
		System.out.println("exiting main method by JVM");
	}
	public static void arrayOfEmail()
	{
		 System.out.println("invoked arrayOfEmail");
	
		 String contactEmail="contact@X-workz.in";
		 String subscribeEmail="subscribe@X-workz.in";
		 String hrEmail="vinay@x-workz.in";
	     
		 String[] emails={contactEmail,subscribeEmail,hrEmail,"akshara@x-workz.in"};
		 int sizeOfArray=emails.length;
		 System.out.println("Total elements "+sizeOfArray);
		  
		 String elementAtIndex1=emails[1];
		 System.out.println("Element at index one "+elementAtIndex1);
		 
		 String elementAtIndex3=emails[3];
		 System.out.println("Element at index three "+elementAtIndex3);
		 
		 String elementAtIndex4=emails[1];
		 System.out.println("Element at index four "+elementAtIndex4);
	
	}	
}