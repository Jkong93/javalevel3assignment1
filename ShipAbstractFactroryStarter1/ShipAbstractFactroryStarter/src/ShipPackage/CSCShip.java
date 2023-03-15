/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShipPackage;
import ShipFactoryPackage.ShipFactory;

/**
 *
 * @author Rama
 */
public class CSCShip extends Ship{

	
	ShipFactory shipFactory;
	
	
	public CSCShip(ShipFactory shipFactory){
		
		this.shipFactory = shipFactory;
	}
	
	// EnemyShipBuilding calls this method to build a 
	// specific CSCShip

	public void equipShip() {
		
		System.out.println("Adding equipments to Canadian Surface Combatant ship " + getName());
		// Insert code to populate weapon and engine with suitable ones
		
	}	
}

