package mainpackage;

public class Students extends Person {
	
	private GradeLevel grade;
	
	public Students(GradeLevel grade){
		this.grade = grade;
	}
	
	
	public String toString(){
		return this + "\n" + this.getName();
	}
	
	
	public GradeLevel getClassStatus(){
		return grade;
		}
}
