/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShipBuildPackage;
import ShipPackage.Ship;

/**
 *
 * @author Rama
 */
public abstract class ShipBuilding {	
 
	protected abstract Ship makeCanadianShip(String typeOfShip);

	public Ship orderTheShip(String typeOfShip) {
		Ship theShip = makeCanadianShip(typeOfShip);
		theShip.equipShip();
		return theShip;
		
	}
}

