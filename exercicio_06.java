package atividade8;

import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a produção do turno:");
    int producao = sc.nextInt();
        if (producao >= 1000) {
        System.out.println("Meta atingida.");
    } else {
        System.out.println("Produção abaixo da meta.");
    }
}}
