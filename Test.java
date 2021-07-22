import java.io.File;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Test {
private static Scanner x;

    public static void main(String[] args) {
        String file ="C:\\Users\\61423\\Desktop\\Me_Code_file\\List.csv";
        //System.out.println("triggered");
        //Scanner input=new Scanner(System.in);
        String record="TX10001";
        //System.out.print("Enter the Account Number");
        //record=input.next();
        //System.out.println(record);
        read(record,file);
    }
    public static void read(String record,String file) {
        boolean found= false;
        String TransactionID="";String fAccountID="";String toAccountId=""; String createdAt="";String amount="";String transactionType="";String relatedTransaction="";
        try{
            x=new Scanner(new File(file));
            x.useDelimiter("[,\n]");
            while(x.hasNext() && !found)
            {
                TransactionID=x.next();
                fAccountID=x.next();
                toAccountId=x.next();
                createdAt=x.next();
                amount=x.next();
                transactionType=x.next();
                relatedTransaction=x.next();
                if(TransactionID.equals(record)){
                    found=true;

                }

            }
            if(found){
                JOptionPane.showMessageDialog(null,"TransactionID:"+TransactionID + "fromAccountId: "+fAccountID+ "toAccountId:"+toAccountId +"createdAt:"+createdAt+"amount"+amount+"transactionType:"+transactionType+"relatedTransaction:"+relatedTransaction);
            }else{
                JOptionPane.showMessageDialog(null,"Record not found");
            }
        }catch(Exception e){
            e.getStackTrace();
        }
    }
    
}