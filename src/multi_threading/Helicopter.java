package multi_threading;

public class Helicopter {

	public static void main(String[] args) {
		HelicopterControllActions hel = new HelicopterControllActions();
		Human human = new Human(hel);
		human.controll();
	}

}

class Human {
	HelicopterControllActions heli;

	public Human(HelicopterControllActions heli) {
		this.heli = heli;
	}

	void controll() {
		heli.start();
		heli.accelarate();
		heli.toLeft();
		heli.toRight();
	}
}

class HelicopterControllActions {
	void start() {
		System.out.println("Started");
	}

	void accelarate() {
		System.out.println("Accelarate");

	}

	void toLeft() {
		System.out.println("to left direction");

	}

	void toRight() {
		System.out.println("to right direction ");
	}
}
