/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShipPackage;
import ShipEquipments.Engine;
import ShipEquipments.Weapon;

/**
 *
 * @author Rama
 */
public abstract class Ship {
	
	private String name;
	
	// Newly defined objects that represent weapon & engine
	// These can be changed easily by assigning new parts 
	// in HCShipFactory or CSCShipFactory
	
	Weapon weapon;
	Engine engine;
	
	public String getName() { return name; }
	public void setName(String newName) { name = newName; }
	
	public abstract void equipShip();
	
	// Because the toString method is defined in engine
	// when it is printed the String defined in toString goes
	// on the screen
	
	public void displyShipSpeed(){
		
		System.out.println(getName() + " Engine: " + engine );
		
	}
	
	public void shipGunDesc(){
		
		System.out.println(getName() + " Gun: " + weapon);
		
	}
	
	// If any Ship object is printed to screen this shows up
	
	public String toString(){
		
		String infoOnShip = "The " + name + " with " + engine + 
				" and has  " + weapon;
		
		return infoOnShip;
		
	}
	
}

