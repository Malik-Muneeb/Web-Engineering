public class AddressBook 
{
	String name, address, phone, email;
	
	AddressBook()
	{
		
	}
	AddressBook(String name, String address, String phone, String email)
	{
		this.name=name;
		this.address=address;
		this.phone=phone;
		this.email=email;
	}
	
	void setName(String name) { this.name=name;}
	void setAddress(String address) {this.address=address;}
	void setPhone(String phone) { this.phone=phone;}
	void setEmail(String email) {this.email=email;}
	
	String getName() { return name;}
	String getAddress() {return address;}
	String getPhone() { return phone;}
	String getEmail() {return email;}
	
	
}
