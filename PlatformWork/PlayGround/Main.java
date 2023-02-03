package trace;

public final class Main {
    
    public static void main(String[] args) {    
      // Important: Trace will run main(), so don't delete this function!

        int ourInt = 400;

      System.out.println(ourInt); // prints out 400

      System.out.println(ourInt + 5); // prints out 405

      System.out.println(ourInt); // prints out 400 because our previous print statement did not actually change the value of ourInt

        ourInt = ourInt + 5;

      System.out.println(ourInt); // prints out 405 because the value of ourInt is now 400 + 5
    }

}