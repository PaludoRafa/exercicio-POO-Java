package projetoCar;

import java.util.Scanner;

public class AndarCarro {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Carro carro = new Carro();
		/*
		String modelo;
		String marca;
		int qtdMaxCombustivel;
		int qtdAtualCombustivel;
		boolean status;
		int consumoMedio;
		*/
		
		do {
			System.out.println("Escolha a marca do carro: ");
			carro.marca = scan.next();
			System.out.println("Escolha o modelo do carro: ");
			carro.modelo = scan.next();
		} while (carro.marca == "" && carro.modelo == "");
		
		carro.qtdMaxCombustivel = 50;
		carro.qtdAtualCombustivel = 50;
		carro.status = false;
		carro.consumoMedio = 10;
		
		carro.andar(30);
		
		
	};
}


