import java.util.*;

public class Oops{
    
    public static void main(String args[]){
        Cars first=new Cars();
        System.out.println(first.carname);
        first.setCarname("Rolls Royce"
        );
        System.out.println(first.carname);

        //To see BankAccounts details
        BankAccounts ab=new BankAccounts();
        ab.getAccount_number();
        ab.setter_name("Priyanshu");
        ab.setter_number(44000000);
        ab.getAccount_number();
        ab.getHolder_name();
    }
}
class Cars{
        String carname="Defender";
        int price=44000000;
        void setCarname(String name){
            carname=name;
        }
        void setPrice(int price1){
            price=price1;
        }
    }

class BankAccounts{
    
    private String Holder_name="hello";
    private int account_number=1234;

    //without getter setter
    public void getHolder_name(){
        System.out.println(Holder_name);
    }
    public void getAccount_number(){
        System.out.println(account_number);
    }
    public void setter_name(String name){
        this.Holder_name=name;
    }
    public void setter_number(int val){
        this.account_number=val;
    }

}