public class Main {
    public static void main(String[] args) {
        // --- Testing the Student Class ---
               System.err.println("--- Student Profile ---");
        Student student = new Student();
        student.setname("Vishnu");
        student.setage(21);
        student.setgpa("3.8");

        // CORRECTION: Changed from getAddress() to getAddress1() to match the class method name
        student.getAddress1().setAddress1("Mandai", "Pune", "Maharashtra");
        
        // CORRECTION: Changed from displayStudentInfo() to getstd() to match the class method name
        student.getstd(); 

        System.err.println("\n--- Person Profile ---");
        // --- Testing the Person Class ---
        Person person = new Person();
        person.setName("Amit");
        person.getAddress().setAddress1("MG Road", "Mumbai", "Maharashtra");
        person.displayPersonInfo();
    }
}

