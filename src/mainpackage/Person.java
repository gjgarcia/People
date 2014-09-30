package mainpackage;

public class Person {
	private String name;
	private String address;
	private String phonenumber;
	private String emailaddress;
	
	public String getName(){
		return this.name;
	}
	
	
	
	public void setName(String name){
		this.name = name;
		}

		
	
	public String getAddress(){
		return address;
		}

		
	
	public void setAddress(String address){
		this.address = address;
		}

		
	
	public String getPhone(){
		return phonenumber;
		}

		
	
	public void setPhone(String phone){
		this.phonenumber = phone;
		}

		
	public String getEmail(){
		return emailaddress;
		}

		
	public void setEmail(String email){
		this.emailaddress = email;
		}

		@Override
		
		public String toString(){
		return getClass().getName() + "\n" + name;
		}
}
