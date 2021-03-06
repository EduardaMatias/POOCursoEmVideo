package aula5;

public class ControleRemoto implements Controlador {
	private int volume;
	private boolean ligado;
	private boolean tocando;

	// CONSTRUTOR
	public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

	// GETTERS E SETTERS
	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean getLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean getTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	// SOBREESCREVENDO M?TODOS
	@Override
	public void ligar() {
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		if(this.getLigado() == false) {
			System.out.println("Imposs?vel exibir menu.");
		} else {
		System.out.println("-------MENU-------");
		System.out.println("Est? ligado? " + this.getLigado());
		System.out.println("Est? tocando? " + this.getTocando());
		System.out.print("Volume: " + this.getVolume());
		for (int i = 1; i <= this.getVolume(); i ++) {
			System.out.print("|");
		}
		this.getTocando();
		}
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando menu.");
	}

	@Override
	public void maisVolume() {
		if (this.getLigado()) {
			this.setVolume(this.getVolume() + 1);
		} else {
			System.out.println("Imposs?vel aumentar volume.");
		}
	}

	@Override
	public void menosVolume() {
		if (this.getLigado()) {
			this.setVolume(this.getVolume() - 1);
		} else {
			System.out.println("Imposs?vel diminuir volume volume.");
		}
	}

	@Override
	public void ligarMudo() {
		if (this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		} else {
			System.out.println("Imposs?vel ligar mudo.");
		}
	}

	@Override
	public void desligarMudo() {
		if (this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		} else {
			System.out.println("Imposs?vel desligar mudo.");
		}
	}

	@Override
	public void play() {
		if (this.getLigado() && this.getTocando() == false) {
			this.setTocando(true);
		} else {
			System.out.println("Imposs?vel dar play.");
		}
	}

	@Override
	public void pause() {
		if (this.getLigado() && this.getTocando()) {
			setTocando(false);
		} else {
			System.out.println("Imposs?vel dar pause.");
		}
	}

}
