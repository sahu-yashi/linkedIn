import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class fileWrite implements Output {
    File csvFile ;
    FileWriter fileWriter;
    
    public fileWrite() {
        this.csvFile = null;
        this.fileWriter = null;
    }

    public void outputIntroduction(int numSection, IntroductionSection introductionSectionObj) throws IOException {
        try{
            if(introductionSectionObj!=null)
                {csvFile=new File("Introduction");
                fileWriter=new FileWriter(csvFile);
                fileWriter.append("NAME"+','+introductionSectionObj.getName()+'\n');
                fileWriter.append("INDUSTRY"+','+introductionSectionObj.getIndustry()+'\n');
                fileWriter.append("CURRENT POSITION"+','+introductionSectionObj.getCurrentPosition()+'\n');
                fileWriter.append("LOCATION"+','+introductionSectionObj.getLocation()+'\n');
                fileWriter.append("PHONE NO."+','+introductionSectionObj.getPhoneNum()+'\n');
                fileWriter.append("SUMMARY"+','+introductionSectionObj.getSummary()+'\n');
                fileWriter.append("OPEN TO"+','+introductionSectionObj.getOpenTo());}
        
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            fileWriter.close();
        }

       
    }

    @Override
    public void outputExperience(int numSection, ExperienceSection experienceSectionObj) throws IOException{
        try {
            if(experienceSectionObj!=null)
                {csvFile=new File("Experience");
                fileWriter=new FileWriter(csvFile);
                for(ExperienceList obj:experienceSectionObj.experienceSectionList){
                    fileWriter.append("TITLE"+','+obj.title+'\n');
                    fileWriter.append("DESCRIPTION"+','+obj.description+'\n');
                    fileWriter.append("COMPANY NAME"+','+obj.companyName+'\n');
                    fileWriter.append("EMPLOYMENT TYPE"+','+obj.empType+'\n');
                    fileWriter.append("LOCATION TYPE"+','+obj.loctype+'\n');
                    for(String s:obj.skill){
                        fileWriter.append("SKILL"+','+s+'\n');
                        
                    }

                }
                }
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        finally{
            fileWriter.close();
        }
    }

    @Override
    public void outputEducation(int numSection, EducationSection educationSectionObj) throws IOException {
        try {
            if(educationSectionObj!=null)
                { csvFile=new File("Education");
                    fileWriter=new FileWriter(csvFile);
                    for(EducationList obj:educationSectionObj.educationSectionList){
                        fileWriter.append("SCHOOL"+','+obj.school+'\n');
                        fileWriter.append("DEGREE"+','+obj.degree+'\n');
                        fileWriter.append("FIELD OF STUDY"+','+obj.fieldOfStudy+'\n');
                        fileWriter.append("GRADE"+','+obj.grade+'\n');
                        fileWriter.append("DESCRIPTION"+','+obj.description+'\n');
                        

                    }
                }
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        finally{
           fileWriter.close(); 
        }
    }

    @Override
    public void outputProject(int numSection, ProjectSection projectSectionObj) throws IOException {
        try {
            if(projectSectionObj!=null)
                { csvFile=new File("Project");
                    fileWriter=new FileWriter(csvFile);
                    for(ProjectList obj:projectSectionObj.projectSectionList){
                        fileWriter.append("PROJECT NAME"+','+obj.projectName+'\n');
                        fileWriter.append("DESCRIPTION"+','+obj.description+'\n');
                        fileWriter.append("CURRENTLY WORKING"+','+obj.isCurrentlyWorking+'\n');
                        fileWriter.append("ASSOCIATED WITH"+','+obj.associatedWith+'\n');
                    
                        for(String s:obj.contributors){
                            fileWriter.append("CONTRIBUTORS"+','+s+'\n');
                            
                        }

                    }
                }
            
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        finally{
            fileWriter.close();
        }
    }
    
}
