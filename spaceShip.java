import java.util.ArrayList;
import java.util.HashMap;

public class spaceShip {
	private int foodOnBoard;
	private ArrayList<String> planetsVisited; 
	private HashMap<String, Integer> crewMemberMap; 

	public spaceShip(int initialFood) {
		foodOnBoard = initialFood;
		planetsVisited = new ArrayList<>();
		crewMemberMap = new HashMap<>();
	}
	
	public void board(String crewMemberName, int foodPerDay){
		crewMemberMap.put(crewMemberName, foodPerDay);
	}
	
	public void unboard(String crewMemberName) {
		crewMemberMap.remove(crewMemberName);
	}
	
	public String getPlanetsVisited(){
		return planetsVisited.toString();
	}
	
	public boolean flyTo(String planetName, int daysRequired) {
		int requiredfood = 0;
		for(String person : crewMemberMap.keySet()){
			requiredfood += crewMemberMap.get(person) * daysRequired;
		}
		foodLeft -= requiredfood;
	}
}