package assignment5;

public class Game {

	public static void main(String[] args) {
		
		Bomb atom = new Bomb();
		Gun glock = new Gun();
		
		atom.activate(true);
		atom.fireWeapon();
		atom.fireWeapon(1000000);
		glock.activate(true);
		glock.fireWeapon();
		glock.fireWeapon(10);

	}

}
