/*Conta banco de Jubileu e da Clueza.
  1° Criar uma conta: conta corrente ou conta poupança;
  Jubileu escolheu conta poupança, depositou 300 reais.
  Cleuza escolheu conta corrente, depositou 500 reais.
  2° Saque
  Cleuza sacou 100 reais, ficando com 400 reais.
  
  ATRIBUTOS: publico numConta, protegido tipoConta, privado donoConta, privado saldo, privado statusConta
  MÉTODOS: (todos são publicos) abrirConta(), fecharConta(), depositar(), sacar(), pagarMensal()
  
  O tipo da conta vai aceitar apenas CC e CP
  Se abrir CC ganha 50 reais, CP ganha 150 reais
  Abrir conta = muda atributo status para verdadeiro
  Para fechar conta, não pode deixar dinheiro na conta e não pode ter débitos
  Para depositar e sacar, a conta tem que estar aberta (status verdadeiro)
  Para sacar precisa ter saldo
  A mensalidade é cobrada diretamente do saldo, 10 reais para CC e 20 reais para CP
 */

package aula4;

public class ContaBancaria {
	// ATRIBUTOS
	public int numConta;
	protected String tipoConta;
	private String donoConta;
	private double saldo;
	private boolean statusConta;
	private int valor;

	public ContaBancaria() {
		this.setSaldo(0);
		this.setStatusConta(false);
	}
	
	// METODOS ESPECIAIS
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public String getDonoConta() {
		return donoConta;
	}

	public void setDonoConta(String donoConta) {
		this.donoConta = donoConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean getStatusConta() {
		return statusConta;
	}

	public void setStatusConta(boolean statusConta) {
		this.statusConta = statusConta;
	}

	

	// METODOS PERSONALIZADOS
	public void estadoAtual() {
		System.out.println("--------------------------");
		System.out.println("Conta: " + this.getNumConta() + "\nTipo: " + this.getTipoConta() + "\nDono: "
				+ this.getDonoConta() + "\nSaldo: " + this.getSaldo() + "\nStatus: " + getStatusConta());
	}

	public void abrirConta(String tipoConta) {
		this.setTipoConta(tipoConta);
		this.setStatusConta(true);
		System.out.println("Conta aberta");
		if (tipoConta == "CC") {
			this.setSaldo(50);
		} else if (tipoConta == "CP") {
			this.setSaldo(150);
		} else {
			System.out.println("Erro!");
			System.exit(numConta);
		}
	}

	public void fecharConta() {
		if (this.getSaldo() == 0) {
			System.out.println("....FECHANDO....");
			setStatusConta(false);
			System.out.println("Conta aberta: " + this.statusConta);
		} else if (this.getSaldo() > 0) {
			System.out.println("Você ainda tem dinheiro na conta, não pode fecha-la.");
		} else {
			System.out.println("A conta está em débito, você não pode fecha-la.");
		}
	}

	public void depositar(double deposito) {
		if (this.getStatusConta()) {
			setSaldo(getSaldo() + deposito);
			System.out.println("Depósito realizado na conta de " + this.getDonoConta());
		} else {
			System.out.println("É impossivel depositar");
		}
	}

	public void sacar(double saque) {
		if (this.getStatusConta()) {
			if (this.getSaldo() >= saque) {
				setSaldo(getSaldo() - saque);
				System.out.println("Saque de R$" + saque + " realizado na conta de " + this.getDonoConta());
			} else {
				System.out.println("Saldo insuficiente!");
			}
		} else {
			System.out.println("Impossível sacar, a conta não está aberta!");
		}
	}

	public void pagarMensalidade() {

		if (this.getTipoConta() == "CC") {
			valor = 12;
			System.out.println("Valor a ser pago: R$" + valor);
		} else if (this.getTipoConta() == "CP") {
			valor = 20;
			System.out.println("Valor a ser pago: R$" + valor);
		}
		if (this.getStatusConta()) {
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("Mensalidade paga!");
		} else {
			System.out.println("Impossível pagar uma conta fechada.");
		}
	}
}
