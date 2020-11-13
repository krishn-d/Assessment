public class ArrayDisplay
{
	public static void main(String[] data)
	{
		String[] states={"Karnataka","Maharastra","Kerala","Tamilnadu","Andrapradesh"};
		int sizeOfArray=states.length;
		System.out.println("Size of Array= "+sizeOfArray);
		int printState;
		for(printState=0;printState<sizeOfArray;printState++)
		{
			System.out.println(states[printState]);
		}
	}
}