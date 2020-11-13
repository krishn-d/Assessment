//Method		: 	Method is a collection of statements, which is used to perform logic or used to write instructions, Methods allow programmer to re-use statements.
 
//Parameters	: 	Parameters act as variables inside the method. Parameters are specified after the method name, inside the parentheses. Instructor can add as many
//					parameters as want just separating them with a comma. 
				
//Arguments		: 	An argument is a value passed to a method when the method. Whenever any method is called during the execution or runtime of the program there 
//					are some values passed with the method. These values are called arguments.
				
//Return type	:	The return type defines and constrains the data type of the value returned from method. It can int, float, etc. But the declared data-type and 
//					return value type must be same.
		
//Ex.
public class ReportStatus
{
	public static void main(String[] args) //main method and arguments passed during runtime stored in variable name "args"
	{
		System.out.println("Main invoked");
		String convParams=args[0];
		double inputPercentage=Double.parseDouble(convParams);
		System.out.println("Percentage= "+inputPercentage);
		report(inputPercentage);
		String output=ReportStatus.report(inputPercentage);
		System.out.println("Report status: "+output);
		System.out.println("Main end");
	}
	public static String report(double percentage) //this is method and method name is "report" and it is of String data-type and inside paranthesis is called as parameter. It is of double data-type
	{
		if(percentage<35 && percentage>0)
		{
			return "Fail"; //this is return value and it is also a String
		}
		if(percentage<60 && percentage>=35)
		{
			return "Second class";
		}
		if(percentage<85 && percentage>=60)
		{
			return "First class";
		}
		if(percentage<100 && percentage>=85)
		{
			return "Distinction";
		}
		return "Pass";
	}
}