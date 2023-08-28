import java.io.*;
class ReadInput{
    public String inp;
    public BufferedReader cmdReader;
    public String ReadFromUser(String value)throws IOException{
        cmdReader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter "+value);
        boolean isCorrect=false;
        String val="";
        while(isCorrect==false){
            val=cmdReader.readLine();
            if(val.equals("")){
                System.out.println("The value can not be null");
            }
            else isCorrect=true;
        }
        return (val);}

        
}

