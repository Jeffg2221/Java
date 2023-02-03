
import java.util.ArrayList;

public class VoiceMessageTest {
    public static void main(String[] args){
        VoiceMessageUtil vmUtil = new VoiceMessageUtil();
                vmUtil.greeting("Radyn");
                vmUtil.greeting(5);
                vmUtil.getCurrentDate();

                String[] messagesPerDay = {"string1","string2","string3"};

                System.out.println(vmUtil.totalMessages(messagesPerDay));
                vmUtil.displayTodaysMessages(messagesPerDay);
    }
    
}
