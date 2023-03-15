package ShipFactoryPackage;
import ShipEquipments.Engine;
import ShipEquipments.Weapon;


/**
 *
 * @author Rama
 */


// Here is where the require equipments are defined

public interface ShipFactory{
	
	public Weapon addGun();
	public Engine addEngine();
	
}

