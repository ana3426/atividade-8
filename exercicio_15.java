package atividade8;

import java.util.Scanner;

public class exercicio_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a porcentagem de peças aprovadas: ");
        double porcentagemAprovadas = sc.nextDouble();
        if (porcentagemAprovadas < 90) {
            System.out.println("Qualidade abaixo do padrão.");
        } else {
            System.out.println("Qualidade aceitável.");
        }
    }
}
