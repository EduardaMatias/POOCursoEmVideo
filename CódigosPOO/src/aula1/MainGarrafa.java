package aula1;

public class MainGarrafa {
	public static void main(String[] args) {
		Garrafa g1 = new Garrafa();
		g1.cor = "verde";
		g1.tipoLiquido = "?gua";
		g1.capacidade = 2.5f;
		g1.cheia = true;
		g1.status();
		g1.encher();
		g1.esvasiar();
	}
}
