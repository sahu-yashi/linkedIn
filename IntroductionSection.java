import java.io.IOException;

public class IntroductionSection extends ReadInput{
    private String name;
    private String industry;
    private String currentPosition;
    private String location;
    private String summary;
    private String phoneNum;
    private boolean openTo;
    public IntroductionSection(){
        name="";
        industry="";
        currentPosition="";
        location="";
        summary="";
        phoneNum="";
        openTo=false;
        inp="";
        cmdReader=null;
    }
    public void setName(String n){
        this.name=n;
    }
    public String getName(){
        return this.name;
    }
    public void setIndustry(String i){
        this.industry=i;
    }
    public String getIndustry(){
        return this.industry;
    }
    public void setCurrentPosition(String p){
        this.currentPosition=p;
    }
    public String getCurrentPosition(){
        return this.currentPosition;
    }
    public void setLocation(String l){
        this.location=l;
    }
    public String getLocation(){
        return this.location;
    }
    public void setSummary(String s){
        this.summary=s;
    }
    public String getSummary(){
        return this.summary;
    }
    public void setPhoneNum(String p){
        this.phoneNum=p;
    }
    public String getPhoneNum(){
        return this.phoneNum;
    }
    public void setOpenTo(boolean o){
        this.openTo=o;
    }
    public boolean getOpenTo(){
        return this.openTo;
    }
    public void readIntroduction() throws IOException{
        setName(ReadFromUser("Name"));
        setIndustry(ReadFromUser("Industry"));
        setCurrentPosition(ReadFromUser("Current Position"));
        setLocation(ReadFromUser("Current Location"));
        setPhoneNum(ReadFromUser("Phone Number"));
        setSummary(ReadFromUser("Summary"));
        String choice="";
        boolean isValid=false;
        while(isValid==false)
            {choice=ReadFromUser("Are you open to job? Enter yes/no");
            if(choice.equalsIgnoreCase("yes"))
                {setOpenTo(true);isValid=true;}
            else if(choice.equalsIgnoreCase("no"))
                {setOpenTo(false);isValid=true;}
            else
                System.out.println("Invalid Choice");}
    }


    
}
