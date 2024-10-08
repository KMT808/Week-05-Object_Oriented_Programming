package Week05;

public class SpacedLogger implements Logger {

 String word;
  
 // constructor
  public SpacedLogger(String word) {
    this.word = word;
   }

  @Override
  // method to output the word with spaces between the letters
  public void log(String word) {
    for (int i = 0; i < word.length()-1; i++) {
      System.out.print(word.charAt(i) + " ");
    }
    System.out.println(word.charAt(word.length()-1));
    System.out.println();    // adding a blank line at the end to it easier to read
  }

  @Override
  // method to output ERROR: then the word with spaces between each letter
  public void error(String word) {
    System.out.print("ERROR: ");
    for (int i = 0; i < word.length()-1; i++) {
      System.out.print(word.charAt(i) + " ");
    }
    System.out.print(word.charAt(word.length()-1));
  }
}
