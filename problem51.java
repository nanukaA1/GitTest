import acm.program.ConsoleProgram;

public class problem51 extends ConsoleProgram{
	public void run() {
		String input = "aaabbbccc";
        int n = 3;
        String result = removeNplet(input, n);
        System.out.println(result);
	}
	
	 public static String removeNplet(String input, int n) {
	       

	        // Iterate through the string to find and remove nplets
	        for (int i = 0; i <= input.length() - n; i++) {
	            // Check if the current substring is an nplet
	           if(input.charAt(i) == input.charAt(i+1)) {
	        	   int b = i;
	           }

	            // If it's an nplet, remove it and recursively call the method
	           
	                String newInput = input.substring(0, b) + input.substring(b + n);
	                return removeNplet(newInput, n);
	            
	        }

	        // If no more nplets are found, return the modified string
	        return input;
	    }
}