int day = 2;
switch(day){ 
        //  We start with the switch keyword and pass in the variable we are checking.
// Inside of the switch statement, we specify what we want to happen for each possible case.  
	case 1:
		System.out.println("Monday");
		break;
        // Be sure to include the break keyword after each case. This will ensure that our program gets out of the switch block once the desired value has been found.
	case 2:
		System.out.println("Tuesday");
		break;
	case 3:
		System.out.println("Wednesday");
		break;
	case 4:
		System.out.println("Thursday");
		break;
	case 5:
		System.out.println("Friday");
		break;
	case 6:
		System.out.println("Saturday");
		break;
	case 7:
		System.out.println("Sunday");
		break;
	default:
    // Including a default keyword at the bottom of our switch statemen is equivalent to the else keyword in an if statement.
		System.out.println("There are only seven days in a week...");
}

package trace;

public final class Main {
    
    public static void main(String[] args) {   
      // Your friend has asked you to watch the replay of a game you missed 
      int goals = 3;
      boolean watchReplay = false;

      System.out.println("Are we watching this?");

      switch(goals){
        case 0:
          System.out.println("Sounds like a boring game.");
		      break;
        case 1:
          System.out.println("Was it a good goal?");
          watchReplay = true;
		      break;
        case 2:
          System.out.println("Was it a tie?");
          watchReplay = true;
		      break;
        case 3:
          System.out.println("I can't wait to see it!");
          watchReplay = true;
		      break;
        default:
          System.out.println("More than 3 goals? I'm in!");
          watchReplay = true;
      }

      System.out.println(watchReplay ? "I'll see you in a bit." : "I'll pass.");
    }

}
