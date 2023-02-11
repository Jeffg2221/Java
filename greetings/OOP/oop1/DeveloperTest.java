import java.util.ArrayList;

public class DeveloperTest {
    public static void main(String[] args){
        System.out.println("--------Developer Test--------");
        Developer dev1 = new Developer();
        dev1.name = "Anikan Skywalker";
        dev1.salary = 100000;
        dev1.employed = true;
        dev1.hoursOfSleep = 5.2;
        dev1.languages = new ArrayList<String>();
        dev1.languages.add("Java");
        dev1.languages.add("JavaScript");
        System.out.println(dev1.displayStats());


        Project project1 = new Project();
        project1.title = "Lookify";
        project1.language = " JavaScript";

        Project project2 = new Project();
        project2.title = "AirBnB Clone";
        project2.language = " Java";

    }
}
