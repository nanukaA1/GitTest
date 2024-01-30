import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

import acm.graphics.GImage;
import acm.program.ConsoleProgram;

public class sIMDB extends ConsoleProgram {
	private HashMap<String, HashSet<String>> movieActors;
	private HashMap<String, HashSet<String>> actorMovies;

	public sIMDB() {

	}

	public void addMovie(String title) {
		movieActors.putIfAbsent(title, new HashSet<>());
	}

	public void addActor(String movieTitle, String actor) {
		if (!movieActors.containsKey(movieTitle)) {
			return;
		}
		movieActors.get(movieTitle).add(actor);
		actorMovies.putIfAbsent(actor, new HashSet<>());
		actorMovies.get(actor).add(movieTitle);
	}

	public Iterator<String> getMovies(String actor) {
		if (!actorMovies.containsKey(actor)) {
			return null;
		}
		return actorMovies.get(actor).iterator();
	}

	public Iterator<String> getCommonMovies(String actor1, String actor2) {
		HashSet<String> commonMovies = new HashSet<>();
		for (String movie : actorMovies.get(actor1)) {
			if (actorMovies.get(actor2).contains(movie)) {
				commonMovies.add(movie);
			}
		}
		return commonMovies.iterator();
	}

	public Iterator<String> getCast(String movie, int n){
		 HashSet<String> cast = new HashSet<>();
		 HashSet<String, HashSet> cast = new HashSet<>();
		 int maxSize = 0;
		 String maxActor = "";
		 while(n>0){
			 for(String actor : actorMovies.keySet()){
				 if(movieActors.get(movie).contains(actor)){
				 if(actorMovies.get(actor).size() > maxSize ) {
					 maxSize = actorMovies.get(actor).size();
					 maxActor = actor;
				 }}
				 cast.add(maxActor);
				 
			 }
			 n--;
		 }
		 return cast.iterator();
	}

}
