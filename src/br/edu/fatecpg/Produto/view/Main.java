package br.edu.fatecpg.Produto.view;

import br.edu.fatecpg.Produto.model.Produto;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double preco;
		
		Produto cocaCola = new Produto();
		
		System.out.print("Preço do produto: ");
		preco = entrada.nextDouble();
		
		cocaCola.setNome("Coca-Cola");
		cocaCola.setPreco(preco);
		
		entrada.close();
	}

}
