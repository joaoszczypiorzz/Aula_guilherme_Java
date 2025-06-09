package com.company;

public class enquanto {
    public static void main(String[] args){

        int i = 1;

        //estrutura de repetição enquanto(while)
        while(i<=10){
            System.out.println("Laço " + i);
            i = i+1;

        }
        i = 0;
        int valor = 0;
        while(i<100){
            i++;
            System.out.println("Laço " + i);
            System.out.println("Valor inicial " + valor);
            valor = valor + i;
            System.out.println("Valor final: " + valor);

        }
    }
}
