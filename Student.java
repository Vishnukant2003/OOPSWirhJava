public class Student {
    private Address1 address;
    private String sname;
    private int age;
    private String gpa;

    public void setname(String sn) {
        sname = sn;

    }

    public void getname() {
        System.err.println(sname);
    }

    public void setage(int ag) {
        age = ag;
    }

    public void getage() {
        System.err.println(age);
    }

    public void setgpa(String g) {
        gpa = g;
    }

    public void getgpa() {
        System.err.println(gpa);
    }

    public Address1 getAddress1() {
        return this.address;
    }

    public void setAddress1(Address1 addr) {
        this.address = addr;

    }

    public void getstd() {
        System.err.println(sname + " " + age + " " + gpa + " ");
        if (address != null) {
            address.getAddress1(); // Prints the associated address
        }
    }

}
