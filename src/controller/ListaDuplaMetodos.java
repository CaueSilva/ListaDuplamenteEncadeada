package controller;

import model.No;

public class ListaDuplaMetodos {

	private No inicio, fim;

	public ListaDuplaMetodos() {
		inicio = null;
		fim = null;
	}

	public void adicionaInicio(int e) {
		No novo = new No(e);
		if (inicio == null) {
			System.out.println("Erro, lista vazia.");
		} else {
			novo.prox = inicio;
			inicio.ant = novo;
			inicio = novo;
		}
	}

	public void adicionaFinal(int e) {
		No novo = new No(e);
		if (inicio == null) {
			inicio = novo;
			fim = novo;
		} else {
			fim.prox = novo;
			novo.ant = fim;
			fim = novo;
		}
	}

	public int removeInicio() {
		int r = 0;
		if (inicio == null) {
			System.out.println("Erro, lista vazia.");
		} else {
			r = inicio.dado;
			inicio = inicio.prox;
		}
		return r;
	}

	public int removeFinal() {
		int r = 0;
		if (inicio == null) {
			System.out.println("Erro, lista vazia.");
		} else {
			No aux = fim.ant;
			r = fim.dado;
			aux.prox = null;
			fim = aux;
		}
		return r;
	}

	public String toString() {
		String r = "";
		No aux = inicio;
		while (aux != null) {
			r = r + " " + aux.dado;
			aux = aux.prox;
		}
		return r;
	}
}
