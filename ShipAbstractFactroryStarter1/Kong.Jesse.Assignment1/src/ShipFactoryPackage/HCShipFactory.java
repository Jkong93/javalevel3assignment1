/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShipFactoryPackage;
import ShipEquipments.HCEngine;
import ShipEquipments.Engine;
import ShipEquipments.Weapon;
import ShipEquipments.HCGun;

/**
 *
 * @author Rama
 */
// This factory uses the ShipFactory interface
// to create very specific Surface Ship (here Halifax Class Ship)

// This is where we define all of the parts the ship
// will use by defining the methods implemented
// being Weapon and Engine

// The returned object specifies a specific weapon & engine

public class HCShipFactory implements ShipFactory{

	// Defines the weapon object to associate with the ship
	@Override
	public Weapon addGun() {
		//Add the required code here
                return new HCGun();
	}

	// Defines the engine object to associate with the ship
	@Override
	public Engine addEngine() {
		//Add the required code here
                return new HCEngine();
	}
}