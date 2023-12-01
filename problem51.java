import acm.program.ConsoleProgram;

public class problem51 extends ConsoleProgram{
	public void run() {
	
			 String input = "aabbbbcc";
		        int n = 3;
		        String result = compresse(input);
		        println(result);
		
	}
	
	private String compresse(String input) {
		String newText = "";
		char currentChar = input.charAt(0);
		int count = 0;
       for(int i =1 ; i < input.length()+1; i++) {
    	   if (input.charAt(i) == currentChar) {
               count++;
           } else {
        	   newText = "" + count + currentChar;
        	   currentChar = input.charAt(i);
        	   count = 0;
           }
       }
       return newText;
    }
}