package aula1;

public class Caneta {
	//ATRIBUTOS
	String modelo, cor;
	float ponta;
	int carga;
	boolean tampada;

	//M�TODOS
	public void status() {
		System.out.println("Modelo: " + this.modelo + "\nCor da caneta: " + this.cor + 
				"\nPonta: " + this.ponta + "\nCarga: " + this.carga + "%" + "\nEst� tampada: " + this.tampada);
	}
	
	public void rabiscar() {
		if(this.tampada == true) {
			System.out.println("ERRO! N�o posso rabiscar.");
		}
		else {
			System.out.println("Rabiscando...");
		}
	}

	public void tampar() {
		//THIS � UMA REFER�NCIA AO OBJETO QUE CHAMAR� A CLASSE
		this.tampada = true;
	}

	public void destampar() {
		this.tampada = false;
	}
}
