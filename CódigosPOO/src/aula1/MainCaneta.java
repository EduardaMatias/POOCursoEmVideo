package aula1;

public class MainCaneta {

	public static void main(String[] args) {
		// OBJETO C1
		Caneta c1 = new Caneta();
		c1.modelo = "Bic";
		c1.cor = "azul";
		c1.ponta = 0.5f;
		c1.carga = 90;

		c1.destampar();
		c1.status();
		c1.rabiscar();

		System.out.println("===============");
		
		// OBJETO C2
		Caneta c2 = new Caneta();
		c2.modelo = "Faber Castell";
		c2.cor = "Vermelha";
		c2.ponta = 0.7f;
		c2.carga = 50;

		c2.tampar();
		c2.status();
		c2.rabiscar();
	}
}
