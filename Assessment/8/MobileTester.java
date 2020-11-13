public class MobileTester
{
	public static void main(String[] params)
	{
		System.out.println("Main invoked");	
		
		Mobile.call("Chandler","Joey");
		Mobile.call("Monica",4);
		Mobile.call(3,"Pheobe");
		
		System.out.println("Exit :: main");	
	}
}