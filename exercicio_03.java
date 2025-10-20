package atividade8;

import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a porcentagem de energia do robô: ");
        int energia = sc.nextInt();
        if (energia >= 50) {
            System.out.println("Robô iniciando pintura.");
        } else {
            System.out.println("Energia insuficiente. Recarregar.");
        }
    }
}
