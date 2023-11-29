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
		 char ch = 'a'; 
	        for (int i = 0; i < text.length(); i++) {
	            if (isLowerCase(text.charAt(i))) {
	                if (i < ch) {
	                    return false;
	                }
	                ch = text.charAt(i);
	            }
	        }
	        return true;
	}

	

}
