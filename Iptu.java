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
       //
       System.out.println("Terreno de esquina ?Digite true or false");
       scanner = new Scanner(System.in);
       terrenoDeEsquina = scanner.nextBoolean();
       //

       calculoImposto = ((((areaDoTerreno * valorImpostoPorMetroQuadrado)
               * acrescimoTerrenoDeEsquina) * acrescimoTerrenComercial)
               * descontoTerrenoSemMato);
   }
   public Iptu(){
   }
}

