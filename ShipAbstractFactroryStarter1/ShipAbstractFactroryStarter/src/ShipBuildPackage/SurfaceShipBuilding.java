/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShipBuildPackage;
import ShipFactoryPackage.CSCShipFactory;
import ShipFactoryPackage.HCShipFactory;
import ShipPackage.Ship;
import ShipPackage.HCShip;
import ShipPackage.CSCShip;
import ShipFactoryPackage.ShipFactory;

/**
 *
 * @author Rama
 */
// This is the only class that needs to change, if you
// want to determine which enemy ships you want to
// provide as an option to build

public class SurfaceShipBuilding extends ShipBuilding {
        @Override
	protected Ship makeCanadianShip(String typeOfShip) {
		Ship theCanadianShip = null;
		if(typeOfShip.equals("HC")){
			ShipFactory shipPartsFactory = new HCShipFactory();
			theCanadianShip = new HCShip(shipPartsFactory);
			theCanadianShip.setName("HMCS Ottawa");	
                        System.out.println("Created Halifax Class ship " + theCanadianShip.getName()); 
		} else 
			
		if(typeOfShip.equals("CSC")){
			ShipFactory shipPartsFactory = new CSCShipFactory();
			theCanadianShip = new CSCShip(shipPartsFactory);
			theCanadianShip.setName("HMCS CSC001");
                        System.out.println("Created Canadian Surface Combatant ship " + theCanadianShip.getName());
			
		} 	
	return theCanadianShip;
	}
}

