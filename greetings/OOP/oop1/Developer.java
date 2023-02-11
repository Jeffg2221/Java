import java.util.ArrayList;

public class Developer {
    // attributes
    public String name;
    public ArrayList<String> languages;
    public boolean employed;
    public int salary;
    public double hoursOfSleep;
    public ArrayList<Project> projects;

    // Methods
    public String displayStats(){
        String output = "name: " + this.name + "\n";
        output += "salary: " + this.salary + "\n";
        output += "employed: " + this.employed + "\n";
        output += "hours of sleep: " + this.hoursOfSleep + "\n";
        output += "languages: " + this.languages + "\n";
        output += "projects: " + this.projects + "\n";
        return output;
    }

    public void addProject(){
        
    }
    
}
