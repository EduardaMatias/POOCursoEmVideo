package aula2;

public class MainCaneta {

	public static void main(String[] args) {
		// OBJETO C1
		Caneta c1 = new Caneta();

		c1.modelo = "Bic Cristal";
		c1.cor = "Azul";
		// c1.ponta = 0.5f;
		c1.carga = 80;
		//c1.tampada = true;
		c1.destampar();
		c1.status();
		c1.rabiscar();
	}
}
