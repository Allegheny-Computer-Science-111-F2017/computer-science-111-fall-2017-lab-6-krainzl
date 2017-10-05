package labsix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;
import java.util.Random;

public class ManipulateDna {

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

    // Step Three: Insert a randomly chosen DNA letter into the DNA String
    Random mutation = new Random();
    num1 = insertation.nextInt(4);
    char insertion = "ATGC".charAt(num1);
    String insertMut = insertion + seq1;
    System.out.println("insertMut");
    
        

    // Step Four: Delete a DNA letter from a randomly chosen position in the DNA string

    // Step Five: Change a random position in the DNA String to a randomly chosen DNA letter

    // Step Six: Display a final thankyou message
    System.out.println("Thank you for using the DNA Manipulation program.");

  }

}
