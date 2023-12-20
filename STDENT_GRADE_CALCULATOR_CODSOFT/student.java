package STDENT_GRADE_CALCULATOR_CODSOFT;

public class student {
private int rollid;
private String name;
private int std;
private String address;
public int getRollid() {
	return rollid;
}
public void setRollid(int rollid) {
	this.rollid = rollid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getStd() {
	return std;
}
public void setStd(int std) {
	this.std = std;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "student [rollid=" + rollid + ", name=" + name + ", std=" + std + ", address=" + address + "]";
}
public student() {
	super();
	// TODO Auto-generated constructor stub
}
public student(int rollid, String name, int std, String address) {
	super();
	this.rollid = rollid;
	this.name = name;
	this.std = std;
	this.address = address;
}



}
