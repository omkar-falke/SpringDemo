package demo;

public class Stud {
	private String sname;
	private Address addr;

	
public Stud(String sname,Address addr) {
	
	this.sname=sname;
	this.addr=addr;
}


	public void showData() {
		System.out.println(sname);
		System.out.println(addr.getCity());
	}
}
