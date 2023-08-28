import java.io.IOException;
import java.util.*;
public class ExperienceSection extends ReadInput{
    ArrayList<ExperienceList> experienceSectionList;
    public ExperienceSection(){
        experienceSectionList=new ArrayList<>();
    }
    public void addExperience(ExperienceList obj){
        experienceSectionList.add(obj);
    }

    public void readExperience() throws IOException{
        
        boolean cont=true;
        while(cont==true){
            ArrayList<String> skillList=new ArrayList<>();
            String title=ReadFromUser("Tile");
            String compName=ReadFromUser("Company Name");
            String desc=ReadFromUser("Description");
            String loc=ReadFromUser("Location");
            String EmpType=ReadFromUser("Employment Type: fullTime/partTime/selfEmployed/freelance/internship/trainee").toUpperCase();
            String locType=ReadFromUser("Location type: onSite/hybrid/remote").toUpperCase();
            boolean isSkill=true;
            while(isSkill==true){
                skillList.add(ReadFromUser("skill"));
                String choice="";
                boolean isValid=false;
                while(isValid==false)
                    {choice=ReadFromUser("yes to continue and no if no more skills to add");
                    if(choice.equalsIgnoreCase("yes"))
                        {isValid=true;}
                    else if(choice.equalsIgnoreCase("no"))
                        {isValid=true;isSkill=false;}
                    else
                        System.out.println("Invalid Choice");}
                
            }
            ExperienceList obj=new ExperienceList(title,desc,compName,loc,skillList,EmpType,locType);
            addExperience(obj);
            boolean isValid=false;
            while(isValid==false){
            // cont=Boolean.parseBoolean(ReadFromUser("yes to add more experience or enter no"));
                String temp=ReadFromUser("yes to add more experience or enter no");
                if(temp.equalsIgnoreCase("yes")){isValid=true;cont=true;}
                else if(temp.equalsIgnoreCase("no")){isValid=true;cont=false;}
                else{System.out.println("Invalid choice");}
            }   
        }
    }
}
