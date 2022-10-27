import java.util.Scanner;

public class atividade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int facil = 1 + (int) (Math.random() * 1000);
        int medio = 1 + (int) (Math.random() * 5000);
        int dificil = 1 + (int) (Math.random() * 10000);
        int dificuldade;

        System.out.println("Escolha sua dificuldade:");
        System.out.println("Facil = 1, Medio = 2 e Dificil = 3");
        int palpite;

        dificuldade = teclado.nextInt();

        switch (dificuldade) {
            case 1:
                for (int i = 1; i <= 15; i++) {
                    System.out.println("Palpite:");
                    palpite = teclado.nextInt();
                    if (palpite == facil) {
                        System.out.println("Parabéns você acertou!");
                        break;
                    } else {
                        if (palpite < facil) {
                            System.out.println("Palpite baixo");
                        } else {
                            System.out.println("Palpite alto");
                        }
                        if (palpite == 15) {
                            System.out.println("Suas tentativas acabarao!");
                        }
                    }
                }
            case 2:
                for (int i = 1; i <= 12; i++) {
                    System.out.println("Palpite:");
                    palpite = teclado.nextInt();
                    if (palpite == medio) {
                        System.out.println("Parabéns você acertou");
                        break;
                    } else {
                        if (palpite < medio) {
                            System.out.println("Palpite baixo");
                        } else {
                            System.out.println("Palpite alto");
                        }
                        if (palpite == 12) {
                            System.out.println("Suas tentativas acabarao!");
                        }
                    }
                }
            case 3:
                for (int i = 1; i <= 10; i++) {
                    System.out.println("Palpite:");
                    palpite = teclado.nextInt();
                    if (palpite == dificil) {
                        System.out.println("Parabéns você acertou");
                        break;
                    } else {
                        if (palpite < dificil) {
                            System.out.println("Palpite baixo");
                        } else {
                            System.out.println("Palpite alto");
                        }
                        if (palpite == 10) {
                            System.out.println("Suas tentativas acabarao!");
                        }
                    }
                }
        }
    }
}