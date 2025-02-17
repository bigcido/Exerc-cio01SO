package controller;

public class metodo {
	
	public metodo() {
		super();
	}
	
	public void arrayTime(int[] array) {
		double tempoInicial = System.nanoTime();
		
		for (int elemento : array) {
			
		}
		double tempoTotal = (System.nanoTime() - tempoInicial) / Math.pow(10, 9);
		
		System.out.printf("Elemento: %6d  Tempo: %f", array.length, tempoTotal);
	}
}
