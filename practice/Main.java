// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Customer {
    String name;
    String address;
    int id;
    int phone ;
    public  Customer( String name ,String address,int id,int phone ){
        this.name=name;
        this.address=address;
        this.id=id;
        this.phone=phone;
    }
    public void dips(){
        System.out.println(name+address+id+phone);
    }
    
}
class Account{
   String type ;
   int accNu;
    double balance;
    // double minBalance;
    public  Account( String type ,int accNu,double balance ){
        this.type=type;
        this.accNu=accNu;
        this.balance=balance;
    }
    
    public int calcuInterest(){
        System.out.println("interest: "+"with interest"++type+" "+accNu+" "+balance+"" );
    }
}
public class Main{
       public static void main(String[] args){
         Customer cu = new Customer("Vishnu","Pune",101,128);
           cu.dips();
           Account ac = new Account("Saving",1422,1000*5*2);
           ac.calcuInterest();
          
       } 

    
}