package com.gamingroom;

public class Entity {
	private long id;
	private String name;
	

	protected Entity() {
		
	}
	
	public Entity(long id, String name) {
		this();
		this.id = id;
		this.name = name;
	
	}
	
	public long getId() {
		return id;
		
	}
	
	public String getName() {
		return name;
		
		
	}
	
	
	// toString returns game data from Game Object
	public String toString() {
		
		return "Game [id=" + id + ", name=" + name + "]";
	}
}
