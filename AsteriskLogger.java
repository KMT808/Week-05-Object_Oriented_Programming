package Week05;


public class AsteriskLogger implements Logger{

  String word;
  
  // constructor
  public AsteriskLogger(String word) {
   this.word = word;
  }

  @Override
  // method to display the word with three asterisks before and after
  public void log(String word) {
    System.out.println("***" + word + "***"); 
    System.out.println();    // Added a blank line to make it easier to read
  }

  @Override
  // method to display 3 rows, the first and third are a line of asterisks. The middle line shows three asterisks before and after the ERROR: word
  public void error(String word) {
    System.out.println("*********************");
    System.out.println("***ERROR: " + word + "***");
    System.out.println("*********************");
    System.out.println();     // Added a blank line to make it easier to read
  }   
}
