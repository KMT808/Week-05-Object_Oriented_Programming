package Week05;

public class App {

  public static void main(String[] args) {
    
    // Set word as Goodbye
    String word = "Goodbye";

    // Created instances 
    AsteriskLogger logAsterisk = new AsteriskLogger(word);
    AsteriskLogger errorAsterisk = new AsteriskLogger(word);
    SpacedLogger logSpaced = new SpacedLogger(word);
    SpacedLogger errorSpaced = new SpacedLogger(word);

    // Added heading and a line of dashes to make the Asterisk Logger output easier to read
    System.out.println("Asterisk Logger");
    System.out.println("-------------------------");
    logAsterisk.log(word);      // calling the log method from the Asterisk class for the logAsterisk instance
    errorAsterisk.error(word);  // calling the error method from the Asterisk class for the errorAsterisk instance

    //// Added heading and a line of dashes to make the Spaced Logger output easier to read
    System.out.println("Spaced Logger");
    System.out.println("-------------------------");
    logSpaced.log(word);       // calling the log method form the SpacedLogger class for the logSpaced instance
    errorSpaced.error(word);   // calling the error method from the SpacedLogger class for the errorSpaced instance
  }
}
