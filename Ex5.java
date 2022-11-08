import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.00");

        int tempo = 0;
        double valor, adicional;

        while (tempo != -1) {
            System.out.println("Digite o tempo de permanência em minutos: ");
            tempo = sc.nextInt();

            if (tempo <= 15) {
                valor = 0;
            }
            else if (tempo <= 60) {
                valor = 1.50;
            }
            else {
                adicional = 1 + (tempo - 61) / 60;
                valor = 1.50 + Math.round(adicional);
            }

            if (valor == 0 && tempo >= 0) {
                System.out.println("O valor a pagar é de R$ 0" + df.format(valor));
            }
            else if (tempo >= 0) {
                System.out.println("O valor a pagar é de R$ " + df.format(valor));
            }
        }
    }
}
