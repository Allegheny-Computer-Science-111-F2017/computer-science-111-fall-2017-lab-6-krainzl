package labsix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 * This program manipulates DNA string.
 * The program will display the compliment and different random mutations.
 *
 * <p>Bugs: This program has no known bugs
 *
 * @author Leah Krainz
 */


public class ManipulateDna {

  /** The main entry point for ManipulateDna.
   *  The source code inside of this method will be executed when the program
   *  is run in the command-line. The output of this program will appear in the
   *  terminal window. The println statements make this program display output.
   *  The program will display a word find.
   *  
   * @param args The command-line arguments
   **/


  public static void main(String[] args) {
    // display the name of the programmer and the date
    System.out.println("Leah L. Krainz " + new Date());
    // declare the starting file and scanner
    File dnaInputsFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      dnaInputsFile = new File("input/dna_inputs.txt");
      scanner = new Scanner(dnaInputsFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }
    // Step One: Read in and display the chosen DNA string
    String seq1 = scanner.nextLine();
    System.out.println("Okay, I am going to manipulate the DNA Sequence " + seq1);

    // Step Two: Compute the complement of the DNA String
    // replacements are lowercase
    String adComp = seq1.replace('a','T');
    String thyComp = adComp.replace('t','A');
    String guaComp = thyComp.replace('g','C');
    String comp = guaComp.replace('c','G');
    
    //comp = comp.toUpperCase();
    System.out.println("The DNA compliment to this strand is " + comp);

    seq1 = seq1.toUpperCase();
    // Step Three: Insert a randomly chosen DNA letter into the DNA String
    Random mutation = new Random();//calls random
    int num1 = mutation.nextInt(4); //Bounds of what can be chosen
    char insertion = "ATGC".charAt(num1);//calls char at ran num
    String insertMut = insertion + seq1;
    System.out.println("An example of a random insertion is: " + insertMut);
    
        

    // Step Four: Delete a DNA letter from a randomly chosen position in the DNA string. 

    int num2 = mutation.nextInt(4);
    //calls stringbuilder, allows easy manip
    StringBuilder delete = new StringBuilder(seq1);
    delete.deleteCharAt(num2);// deletes at a randomly generated index
    System.out.println("An example of a random deletion is: " + delete);
    
    
    
    // Step Five: Change a random position in the DNA String to a randomly chosen DNA letter.
     
    int num3 = mutation.nextInt(4);
    char change = "ATGC".charAt(num3);
    int num4 = mutation.nextInt(4);
    StringBuilder swap = new StringBuilder(seq1); //line 71
    swap.setCharAt(num4, change);//Allows me to say which index (random)
    // and what character (also random) is subbed in. 

    System.out.println("An example of a random base change is: " + swap);
    
    

    // Step Six: Display a final thankyou message
    System.out.println("Thank you for using the DNA Manipulation program.");

  }

}
