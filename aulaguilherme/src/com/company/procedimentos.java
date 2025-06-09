package com.company;

public class procedimentos {
    public static void main(String[] args) {
        String msg = "Salve seres humanos!!";
        String oi = "Oi tudo bem com você?";
        mensagem("Hello word");
        mensagem("Testando como usar os procedimentos em java");
        mensagem(msg);
        mensagem(oi);

    }
    public static void mensagem(String frase){
        System.out.println("<--------->");
        System.out.println(frase);
        System.out.println("<--------->");
    }
}
