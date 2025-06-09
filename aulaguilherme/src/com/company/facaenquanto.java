package com.company;

import java.util.Scanner;
public class facaenquanto {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int botao = 0;


        //laço do while(faça enquanto)
        do{
            System.out.println("Selecione um botão: ");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("0. Sair");
            System.out.println("Selecione um botão: ");
            botao = leia.nextInt();


        }while(botao != 0);
        System.out.println("FIM");

    }
}
