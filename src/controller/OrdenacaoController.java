package controller;

import br.edu.fateczl.matheus.marti.ordenar.vetores.OrdenarVetor;

public class OrdenacaoController {

	public OrdenacaoController() {
		super();
	}

	public int[] bubbleSort(int[] vet) {
		OrdenarVetor ordVet = new OrdenarVetor();
		int[] vetOrdenado = ordVet.bubbleSort(vet);
		return vetOrdenado;
	}

	public int[] mergeSort(int[] vet) {
		OrdenarVetor ordVet = new OrdenarVetor();
		int fim = vet.length - 1;
		int[] vetOrdenado = ordVet.mergeSort(vet, 0, fim);
		return vetOrdenado;
	}
	
	public int[] quickSort (int[] vet) {
		OrdenarVetor ordVet = new OrdenarVetor();
		int fim = vet.length - 1;
		int[] vetOrdenado = ordVet.quickSort(vet, 0, fim);
		return vetOrdenado;
	}
	
}
