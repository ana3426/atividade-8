package atividade8;

import java.util.Scanner;

public class exercicio_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de material disponível: ");
        double quantidadeMaterial = sc.nextDouble();
        if (quantidadeMaterial > 5) {
            System.out.println("Impressão iniciada.");
        } else {
            System.out.println("Sem material disponível.");
        }
    }
}
