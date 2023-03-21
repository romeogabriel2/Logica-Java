package br.com.logica.inicio;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		
		double salario, vt, cm, calculo, calculo2;
		
		Scanner entrada = new Scanner(System.in);
	
		
		System.out.println("Digite seu Salario aqui: ");
		salario = entrada.nextDouble();
		
		System.out.println("Digite o desconto do convênio médico sem o simbolo de %: ");
		cm = 7;
		
		System.out.println("Digite o desconto do vt sem o simbolo %: ");
		vt = 6.22;
		
		
		calculo = (vt + cm)*salario/100;
		
		calculo2 = salario-calculo;
		
		System.out.println(calculo);
		System.out.println(calculo2);
		
	}

}
