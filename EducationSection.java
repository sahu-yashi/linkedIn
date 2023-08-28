import java.io.IOException;
import java.util.ArrayList;

public class EducationSection extends ReadInput {
    ArrayList<EducationList> educationSectionList;
    public EducationSection(){
        educationSectionList=new ArrayList<>();
    }
    public void readEducation() throws IOException{
        boolean cont=true;
        while(cont==true){
            String school=ReadFromUser("School");
            String degree=ReadFromUser("Degree");
            String fieldOfStudy=ReadFromUser("Field of Study");
            String grade =ReadFromUser("grade");
            String description =ReadFromUser("description");
            EducationList obj=new EducationList(school, degree, fieldOfStudy, grade, description);
            educationSectionList.add(obj);
            boolean isValid=false;
            while(isValid==false){
                String choice=ReadFromUser("yes to add more education or enter no");
                if(choice.equalsIgnoreCase("yes")==true){isValid=true;cont=true;}
                else if(choice.equalsIgnoreCase("no")==true){isValid=true;cont=false;}
                else{System.out.println("Enter valid choice");}
            }

            // cont=Boolean.parseBoolean(ReadFromUser("true to add more education or enter false"));

        }
    } 
}
