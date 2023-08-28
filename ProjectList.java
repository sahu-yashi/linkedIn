import java.util.*;
public class ProjectList {
    String projectName;
    String description;
    boolean isCurrentlyWorking;
    ArrayList<String> contributors;
    String associatedWith;
    public ProjectList(String projectName, String description, boolean isCurrentlyWorking,
            ArrayList<String> contributors, String associatedWith) {
        this.projectName = projectName;
        this.description = description;
        this.isCurrentlyWorking = isCurrentlyWorking;
        this.contributors = contributors;
        this.associatedWith = associatedWith;
    }
}
