public class Address {
    public static void main(String[] args) {
        Person person = new Person();
        // Student std=new Student();
        std.setname("");
        person.setname("vishnu");
        person.getAddress1().setAddress1("Mandai", "pune", "Maharastra");
        person.disPer();
    }
}

class Address1 {
    String street;
    String city;
    String state;

    public void setAddress1(String st, String c, String s) {
        street = st;
        city = c;
        state = s;
    }

    public void getAddress1() {
        System.err.println(street + " " + city + " " + state);
    }

}

class Person {
    private String name;
    private Address1 address = new Address1();

    public void setname(String n) {
        name = n;
    }

    public void getname() {
        System.err.println(name);
    }

    public Address1 getAddress1() {
        return this.address;
    }

    public void disPer() {

        System.err.println(" " + name);
        address.getAddress1();

    }

}

// Composition and Aggregation: Create a class Address with attributes street,
// city, and state.
// Then create a class Person with attributes name and an Address object.
// Demonstrate how to use com Write a Java class representing a Student.
// Encapsulate the student's name, age, and grade point average (GPA) with
// private access modifiers. Provide getter and setter methods to access and
// modify these attributes position to model the relationship between a person
// and their address