package br.edu.fatecpg.Produto.model;

import java.util.Scanner;

public class Produto {
	
	Scanner entrada = new Scanner(System.in);
	
	private String nome;
	private double preco;
	private int quantidadeEstoque;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double pr) {
		while(true) {
			if(pr > 0) {
				System.out.print("Insira um valor maior que 0: ");
				pr = entrada.nextDouble();
				break;
			}
		}
		this.preco = pr;
	}
	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
}
