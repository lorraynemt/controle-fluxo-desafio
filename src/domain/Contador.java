package domain;
import java.util.Scanner;

import exception.ParametrosInvalidosException;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
        
		System.out.println("Bem-vindo ao contador de interações!");
		System.out.println("Digite o primeiro número: ");
		int num1 = terminal.nextInt();

		System.out.println("Digite o segundo número: ");
		int num2 = terminal.nextInt();
        
		try {
			contar(num1, num2);
		
		} catch (ParametrosInvalidosException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

	public static void contar(int num1, int num2 ) throws ParametrosInvalidosException {
        if(num1 >= num2){
            throw new ParametrosInvalidosException();
			
        }
		else {
			int dif = num1 - num2;
			for (int i = 1; i <= dif; ++i){
				System.out.println("Imprimindo o número " + dif);
			}
		}
    }
}
