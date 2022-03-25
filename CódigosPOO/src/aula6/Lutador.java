package aula6;

public class Lutador {
	// ATRIBUTOS
	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;

	// MÉTODOS ESPECIAIS
	public Lutador(String no, String na, int id, double al, double pe, int vi, int de, int em) {
		this.setNome(no);
		this.setNacionalidade(na);
		this.setIdade(id);
		this.setPeso(pe);
		this.setAltura(al);
		this.setPeso(pe);
		this.setVitorias(vi);
		this.setDerrotas(de);
		this.setEmpates(em);
	};

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if (this.peso < 52.2) {
			this.categoria = "invalído";
		} else if (this.peso <= 70.3) {
			this.categoria = "leve";
		} else if (this.peso <= 83.9) {
			this.categoria = "médio";
		} else if (this.peso <= 120.2) {
			this.categoria = "pesado";
		} else {
			this.categoria = "invalído";
		}
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	// MÉTODOS PÚBLICOS
	public void apresentar() {
		System.out.println("---------Apresentação---------" + "\nCHEGOU A HORA. "
				+ "\nApresentamos o lutador: " 
				+ this.getNome() + "\nOrigem: "
				+ this.getNacionalidade() + "\nIdade: " 
				+ this.getIdade() + "\nAltura: " 
				+ this.getAltura() + "\nPeso: "
				+ this.getPeso() + "\nQuantidade de vitórias: " 
				+ this.getVitorias() + "\nQuantidade de derrotas: "
				+ this.getDerrotas() + "\nQuantidade de empates: " 
				+ this.getEmpates());
	}

	public void status() {
		System.out.println("---------Status---------" + "\nO lutador " + this.getNome() + " é de peso "
				+ this.getCategoria() + ".\nGanhou " + this.getVitorias() + " vezes, perdeu "
				+ this.getDerrotas() + " vezes e empatou " + this.getEmpates() + " vezes.");
	}

	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}

	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}

	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}
}
