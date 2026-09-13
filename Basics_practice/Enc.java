package Basics_practice;

public class Enc {
    private String name;
    private String city;
    private int age;

    Enc(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;

    }

    public void getdata() {
        System.err.println(name + " " + city + " " + age);
    }

    public static void main(String[] args) {
        Enc enc = new Enc("Vishnu ", "pune", 23);
        // enc.setdata()
        enc.getdata();
    }

}
