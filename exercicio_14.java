package atividade8;

import java.util.Scanner;

public class exercicio_14 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite o número de peças montadas:");
        int pecasMontadas = sc.nextInt();
        if (pecasMontadas == 0) {
            System.out.println("Erro: Verificar robô.");
        } else {
            System.out.println("Montagem em andamento.");
        }
    }
}
