package aula4;

public class MainContaBancaria {

	public static void main(String[] args) {
		ContaBancaria c1 = new ContaBancaria();	
		c1.setNumConta(3565);
		c1.setDonoConta("Jubileu");
		c1.abrirConta("CC");
		
		ContaBancaria c2 = new ContaBancaria();	
		c2.setNumConta(1523);
		c2.setDonoConta("Cleuza");
		c2.abrirConta("CP");
		
		c1.depositar(300);
		c2.depositar(500);
		
		c2.sacar(100);
		
		c1.sacar(350);
		c1.fecharConta();
		
		c1.estadoAtual();
		c2.estadoAtual();	
	}

}
