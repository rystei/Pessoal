import java.util.Scanner;

public class pratica2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1, n2, n3;

        do{
            System.out.println("digite numero 1: ");
            n1 = entrada.nextInt();
            System.out.println("digite numero 2: ");
            n2 = entrada.nextInt();
            System.out.println("digite numero 3: ");
            n3 = entrada.nextInt();

            if ( n1 > n2 && n1> n3 ){
                System.out.println("o maior numero é: " + n1);
            }
            if (n2 > n1 && n2 > n3){
                System.out.println("o maior numero é" + n2);
            }
            if (n3 > n1 && n3 > n3){
                System.out.println("o maior numero é: "+ n3 );
            }
        }while (!(n1 == n2 && n1 == n3 && n2 == n3));
    }
}
