package aulasIsidro;

public class AppTelevisao {

	public static void main(String[] args) {
		
		Televisao t1 = new Televisao();
		
		t1.marca = "LG da sala";
		t1.ligada = false;
		t1.volume = 0;
		t1.canal = 5;
		
		t1.ligar();
		t1.aumentarVolume();
		t1.avancarCanal();
	}

}
