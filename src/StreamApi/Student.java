package StreamApi;

public class Student {
	int id;
	String name ;
	String dept;
	Student(int id, String name, String dept){
		this.id=id;
		this.name=name;
		this.dept=dept;
		
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	public String getname() {
		return name;
	}
	public void setname(String n){
		n=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id){
		this.id=id;
	}
	

}
