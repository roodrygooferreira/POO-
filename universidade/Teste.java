package universidade.prova.teste;

import universidade.prova.ProvaFafifo;
import universidade.prova.ProvaUCB;

public class Teste {

    public static void main(String[] args) {

        // UCB
        ProvaUCB ucb = new ProvaUCB(8.0, 6.0, 9.0);

        ucb.calcularMedia();

        System.out.println("===== UCB =====");
        System.out.println("Média Final: " + ucb.getMedia());

        if (ucb.aprovado()) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }

        // FAFIFO
        ProvaFafifo fafifo = new ProvaFafifo(5.0, 4.0, 8.0);

        fafifo.calcularMedia();

        System.out.println("\n===== FAFIFO =====");
        System.out.println("Média Final: " + fafifo.getMedia());

        if (fafifo.aprovado()) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }
    }
}