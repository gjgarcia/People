package mainpackage;


public class Employee extends Person {
	private String office;
	private String salary;
	private MyDate date_hired;
	
	
	
	public String toString(){
		return this +"\n" + this.getName();
	}
	
	
	public void setOffice(String office){
		this.office = office;
		}

		
	public String getSalary(){
		return salary;
		}

		
	public void setSalary(String salary){
		this.salary = salary;
		}

		
	public MyDate getMyDate(){
		return date_hired;
		}
}


