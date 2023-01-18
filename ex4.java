import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner iptu = new Scanner (System.in);
        int n = 0;
        double area = 0, valor = 0;
        do {
            System.out.println("Informe o tamanho do terreno em m2:");
            area = iptu.nextInt();
            System.out.println("1 - Terreno de esquina");
            System.out.println("2 - Terreno em zona comercial");
            System.out.println("3 - Terreno limpo");
            System.out.println("4 - Nenhuma das opções acima");
            System.out.println("9 - Fechar programa");
            n = iptu.nextInt();
            valor = area * 1.10;

            if (n == 1) {
                valor = area * 1.30;
                System.out.println("Valor da área:" + valor);
            }
            if (n == 2) {
                valor = area * 1.20;
                System.out.println("Valor da área:" + valor);
            }
            if (n == 3) {
                valor = valor * 0.75;
                System.out.println("Valor da área:" + valor);
            }
        } while (n != 9);
        System.out.println("Programa fechado com sucesso!");
    }
}