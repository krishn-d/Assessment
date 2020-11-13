public class GradeTester
{
	public static void main(String[] params)
	{
		System.out.println("Main invoked");	
		
		String name="Ross";
		char grade='A';
		GradeStatus.status(name,name);
		GradeStatus.status(name,grade);
		GradeStatus.status(grade,name);
		
		System.out.println("Exit :: main");	
	}
}