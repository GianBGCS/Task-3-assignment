import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Main{
  public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      Repository repo = new  Repository();

      boolean menu = true;

      while (menu){

          System.out.println("\nMenu \n[1] See saved students \n[2] Get Student by ID \n[3] Add students \n[4] Clear all students saved \n[5] Quit"
          );
          System.out.print("Choose an option: ");
          int option = scanner.nextInt();
          scanner.nextLine();

          switch (option){
              case 1:
                  break;
              case 2:
                  break;
              case 3:
                   break;
              case 4:
                   break;
               case 5:
                   break;
              default:
                   break;
          }

      }

  }
}
