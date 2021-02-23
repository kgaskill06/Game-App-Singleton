package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A simple class to hold information about a game
 * 
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a game is
 * created.
 * </p>
 * 
 * @author coce@snhu.edu
 *
 */

//inherits from Entity class
public class Game extends Entity {

	
	/**
	 * Hide the default constructor to prevent creating empty instances.
	 */
	private Game() {
		
	}
	
	//Array List object of Team Class to store unique teams with players.
	private static List<Team> teams = new ArrayList<Team>();

	/**
	 * Constructor with an identifier and name
	 */
	public Game(long id, String name) {
		super(id, name);	
		
		
	}
	
	public Team addTeam(String name) {
		
		//null local instance of Team Name
		Team team = null;
		
		/*
		 * Iterator to check for existing names and will create new ones when found to be false.
		 */
		Iterator<Team> iteratorTeams = teams.iterator();
		
		while (iteratorTeams.hasNext()) {
			Team teamInstance = iteratorTeams.next();
			
			//if check for team existing or unique
			if (teamInstance.getName().equalsIgnoreCase(name)) {
				team = teamInstance;
				
			}
			
			// Adds team to list if it does not exists (still null) 
			if (team == null) {
				teams.add(team);
			}
					
		}
		
		return team;
	}
	

	@Override
	public String toString() {
		
		return "Game [id=" + super.getId() + ", name=" + super.getName() + "]";
	}

}
