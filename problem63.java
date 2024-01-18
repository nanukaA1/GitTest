import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import acm.program.ConsoleProgram;

public class problem63 extends ConsoleProgram{
	private static final String SENTINEL = "";
	public void run() {
		Map<String, ArrayList<String>> friendLists = 
				new HashMap<String, ArrayList<String>> ();
//		gio -> [mari, ele, ale]
		while(true) {
			String friend = readLine("name of a friend: ");
			if(friend.equals(SENTINEL)) {
				break;
			}
			String person = readLine("name of a person: ");
			
			
			if(!friendLists.containsKey(person)) {
				friendLists.put(person, new ArrayList<String>());
			}
			
			ArrayList<String> currFriends = friendLists.get(person);
			currFriends.add(friend); // TODO add check for duplicates
			
			// we don't need to call put again
//			friendLists.put(person, currFriends);
			
		}
		
	
		println(friendLists);
		
		int maxFriends = 0;
		String popularPerson = null;
		
		for(String person: friendLists.keySet()) {
			int friendCount = friendLists.get(person).size();
			if(friendCount > maxFriends) {
				maxFriends = friendCount;
				popularPerson = person;
			}
		}
		
		println("Person with most friends: " + popularPerson);		
		
	}

}