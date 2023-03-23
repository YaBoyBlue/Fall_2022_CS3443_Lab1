/**
 * Lab1 is a Java class containing a main method to run your program when completed.
 * This class will not compile until you have completed the requirements outlined in 
 * the lab description.
 * 
 * @author Amanda Fernandez (abc123)
 * UTSA CS 3443 - Lab 1
 * Fall 2022
 */
public class Lab1 {
	
	public static void main( String[] args ) {
		
		// Initialize a new Mission with a mission name, operator, year, and mission type.
		Mission apollo11 = new Mission( "Apollo 11", "NASA", 1969, "Crewed lunar landing" );
		
		// Initialize new crew members
		Astronaut neil = new Astronaut( "Neil Armstrong", "Commander" );
		Astronaut collins = new Astronaut( "Michael Collins", "Commander Module Pilot (CMP)" );
		Astronaut buzz = new Astronaut( "Edwin Buzz Aldrin Jr.", "Lunar Module Pilot" );
		
		// Add crew members to mission
		apollo11.addCrewMember( neil );
		apollo11.addCrewMember( collins );
		apollo11.addCrewMember( buzz );
		
		// Initialize new spacecrafts and add to mission
		Spacecraft columbia = new Spacecraft( "Columbia", "Command Module", 107 );
		Spacecraft eagle = new Spacecraft( "Eagle", "Lunar Module", 5 );
		apollo11.addSpacecraft( columbia );
		apollo11.addSpacecraft( eagle );
		
		
		
		// Initialize a new Mission with a mission name, operator, year, and mission type.
		Mission apollo13 = new Mission( "Apollo 13", "NASA", 1970, "Crewed lunar landing attempt" );
		
		// Initialize new crew members
		Astronaut lovell = new Astronaut( "James Lovell Jr.", "Commander" );
		Astronaut jack = new Astronaut( "Jack Swigert Jr.", "Commander Module Pilot (CMP)" );
		Astronaut haise = new Astronaut( "Fred Haise Jr.", "Lunar Module Pilot" );
		
		// Add crew members to mission
		apollo13.addCrewMember( lovell );
		apollo13.addCrewMember( jack );
		apollo13.addCrewMember( haise );
		
		// Initialize new spacecrafts and add to mission
		Spacecraft odyssey = new Spacecraft( "Odyssey", "Command and Service Module", 109 );
		Spacecraft aquarius = new Spacecraft( "Aquarius", "Lunar Module", 7 );
		apollo13.addSpacecraft( odyssey );
		apollo13.addSpacecraft( aquarius );
		
	

		// Print to the console
		System.out.println( apollo11 + "\n");
		System.out.println( apollo13 );
	}
}