
package meuprimeiroprojeto;

import java.util.Scanner;


public class MeuPrimeiroProjeto {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int você, máquina;
        int seusPontos = 0, pontosIA = 0;
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("***____Jo-Ken-Pô!____***");
            System.out.println("");
            System.out.println("1. Pedra");
            System.out.println("2. Papel");
            System.out.println("3. Tesoura");
            System.out.println("Digite a opção desejada: ");
            //Lógica da repetição
            for (int i = 0; i < 15; i++) {
            //lógica do Jogador
            você = teclado.nextInt();
            System.out.println("");
            switch(você) {
                case 1 -> System.out.println("Você escolheu PEDRA");
                case 2 -> System.out.println("Você escolheu PAPEL");
                case 3 -> System.out.println("Você escolheu TESOURA");
                default -> System.out.println("Opção Inválida");
            }
            //lógica do Computador
            máquina = (int)(Math.random()*3 + 1);
            switch(máquina) {
                case 1 -> System.out.println("A máquina escolheu PEDRA");
                case 2 -> System.out.println("A máquina escolheu PAPEL");
                case 3 -> System.out.println("A máquina escolheu TESOURA");
                }
                System.out.println("");
            //lógica para determinar o vencedor
            if (você == máquina) {
                System.out.println("Empate");
                System.out.println("Digite uma opção novamente!");
                System.out.println("");
            } else {
            if ((você == 1 && máquina == 3) || (você == 2 && máquina
                == 1) || (você == 3 && máquina == 2)) {
                System.out.println("Você marcou 1 ponto! Digite uma opção "
                        + "novamente!");
                System.out.println("");
                seusPontos++;
                } else {
                System.out.println("A máquina marcou 1 ponto! Digite uma opção"
                        + " novamente!");
                System.out.println("");
                pontosIA++;
            }
            // lógica da pontuação
            if (seusPontos == 3 && pontosIA >=0){
                System.out.println("Sem mais delongas, temos um ganhador!");
                System.out.println("Você venceu a partida! :D");
                System.out.println("Fim de jogo!");
                System.out.println("");
                break;
            }
            else if (pontosIA == 3 && seusPontos >=0) {
                System.out.println("Infelizmente acabaram as suas chances!");
                System.out.println("A máquina venceu a partida! :/ ");
                System.out.println("Fim de jogo!");
                System.out.println("");
                break;
            }
            if  (seusPontos == 3 && pontosIA == 3){
                System.out.println("Parece que já deu o que tinha que dar...");
                System.out.println("Você e a máquina empataram a partida! '-'");
                System.out.println("Fim de jogo!");
                System.out.println("");
                break;
            }
            }}
        }
    }
}

