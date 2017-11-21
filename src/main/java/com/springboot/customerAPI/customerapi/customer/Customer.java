package com.springboot.customerAPI.customerapi.customer;

public class Customer {

	private String id;
	private String fName;
	private String lName;
	private String email;
	private Integer pincode;
	private String birthdate;
	private boolean isActive = true;
	
	
	public Customer(){}
	
	public Customer(String id, String fName, String lName, String email, Integer pincode, String birthdate) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.pincode = pincode;
		this.birthdate = birthdate;
		this.isActive = true;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	

public boolean equals(Object object) {
	if (this == object)
		return true;
	if (object == null)
		return false;
	if (getClass() != object.getClass())
		return false;
	Customer c = (Customer) object;

	//return this.getId() ==c.getId()? true : false;
	
	return c.getId().equals(this.getId())? true : false;
	
	/*if (c.getId() == this.getId()) 
		return true;
	  if (!(c.getId().equals(this.getId())))
		return false;
	*/
	
	
	
    
}
/*public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (!(obj instanceof Emp))
        return false;
    Emp other = (Emp) obj;
    return code == null ? other.code == null : code.equals(other.code);
}
*/	
	
}
