

public class isPalyndrome {

	private static String word;
	private static int length;
	private static int i,f;
	private static char myChar[];
	
	public static boolean printWord(String myWord) {
		
		System.out.println("My chosen word is " + myWord);
				
		return true;
	}
	public static boolean testPal (String myWord)
	{
		word = myWord;
		
		myChar = word.toCharArray();
		
		length = word.length();
		
		System.out.println("The length of the word is " + length);
		System.out.println("Now let's see if it is a palyndrome...");
			
		for( i=0, f=length-1; i<f ; i++,f--)
		{
			if(myChar[i] != myChar[f])
			{
				return false;
			}
		}
		
		return true;
	}

}
