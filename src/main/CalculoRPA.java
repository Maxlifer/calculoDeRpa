package main;

import java.util.Scanner;

public class CalculoRPA {

	public static void main(String[] args) {
		
		float valorRPA;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Digite o valor a ser calculado: ");	
		valorRPA = in.nextFloat();
		
		valorRPA = calculoRPA(valorRPA);
		
		System.out.printf("O valor do RPA é de %.2f\n", valorRPA );	
		
	}

public static float calculoRPA(float calculoRPA) {


float calculoIR;
float inss;
float valorIR = 0;


if (calculoRPA * 0.11 >= 608.44) {
    inss =  608.44F;
}	else	{
    inss = calculoRPA * 0.11F;
}
calculoIR = calculoRPA - inss;

if (calculoIR <= 1903.98) {
} else if  (calculoIR > 1903.99 && calculoIR <= 2826.65) {
     valorIR  = (float) (calculoIR * 0.075 - 142.80F);
} else if  (calculoIR > 2826.65 && calculoIR <= 3751.06) {
    valorIR = (float) (calculoIR * 0.15 - 354.80F);
} else if  (calculoIR > 3751.06 && calculoIR <= 4664.68) {
    valorIR = (float) (calculoIR * 0.225 - 636.13F);
} else {
   valorIR = (float) (calculoIR * 0.275 - 869.36); 
}

calculoRPA = calculoRPA - inss - valorIR;
return calculoRPA;
	}
}
