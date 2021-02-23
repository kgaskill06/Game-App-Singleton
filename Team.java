package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A simple class to hold information about a team
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a team is
 * created.
 * </p>
 * @author coce@snhu.edu
 *
 */


//inherits from Entity class
public class Team extends Entity {

	
	/*
	 * Constructor with an identifier and name
	 */
	public Team(long id, String name) {
		super(id, name);
	}


	@Override
	public String toString() {
		return "Team [id=" + super.getId() + ", name=" + super.getName() + "]";
	}
	
	/*
	 *Player list object to store players that can be added to team.
	 */

	private static List<Player> players = new ArrayList<Player>();
	
	
	//Add player method that uses an iterator to see if a player name already exists.
	public Player addPlayer(String name) {
		
		//Null local instance of player
		Player player = null;
		
		//Iterator
		Iterator<Player> iteratorPlayer = players.iterator();
		
		while (iteratorPlayer.hasNext()) {
			
			//creates player from iterator when there is a unique name
			Player playerInstance = players.iterator().next();
			
			//if check to see if name exists ignores case.
			if (playerInstance.getName().equalsIgnoreCase(name)) {
				player = playerInstance;
				
			}
			
			// Adds player if name does not exist (still null)
			if (player == null) {
				players.add(player);
			}
			
			
		}
		
		return player;
		
	}
	

}
