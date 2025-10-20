package atividade8;

import java.util.Scanner;

public class exercicio_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("O sensor detectou um operador? (sim/nao)");
        String deteccao = sc.nextLine();
        if (deteccao.equalsIgnoreCase("sim")) {
            System.out.println("Pausar linha de produção.");
        } else {
            System.out.println("Linha operando normalmente.");
        }

    }
}
