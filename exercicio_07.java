package atividade8;

import java.util.Scanner;

public class exercicio_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de defeitos do lote: ");
        int numeroDeDefeitos = sc.nextInt();
        if (numeroDeDefeitos > 5){
            System.out.println("Lote reprovado.");
        } else {
            System.out.println("Lote aprovado.");
        }

    }
}
