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
                  List<Student> allStudents = repo.getAllStudents();
                  System.out.println("\n========== ALL STUDENTS IN DATABASE ==========");
                  if (allStudents.isEmpty()){
                      System.out.println("No student saved");
                  } else {
                      // Display all student records in a formatted column layout
                      System.out.printf("%-6s %-12s %-8s %-12s %-5s %-25s %-8s %-10s %-6s %-7s%n",
                              "ID", "First", "Init", "Last", "Age", "Email",
                              "Gender", "Course", "Year", "Section");
                      System.out.println("------------------------------------------------------------------------------------------------------------------");
                      for (Student s : allStudents) {
                          System.out.printf("%-6d %-12s %-8s %-12s %-5d %-25s %-8s %-10s %-6d %-7d%n",
                                  s.getId(),
                                  s.getFirst_Name(),
                                  s.getInitial(),
                                  s.getLast_Name(),
                                  s.getAge(),
                                  s.getEmail(),
                                  s.getGender(),
                                  s.getCourse(),
                                  s.getYear(),
                                  s.getSection());
                      }
                  }
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
