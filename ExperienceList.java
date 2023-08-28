import java.util.ArrayList;
class ExperienceList{
    String title;
    String description;
    String companyName;
    String location;
    ArrayList<String> skill;  
    enum employmentType{
        FULLTIME,PARTTIME,SELFEMPLOYED,FREELANCE,INTERNSHIP,TRAINEE
    }
    ExperienceList.employmentType empType;
    enum locationType{
        ONSITE,HYBRID,REMOTE
    }
    ExperienceList.locationType loctype;
    public ExperienceList(String title, String description, String companyName, String location,
            ArrayList<String> skill,String empType,String type) {
        this.title = title;
        this.description = description;
        this.companyName = companyName;
        this.location = location;
        this.skill = skill;
        this.empType=employmentType.valueOf(empType);
        this.loctype=locationType.valueOf(type);
    }

    
}