package aula1;

public class Garrafa {
	String cor, tipoLiquido;
	float capacidade;
	boolean cheia;

	public void status() {
		System.out.println("Cor da garrafa: " + this.cor + "\nGuarda: " + this.tipoLiquido + "\nTem capacidade de: "
				+ this.capacidade + " litros" + "\nEst? cheia? " + this.cheia);
	}

	public void encher() {
		if (this.cheia == true) {
			System.out.println("A garrafa j? est? cheia");
		} else {
			System.out.println("Enchendo...");
		}
	}

	public void esvasiar() {
		if (this.cheia == false) {
			System.out.println("A garrafa j? est? vazia");
		} else {
			System.out.println("Esvaziando...");
		}
	}
}
