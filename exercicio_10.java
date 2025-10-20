package atividade8;

import java.util.Scanner;

public class exercicio_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); {
            System.out.println("Por favor, digite o peso total das caixas em kg:");
            double pesoTotal = sc.nextDouble();
            if (pesoTotal > 500) {
                System.out.println("Capacidade excedida.");
            } else {
                System.out.println("Peso dentro do limite.");
            }
        }
    }
}
