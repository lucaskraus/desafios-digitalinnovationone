package main;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Por favor, digite o primeiro número: ");
            int parametro1 = scanner.nextInt();

            System.out.println("Por favor, digite o segundo número: ");
            int parametro2 = scanner.nextInt();

            scanner.close();

            contar(parametro1, parametro2);

        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }
    }
    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if (parametro1 > parametro2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int diferenca = parametro2 - parametro1;
        for (int i = 1; i <= diferenca; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

