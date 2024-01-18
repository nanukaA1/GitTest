import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import acm.program.ConsoleProgram;

public class problem63_64_65_66 extends ConsoleProgram{
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
			currFriends.add(friend); 
		}
		
	
		println(friendLists);
		
		int max = 0;
		String popularPerson = null;
		
		for(String person: friendLists.keySet()) {
			int friends = friendLists.get(person).size();
			if(friends > max) {
				max = friends;
				popularPerson = person;
			}
		}
		
		println("the most popular person: " + popularPerson);
		
		ArrayList<String> friendList1, friendList2;
		for(String person: friendLists.keySet()) {
			friendList1 = friendLists.get(person);
			for(String person1: friendLists.keySet()) {
				friendList2 = friendLists.get(person1);
				if(person.equals(person1)) {
					continue;
				}
				if(hasCommonFriend(friendList1, friendList2)) {
					println(person + " " + person1);
				}
			}
		}
		
	}
	private boolean hasCommonFriend(ArrayList<String> friendList1, ArrayList<String> friendList2) {
		for (String friend : friendList1) {
			if (friendList2.contains(friend))
				return false;
		}
		return true;
	}
}