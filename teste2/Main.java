package br.com.teste2;

public class Main {

	public static void main(String[] args) {
		Casa casaPelada = Casa.criarCasaPelada();
		Casa casaPronta = Casa.criarCasaPronta();
		
		System.out.println(casaPronta.getSala().getPolegadasTv());
		casaPronta.getSala().setPolegadasTv(55);
		System.out.println(casaPronta.getSala().getPolegadasTv());
		
		System.out.println(casaPronta.getCozinha().getMesa());
		Mesa mesa = new Mesa();
		mesa.setQuantidadeCadeiras(4);
		casaPronta.getCozinha().setMesa(mesa);
		System.out.println(casaPronta.getCozinha().getMesa());
		
		System.out.println(casaPelada);
		System.out.println("-");
		System.out.println(casaPronta);
	}
}
