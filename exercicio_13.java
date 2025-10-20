package atividade8;

import java.util.Scanner;

public class exercicio_13 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Digite a quantidade de energia solar captada (em kWh): ");
        double energiaCaptada = sc.nextDouble();
        if (energiaCaptada < 200) {
            System.out.println("Acionar energia auxiliar.");
        } else {
            System.out.println("Energia solar suficiente.");
        }

    }
}
