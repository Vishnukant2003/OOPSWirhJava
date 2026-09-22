import java.io.Serializable;

public class Student2 implements  Serializable{
    String name;
    int rollno;
    String dept;
    public Student2(String name,int rollno,String dept){
        this.name= name;
        this.rollno=rollno;
        this.dept=dept;

    }
    @Override 
    public String toString(){
        return  name+" "+rollno+" "+dept+" " ;
    }
    
}