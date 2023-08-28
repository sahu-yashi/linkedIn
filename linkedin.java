import java.io.IOException;

public class linkedin extends ReadInput{
    int numSection;
    boolean sectionMarked[];
    IntroductionSection introductionSectionObj;
    ExperienceSection experienceSectionObj;
    EducationSection educationSectionObj;
    ProjectSection projectSectionObj;
    public linkedin(){
        this.numSection=4;
        this.sectionMarked=new boolean[numSection];
        this.introductionSectionObj=null;
        this.experienceSectionObj=null;
        this.educationSectionObj=null;
        this.projectSectionObj=null;
    }
    public void initialiseSectionMarked(){
        for(int i=0;i<numSection;i++)
        sectionMarked[i]=false;
    }
    public void displayMenu(){
        System.out.println("Enter 1 to add Introduction Section");
        System.out.println("Enter 2 to add Experience Section");
        System.out.println("Enter 3 to add Education Section");
        System.out.println("Enter 4 to add Project Section");
    }
    
    public void addToLinkedin()throws IOException{
        System.out.println("Welcome to LinkedIn");
        boolean addMore=true;
        initialiseSectionMarked();

        while(addMore==true){
            
            boolean repeat=false;
            boolean isNew=false;
            displayMenu();
            int option=Integer.parseInt(ReadFromUser("Enter option:"));
            if(option>0 && option<=numSection){
                if(sectionMarked[option-1]==true){
                    boolean isValid=false;
                    while(isValid==false){
                        String s=ReadFromUser("Are you sure you want to rewrite this section? yes/no");
                        if(s.equalsIgnoreCase("yes")){isValid=true;repeat=true;}
                        else if(s.equalsIgnoreCase("no")){isValid=true;repeat=false;}
                        else{System.out.println("Invalid choice");}
                    }
                    // repeat=Boolean.parseBoolean(ReadFromUser("Are you sure you want to rewrite this section? true/false"));
                }
                else{sectionMarked[option-1]=true;
                    isNew=true;}
                if(repeat==true || isNew==true){
                    switch(option){
                        case 1:{
                            introductionSectionObj=new IntroductionSection();
                            introductionSectionObj.readIntroduction(); 
                            break;}
                        case 2:{
                            experienceSectionObj=new ExperienceSection();
                            experienceSectionObj.readExperience();
                            break;}
                        case 3:{
                            educationSectionObj=new EducationSection();
                            educationSectionObj.readEducation();
                            break;}
                        case 4:{
                            projectSectionObj=new ProjectSection();
                            projectSectionObj.readProject();
                            break;}
                        default:{System.out.println("Enter valid option");}
                    }


                }
                
                boolean isValid=false;
                while(isValid==false){
                    String s=ReadFromUser("yes to add more sections or Enter no");
                    if(s.equalsIgnoreCase("yes")==true){isValid=true;addMore=true;}
                    else if(s.equalsIgnoreCase("no")){isValid=true;addMore=false;}
                    else{System.out.println("Invalid choice");}
                }
            }// addMore=Boolean.parseBoolean(ReadFromUser("Enter true to add more sections or Enter false"));


        }
        
    }
    
    public static void main(String []args)throws IOException{
        linkedin ln=new linkedin();
        ln.addToLinkedin();
        fileWrite f=new fileWrite();
        f.outputIntroduction( ln.numSection, ln.introductionSectionObj);
        f.outputExperience( ln.numSection, ln.experienceSectionObj);
        f.outputProject( ln.numSection, ln.projectSectionObj);
        f.outputEducation( ln.numSection, ln.educationSectionObj);

    }
}
