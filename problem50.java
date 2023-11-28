import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

//დაწერეთ მეთოდი რომელიც გადაცემული ტექსტიდან შლის დუბლირებულ სიმბოლოებს,
//ანუ თუ ტექსტიში რომელიმე სიმბოლო მეორდება, უნდა დარჩეს მხოლოდ ყველაზე მარცხენა.
public class problem50 extends ConsoleProgram {
	public void run() {

		String text = readLine();
		println(isInAscendingOrder(text));
	}

	private Boolean isInAscendingOrder(String text) {
		 char prevChar = 'a'; // Starting with 'a'
	        for (char currentChar : text.toCharArray()) {
	            if (Character.isLowerCase(currentChar)) {
	                if (currentChar < prevChar) {
	                    return false;
	                }
	                prevChar = currentChar;
	            }
	        }
	        return true;
	}

	

}
