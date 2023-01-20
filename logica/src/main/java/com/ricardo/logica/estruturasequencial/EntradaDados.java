package com.ricardo.logica.estruturasequencial;

import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("qual o seu nome");
        String nome = sc.next();
        System.out.println(nome);
        System.out.println("qual o seu sobrenome");
        String sobrenome = sc.next();
        System.out.println(sobrenome);

        // podemos pegar varios valores em uma mesma linha

        System.out.println("todos os valores na mesma linha");
        String a,b,c;
        a = sc.next();
        b = sc.next();
        c = sc.next();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //podemos pegar valores ate a quebra de linha utilizando nextLine()

        //existe um problema que quando usamos um comando do scanner diferente do netxLine, ao darmos um enter ele faz uma quebra de linha e o nextline absrove esse valor
        // para resolver isso damos um nextLine puro para resolver o problema
        sc.nextLine();

        String d = sc.nextLine();
        String e = sc.nextLine();
        System.out.println(d);
        System.out.println(e);
        sc.close();
    }
}
