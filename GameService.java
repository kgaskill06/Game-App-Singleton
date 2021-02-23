package com.gamingroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * A singleton service for the game engine
 * 
 * @author coce@snhu.edu
 */
public class GameService {

	/**
	 * A list of the active games
	 */
	private static List<Game> games = new ArrayList<Game>();

	/*
	 * Holds the next game identifier
	 */
	private static long nextGameId = 1;
	
	private static long nextTeamId = 1;
	
	private static long nextPlayerId = 1;

	// Game Service Singleton reference
	private static GameService newSingleton = null;
	
	//constructor for Singleton Service
	private GameService() {
		
	}
	
	/*
	 * If/else Method check to see if instance of the Singleton Game Service has been created. 
	 * If it has not, it creates one and outputs it has been created, else it outputs it 
	 * already exists.
	 */
	public static GameService getInstance() {
		if (newSingleton == null) {
			newSingleton = new GameService();
			System.out.println("New Game Service instance created.");
		}
		
		else {
			System.out.println("Game Service instance already exists.");
		}
		
		return newSingleton;
	}

	/**
	 * Construct a new game instance
	 * 
	 * @param name the unique name of the game
	 * @return the game instance (new or existing)
	 */
	public Game addGame(String name) {

		// a local game instance
		Game game = null;

		// Use iterator to look for existing game with same name
		// if found, simply return the existing instance
		Iterator<Game> iteratorGames = games.iterator();
		
		//While loop iteration for ArrayList of Games
		while (iteratorGames.hasNext()) {
			Game gameInstances = iteratorGames.next();		
			
			//if loop to find games with similar name that will ignore case
			if (gameInstances.getName().equalsIgnoreCase(name)) {
				return gameInstances;
				
			}
			
			
		}

		// if not found, make a new game instance and add to list of games
		if (game == null) {
			game = new Game(nextGameId++, name);
			games.add(game);
		}

		// return the new/existing game instance to the caller
		return game;
		
	}

	/**
	 * Returns the game instance at the specified index.
	 * <p>
	 * Scope is package/local for testing purposes.
	 * </p>
	 * @param index index position in the list to return
	 * @return requested game instance
	 */
	Game getGame(int index) {
		return games.get(index);
	}
	
	
	/**
	 * Returns the game instance with the specified id.
	 * 
	 * @param id unique identifier of game to search for
	 * @return requested game instance
	 */
	public Game getGame(long id) {

		// a local game instance
		Game game = null;
		
		// iterator
		Iterator<Game> iteratorGames = games.iterator();

		// Use iterator to look for existing game with same id
		// if found, simply assign that instance to the local variable
		while (iteratorGames.hasNext()) {
			Game gameInstances = iteratorGames.next();
			
			//if game instance ID == existing game with same ID checker
			if (gameInstances.getId() == id) {
				game = gameInstances;
				
				return gameInstances;
				
			}
		
		}
		

		return game;
	}

	/**
	 * Returns the game instance with the specified name.
	 * 
	 * @param name unique name of game to search for
	 * @return requested game instance
	 */
	public Game getGame(String name) {

		// a local game instance
		Game game = null;
		
		// iterator
		Iterator<Game> iteratorGames = games.iterator();
		
		
		// Use iterator to look for existing game with same name
		// if found, simply assign that instance to the local variable
		
		while (iteratorGames.hasNext()) {
			Game gameInstances = iteratorGames.next();
			
			/*
			 * if gameInstances Name == name iterator. Will ignore case and check if name is the same.
			 * assigns local game instance to gameInstances if it exists.
			 */
			
			if (gameInstances.getName().equalsIgnoreCase(name)) {
				game = gameInstances;
				
				return gameInstances;
			
			}
			
									
		}
		
		return game;
	}

	/**
	 * Returns the number of games currently active
	 * 
	 * @return the number of games currently active
	 */
	public int getGameCount() {
		
		return games.size();
		
	}
	
	
	// returns next Player ID
	
	public long getNextPlayerId() {
		
		return nextPlayerId;
	}
	
	
	// returns next team ID
	public long getNextTeamId() {
		
		return nextTeamId;
				
				
				
				
	}

	
	
	
}
