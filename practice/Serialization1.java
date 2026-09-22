// package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.*;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization1 implements Serializable {
    public static void main(String[] args) throws Exception{

        Student2 std = new Student2("vishnu", 101,"it");

        System.out.println(std);

        FileOutputStream fos = new FileOutputStream("student.data");
        ObjectOutputStream ops= new ObjectOutputStream(fos);
        ops.writeObject(std);

        FileInputStream ios = new FileInputStream("student.data");
        ObjectInputStream ois=new ObjectInputStream(ios);
        Student2 std2 = (Student2)ois.readObject();
        System.out.println("de-serialization"+std2);

    }
    
}
