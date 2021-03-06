package aula3;

public class Caneta {
	private String modelo, cor; //O OBJETO N?O VAI CONSEGUIR ACESSAR OS ATRIBUTOS SEM OS M?TODOS GET/SET
	private float ponta;
	boolean tampada;
	
	//M?TODO CONSTRUTOR	
	public Caneta(String m, float p, String c) {
		this.setModelo(m);
		this.setPonta(p);
		this.cor = c;
		this.tampar();
	}

	//M?TODO ACESSOR
	public String getModelo() {
		return this.modelo;
	}
	
	public float getPonta() {
		return this.ponta;
	}
	
	//M?TODO MODIFICADOR
	public void setModelo(String m) {
		this.modelo = m;
	}
	
	public void setPonta(float p) {
		this.ponta = p;
	}
	
	//OUTROS M?TODOS
	public void tampar() {
		this.tampada = true;
	}
	
	public void status() {
		System.out.println("=== SOBRE A CANETA ==== \nModelo: " + this.getModelo() + 
				"\nPonta: " + this.getPonta() + "\nEst? tampada: " + this.tampada +
				"\nCor: " + this.cor + "\n");
	}
}
