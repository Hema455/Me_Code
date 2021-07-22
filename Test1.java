import java.io.*;  
import java.io.BufferedReader;  
public class Test1  
{  
public static void main(String[] args)   
{  
String file ="C:\\Users\\61423\\Desktop\\Me_Code_file\\List.csv";
String line="";
try{
BufferedReader br= new BufferedReader(new FileReader(file));

while((line=br.readLine())!=null){
    String[] values= line.split(",");
    System.out.print(values[0]);
    //System.out.print(values[1]);
    //System.out.print(values[2]);
    System.out.println("");
}
}catch(FileNotFoundException e){
    e.printStackTrace();
}catch(IOException e){
    e.printStackTrace();
}


}
}