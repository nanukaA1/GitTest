import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class problem60 extends ConsoleProgram{
	public void run(){
		ArrayList<Integer> list = new ArrayList<>();
		while(true){
			int n = readInt("Enter number: ");
			if(n == -1){
				break;
			}
			list.add(0, n);
		}
		for(int next : list){
			println(next);
		}
	}
}