package StreamApi;

public class StdGrade {
	int id;
	String name ;
	String dept;
	double grade;
	
	StdGrade(int id, String name, String dept,double grade){
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.grade=grade;
		
		
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dept=" + dept+grade +"]";
	}
	
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	
	

}
