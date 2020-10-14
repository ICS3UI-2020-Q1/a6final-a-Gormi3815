import java.util.Scanner;
/** this program will ask for the correct awnsers and then compare them to the awnsers the student provided giving them a score at the end.
 *
 * @author Isaac
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner input = new Scanner (System.in);
    System.out.println("Please enter the correct awnsers");
    int[] awnsers = new int [5];
    for(int i = 0; i < awnsers.length; i++){
    awnsers[i] = input.nextInt();
    }
    System.out.println("Please enter the student awnsers");
    int[] stuawns = new int [5];
    for(int i = 0; i < stuawns.length; i++){
      stuawns[i] = input.nextInt();
    }    
    int done = 0;
     for(int i = 0; i < 5; i++){
       if((stuawns[i]) == (awnsers[i])){
         
         
       done = done + 1;
         }
     }
       System.out.println("Score " + done);
     
    }
  }

  

