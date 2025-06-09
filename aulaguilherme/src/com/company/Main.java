package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int idade;

        System.out.println("Insira sua idade: ");
        idade = leia.nextInt();

        if(idade < 18){
            System.out.println("Você não é adulto");

        }
        else{
            System.out.println("Você é adulto!");
        }

;
    }
}
