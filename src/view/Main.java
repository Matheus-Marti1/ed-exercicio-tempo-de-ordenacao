package view;

import controller.OrdenacaoController;

public class Main {

	public static void main(String[] args) {
		OrdenacaoController ordVet = new OrdenacaoController();
		
		int vetBubble[] = new int[1500];
		int vetMerge[] = new int[1500];
		int vetQuick[] = new int[1500];
		int valor = 1499;
		
		for(int i = 0; i < 1500; i++) {
			vetBubble[i] = valor;
			vetMerge[i] = valor;
			vetQuick[i] = valor;
			valor--;
		}
		
		double tempoInicial = System.nanoTime();
		ordVet.bubbleSort(vetBubble);
		double tempoFinal = System.nanoTime();
		double tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10, 9);
		System.out.println("Tempo de ordenação Bubble Sort: " + tempoTotal + " s.");
		
		tempoInicial = System.nanoTime();
		ordVet.mergeSort(vetMerge);
		tempoFinal = System.nanoTime();
		tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10, 9);
		System.out.println("Tempo de ordenação Merge Sort: " + tempoTotal + " s.");
		
		tempoInicial = System.nanoTime();
		ordVet.quickSort(vetQuick);
		tempoFinal = System.nanoTime();
		tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10, 9);
		System.out.println("Tempo de ordenação Quick Sort: " + tempoTotal + " s.");
		
	}

}
