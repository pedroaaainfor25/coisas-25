import java.util.Scanner;

   public class entrada{
      public static void main (String[] args){

            Scanner entrada = new Scanner (System.in);
            System.out.println("qual e o seu nome?");
            String nome = entrada.nextLine();
            System.out.println("bem vindo" + nome);

      }

}