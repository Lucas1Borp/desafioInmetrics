package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Carro;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Quantos carros deseja cadastrar: ");
		int n = scan.nextInt();

		List<Carro> list = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			scan.nextLine();
			System.out.println("Carro #" + i);
			System.out.print("Digite a marca do veiculo: ");
			String marca = scan.nextLine();
			System.out.print("Digite o modelo do veiculo: ");
			String modelo = scan.nextLine();
			System.out.print("Digite a cor do veiculo: ");
			String cor = scan.nextLine();
			System.out.print("Digite a placa do veiculo: ");
			String placa = scan.nextLine();
			System.out.print("Digite a velocidade maxima do veiculo: ");
			double veloxMax = scan.nextDouble();
			scan.nextLine();
			System.out.print("Digite a cidade de origem: ");
			String cidade = scan.nextLine();
			System.out.print("Digite o nº da vaga: ");
			int vagas = scan.nextInt();

			list.add(new Carro(vagas, cor, placa, veloxMax, modelo, cidade, marca));
		}

		for (Carro carro : list) {
			System.out.println();
			System.out.println(carro.imprimeDados());

		}

		scan.close();
	}

}
