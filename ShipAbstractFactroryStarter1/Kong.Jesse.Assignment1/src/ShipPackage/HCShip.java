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
public class HCShip extends Ship{
	
	
	ShipFactory shipFactory;

        
	
	public HCShip(ShipFactory shipFactory){
                this.shipFactory = shipFactory;
	}

	// EnemyShipBuilding calls this method to build a 
	// specific HCShip
	
	public void equipShip() {
		
		System.out.println("Adding equipments to Halifax Class ship " + getName());
		// Insert code to populate weapon and engine with suitable ones
                weapon = shipFactory.addGun();
                engine = shipFactory.addEngine();
                
	}	
}