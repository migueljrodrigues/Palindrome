import java.util.*;

public class Palimdrome {

	public static void main(String[] args) {
		
		Scanner capture = new Scanner(System.in);
		
		System.out.print("Write a word and see if it is a palymdrome: ");
		
		String myWord = capture.nextLine();
		
		//Criar class palyndrome
		
		Boolean answer = isPalyndrome.testPal(myWord);

		if(answer == true)
		{
			System.out.println("It's a palyndrome!");
		}
		else
			System.out.println("It's NOT a palyndrome!");
	}

}
