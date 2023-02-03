
import java.util.Date;
import java.util.ArrayList;

public class VoiceMessageUtil {

    public void greeting(String name) {
        System.out.println("Hello " + name);

    }
    public void greeting(int count) {
        System.out.println("Hello " + count);

    }
    public void getCurrentDate(){
        Date today = new Date();
        System.out.println("Hello, the current date is: " + today);
    }
    public int totalMessages(String[] messages){
        int counter = 0;
        for(int i = 0; i < messages.length; i++){
            counter++;
        }
        return counter;

    }
    public void displayTodaysMessages(String[ ]todaysMessages){
        for(int i = 0; i < todaysMessages.length; i++){
            System.out.println(todaysMessages[i]);
        }
    }

    public void displayTodaysMessages(ArrayList<String>todaysMessages){
        for(int i = 0; i < todaysMessages.size(); i++){
            System.out.println(todaysMessages.get(i));
        }
    }


}
