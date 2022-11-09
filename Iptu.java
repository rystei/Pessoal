import java.util.Scanner;

public class Iptu {
   public void imposto() {
       final double valorImpostoPorMetroQuadrado = 1.10;
       final double acrescimoTerrenoDeEsquina = 0.20;
       final double acrescimoTerrenComercial = 0.10;
       final double descontoTerrenoSemMato = -0.25;

       double areaDoTerreno = 0.0;
       boolean terrenoDeEsquina = false;
       boolean terrenoComercial = false;
       boolean terrenoSemMato = false;

       double calculoImposto = 0.0;

       System.out.println("Qual é área do terreno ? ");
       Scanner scanner = new Scanner(System.in);
       areaDoTerreno = scanner.nextDouble();

       // ÁREA DO TERRENO
       System.out.println("Terreno de esquina ? Digite true or false");
       scanner = new Scanner(System.in);
       terrenoDeEsquina = scanner.nextBoolean();

       // TERRENO DE ESQUINA


       System.out.println("Terreno comercial ? Digite true or false");
       scanner = new Scanner(System.in);
       terrenoComercial = scanner.nextBoolean();
       // TERRENO COMERCIAL


       System.out.println("Terreno sem mato ? Digite true or false");
       scanner = new Scanner(System.in);
       terrenoSemMato = scanner.nextBoolean();
       //TERRENO SEM MATO


       calculoImposto = areaDoTerreno * valorImpostoPorMetroQuadrado  * acrescimoTerrenoDeEsquina * acrescimoTerrenComercial;
       /*
         calculoImposto = areaDoTerreno *(valorImpostoPorMetroQuadrado
               * acrescimoTerrenoDeEsquina * acrescimoTerrenComercial
               * descontoTerrenoSemMato;
        */

       System.out.println("O imposto é:");
       Scanner total = new Scanner(System.in);
       System.out.println("O imposto é: " + calculoImposto);



   }
   public Iptu(){
   }
}

