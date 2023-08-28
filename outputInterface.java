import java.io.IOException;

interface Output{
    public void outputIntroduction(int numSection, IntroductionSection introductionSectionObj) throws IOException;
    public void outputExperience(int numSection, ExperienceSection experienceSectionObj) throws IOException;
    public void outputEducation(int numSection, EducationSection educationSectionObj) throws IOException;
    public void outputProject(int numSection, ProjectSection projectSectionObj) throws IOException;
             
            
}
