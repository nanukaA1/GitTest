import acm.program.ConsoleProgram;

public class problem51 extends ConsoleProgram{
	public void run() {
		while(true) {
			 String input = "aaabbbccc";
		        int n = 3;
		        String result = removeNplet(input, n);
		        println(result);
		}
	}
	
	public static String removeNplet(String input, int n) {
        // Check if the length of the input string is less than n
        if (input.length() < n) {
            return input;
        }

        // Iterate through the string to find and remove nplets
        for (int i = 0; i <= input.length() - n; i++) {
            // Check if the current substring is an nplet
            boolean isNplet = true;
            for (int j = 1; j < n; j++) {
                if (input.charAt(i) != input.charAt(i + j)) {
                    isNplet = false;
                    break;
                }
            }

            // If it's an nplet, remove it and recursively call the method
            if (isNplet) {
                String newInput = input.substring(0, i) + input.substring(i + n);
                return removeNplet(newInput, n);
            }
        }

        // If no more nplets are found, return the modified string
        return input;
    }
}