package atividade8;

import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de unidades em estoque:");
        int estoque = sc.nextInt();
        if (estoque < 20) {
            System.out.println("Reabastecer imediatamente.");
        } else {
            System.out.println("Estoque suficiente.");
        }
    }
}
