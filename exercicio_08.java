package atividade8;

import java.util.Scanner;

public class exercicio_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nível de óleo (em porcentagem, ex: 25): ");
        double nivelDeOleos = sc.nextDouble();
        if (nivelDeOleos < 30) {
            System.out.println("Adicionar óleo.");
        } else {
            System.out.println("Nível adequado.");

        }
    }
}
