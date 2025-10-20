package atividade8;

import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a temperatura atual em °C: ");
        double temperatura = sc.nextDouble();
        if (temperatura > 80.0) {
            System.out.println("Alerta: Máquina desligada por superaquecimento!");
        } else {
            System.out.println("Máquina operando normalmente.");
        }
    }
}
