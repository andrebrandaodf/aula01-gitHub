package aulasIsidro;

public class Televisao {
	// Atributos
	String marca;
	Boolean ligada;
	int volume;
	int canal;

	// Metodos
	public void ligar() {
		ligada = true;
		System.out.println("A TV " + marca + " está ligada");
	}

	public void aumentarVolume() {
		if (ligada) {
			volume++;
			System.out.println("A TV " + marca + " está com volume " + volume);

		} else {
			System.out.println(" Por favor ligue a TV " + marca);
		}
	}

	public void avancarCanal() {
		if (ligada) {
			canal++;
			System.out.println("A TV" + marca + "está no canal " + canal);
		} else {
			System.out.println("Por favor ligue a TV " + marca);
		}
	}

}
