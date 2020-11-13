public class Converter
{
	public static void main(String[] params)
	{
		System.out.println("Main invoked");
		//String convParams=params[0];	
		
		String convParams="58";
		byte convByte=Byte.parseByte(convParams);
		System.out.println("Converted byte= "+convByte);
		
		String convParams1="30000";
		short convShort=Short.parseShort(convParams1);
		System.out.println("Converted short= "+convShort);
		
		String convParams2="1500000";
		int convInt=Integer.parseInt(convParams2);
		System.out.println("Converted int= "+convInt);
		
		String convParams3="300000000";
		long convLong=Long.parseLong(convParams3);
		System.out.println("Converted long= "+convLong);
		
		String convParams4="99.2f";
		float convFloat=Float.parseFloat(convParams4);
		System.out.println("Converted float= "+convFloat);
		
		String convParams5="1234.5678";
		double convDouble=Double.parseDouble(convParams5);
		System.out.println("Converted double= "+convDouble);
		
		String convParams6="True";
		boolean convBoolean=Boolean.parseBoolean(convParams6);
		System.out.println("Converted boolean= "+convBoolean);
		
		String convParams7="Charger";
		char convChar=convParams7.charAt(4);
		System.out.println("Converted char= "+convChar);
		
		System.out.println("Main end");
	}

}