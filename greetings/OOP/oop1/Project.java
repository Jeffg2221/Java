

public class Project {
    public String title;
    public String language;

    public String displayInfo(){
        String output = "title: " + this.title + "\n";
        output += "language : " + this.language + "\n";
        return output;
    }
}
