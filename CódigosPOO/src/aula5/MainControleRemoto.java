package aula5;

public class MainControleRemoto {

	public static void main(String[] args) {
		ControleRemoto tv = new ControleRemoto();
		
		System.out.println("Controle tv:");
		
		tv.ligar();
		tv.maisVolume();
		tv.play();
		tv.abrirMenu();
		
		System.out.println("\n\nControle dvd:");
		
		ControleRemoto dvd = new ControleRemoto();
		
		dvd.ligar();
		dvd.menosVolume();
		dvd.menosVolume();
		dvd.menosVolume();
		dvd.play();
		dvd.pause();
		dvd.abrirMenu();
	}

}
