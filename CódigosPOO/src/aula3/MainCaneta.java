package aula3;

public class MainCaneta {
	public static void main(String[] args) {
		Caneta c1 = new Caneta("BIC", 0.4f, "azul");
		c1.status();
		Caneta c2 = new Caneta("Faber", 0.7f, "preta");
		c2.status();
	}
}
