package car;

import java.util.Scanner;

public class car {

	/* Attributes */

	private static final String brand = "Tesla";
	private final String power = "370 cv";
	private static String model;

	/* Constructors */

	public car(String model) {
		this.model = model;
	}

	/* Getters & Setters */

	public static String getModel() {
		return model;
	}

	public static String getBrand() {
		return brand;
	}

	public String getPower() {
		return power;
	}

	public void setModel(String model) {
		car.model = model;
	}

	/* Method */

	public void accelerate() {
		System.out.println("El coche " + getBrand() + " " + getModel() + " esta acelerando a plena potencia con sus "
				+ getPower());
	}

	public void brake() {
		System.out.println("El coche " + getBrand() + " " + getModel() + " esta frenando");
	}

	public static void main(String[] args) {

		/* Variables & other stuff */

		Scanner sc = new Scanner(System.in);
		String userModel;
		int userOption = -1;
		car userCar = new car(model);

		/* Main code */

		System.out.println("¿Que modelo de Tesla quieres crear?");
		userModel = sc.nextLine();
		userCar.setModel(userModel);

		/* Conditions */

		do {
			System.out.println("Escoge una opción para tu " + getBrand() + " " + getModel() + "\n1 Accelerar."
					+ "\n2 Frenar" + "\n0 Apagarlo");
			userOption = sc.nextInt();

			/* switch code */

			switch (userOption) {

			case 1:
				userCar.accelerate();
				break;

			case 2:
				userCar.brake();
				break;

			}
		} while (userOption != 0);

		System.out.println("El " + getBrand() + " " + getModel() + " se ha apagado");

	}

}
