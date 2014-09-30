package mainpackage;

public class Faculty_Member extends Employee {
	private String Officehours;
	private String Rank;
	
	
	public String toString(){
		return this + "\n" + this.getName();
	}
	
	public Faculty_Member(String office_hours, String rank){
		this.Officehours = office_hours;
		this.Rank = rank;
		}
		public String getOfficeHours(){
		return Officehours;
		}

		public void setOfficeHours(String office_hours){
		this.Officehours = office_hours;
		}

		public String getRank(){
		return Rank;
		}

		public void setRank(String rank){
		this.Rank = rank;
		}
}
