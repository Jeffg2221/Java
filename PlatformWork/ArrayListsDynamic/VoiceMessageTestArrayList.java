
import java.util.ArrayList;

public class VoiceMessageTestArrayList {
    public static void main(String[] args){
        VoiceMessageUtil vmUtil = new VoiceMessageUtil();
        ArrayList<String> todoList = new ArrayList<String>();
        todoList.add("Finish Alfred Bot");
        todoList.add("Finish Cafe business logic");
        todoList.add("Read ahead for oop");
        vmUtil.displayTodaysMessages(todoList);
    }
    
}
