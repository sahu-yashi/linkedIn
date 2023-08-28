import java.io.*;
import java.util.*;
public class ProjectSection extends ReadInput{
    ArrayList<ProjectList> projectSectionList;
    public ProjectSection(){
        projectSectionList=new ArrayList<>();
    }
    public void readProject()throws IOException{
        boolean cont=true;
        while(cont==true){
            ArrayList<String> contributorList=new ArrayList<>();
            String projectName=ReadFromUser("Project name");
            String description=ReadFromUser("Description");
            boolean isValid=false;
            boolean isCurrentlyWorking=false;
            while(isValid==false){
                String s=ReadFromUser("yes if currently working on this or enter no");
                if(s.equalsIgnoreCase("yes")==true){isValid=true;isCurrentlyWorking=true;}
                else if(s.equalsIgnoreCase("no")==true){isValid=true;isCurrentlyWorking=false;}
                else{System.out.println("Invalid choice");}
            }
            // boolean isCurrentlyWorking=Boolean.parseBoolean(ReadFromUser("true if currently working on this or enter false"));
            String associatedWith=ReadFromUser("Institute associated with");
            boolean isContributor=true;
            while(isContributor==true){
                contributorList.add(ReadFromUser("Contributor"));
                boolean isvalid=false;
                while(isvalid==false){
                    String s=ReadFromUser("yes to continue and no if no more contributors to add");
                    if(s.equalsIgnoreCase("yes")){isvalid=true;isContributor=true;}
                    else if(s.equalsIgnoreCase("no")){isvalid=true;isContributor=false;}
                    else{System.out.println("Invalid choice");}
                }

                // isContributor=Boolean.parseBoolean(ReadFromUser("true to continue and false if no more contributors to add"));
            }
            ProjectList obj=new ProjectList(projectName, description, isCurrentlyWorking, contributorList, associatedWith);
            projectSectionList.add(obj);
            // cont=Boolean.parseBoolean(ReadFromUser("Enter true to add more projects or enter false"));
            isValid=false;
            while(isValid==false){
                    String s=ReadFromUser("Enter yes to add more projects or enter no");
                    if(s.equalsIgnoreCase("yes")){isValid=true;cont=true;}
                    else if(s.equalsIgnoreCase("no")){isValid=true;cont=false;}
                    else{System.out.println("Invalid choice");}
                }
        }
    }
}
