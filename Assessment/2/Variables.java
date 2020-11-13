//Syntax of variable declaring: data_type variableName

//There are 2 types of data-types: 	1. Primitive data-types
//									2. Class (Non-Primitive)

//Primitive data-types are,
//						1. byte		1 byte		Stores whole numbers from -128 to 127
//						2. short	2 bytes		Stores whole numbers from -32,768 to 32,767
//						3. int		4 bytes		Stores whole numbers from -2,147,483,648 to 2,147,483,647
//						4. long		8 bytes		Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
//						5. float	4 bytes		Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
//						6. double	8 bytes		Stores fractional numbers. Sufficient for storing 15 decimal digits
//						7. boolean	1 bit		Stores true or false values
//						8. char		2 bytes		Stores a single character/letter or ASCII values
//						
//Non-Primitive or Class data-types are,
//						1. String
//						2. String[]
						
//Ex.: 
public class Variables
{
	public static void main(String[] primitives)
	{
		byte numberOfSecondsInAMinute;
		numberOfSecondsInAMinute=60;
		
		short numberOfSecondsInAHour;
		numberOfSecondsInAHour=3600;
		
		int numberOfSecondsInAYear;
		numberOfSecondsInAYear=31536000;
		
		long numberOfSecondsIn10Years;
		numberOfSecondsIn10Years=315360000;
		
		float valueOfPie;
		valueOfPie=3.14f;
		
		double oneHorsepowerInWatts;
		oneHorsepowerInWatts=735.499;
		
		boolean plantsAreLivingThings;
		plantsAreLivingThings=true;
		
		char grade;
		grade='A';
		
		string name;
		name="Chandler";
	}
}