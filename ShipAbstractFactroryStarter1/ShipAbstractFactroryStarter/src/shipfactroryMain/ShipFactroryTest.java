/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shipfactroryMain;
import ShipPackage.Ship;
import ShipBuildPackage.ShipBuilding;
import ShipBuildPackage.SurfaceShipBuilding;

/**
 *
 * @author Rama
 */
public class ShipFactroryTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

		ShipBuilding MakeHCs = new SurfaceShipBuilding();
		Ship theHC = MakeHCs.orderTheShip("HC");
		theHC.displyShipSpeed();
		theHC.shipGunDesc();
                System.out.println(theHC + "\n");
		Ship theCSC = MakeHCs.orderTheShip("CSC");
		theCSC.displyShipSpeed();
		theCSC.shipGunDesc();
		System.out.println(theCSC + "\n");

    }
    
}
