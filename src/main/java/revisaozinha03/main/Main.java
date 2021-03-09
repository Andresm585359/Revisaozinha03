package revisaozinha03.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Main app = new Main();
		app.start();

	}

	private void start() {

		Scanner scan = new Scanner(System.in);
		System.out.println("sei q eh idade mas neh kkk");
		System.out.println("Escreva um numero:  ");
		float neuza = scan.nextInt();
		if (neuza > 20) {
			System.out.println("valor maior que 20.");
		} else {
			if ((neuza < 17) && (neuza > 12)) {
				System.out.println("valor entre 12 e 17.");
			} else {
				if (neuza == 7 || neuza < 5) {
					System.out.println("valor é igual a 7 ou menor que 5.");
				} else {
					System.out.println("parabens vc eh fora da norma... animal hu3 hu3 hu3");
				}
			}
		}
	}

}
