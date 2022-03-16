package aula2;

public class Caneta {
	//ATRIBUTOS
	public String modelo, cor;
	private float ponta = 0.5f;
	protected int carga;
	private boolean tampada;

	//MÉTODOS
	public void status() {
		System.out.println("Modelo: " + this.modelo + "\nCor da caneta: " + this.cor + 
				"\nPonta: " + this.ponta + "\nCarga: " + this.carga + "%" + "\nEstá tampada: " + this.tampada);
	}
	
	public void rabiscar() {
		if(this.tampada == true) {
			System.out.println("ERRO! Não posso rabiscar.");
		}
		else {
			System.out.println("Rabiscando...");
		}
	}

	public void tampar() {
		//THIS É UMA REFERÊNCIA AO OBJETO QUE CHAMARÁ A CLASSE
		this.tampada = true;
	}

	public void destampar() {
		this.tampada = false;
	}
}
