package atividade8;

import java.util.Scanner;

public class exercicio_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a eficiência de produção (em porcentagem):");
        double eficiencia = sc.nextDouble();
        if (eficiencia >= 85) {
            System.out.println("Eficiência aceitável.");
        } else {
            System.out.println("Manutenção recomendada.");
        }
    }
}
