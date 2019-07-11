package Student;

public class Stud {

	public Stud() {
		System.out.println("----------------------");
	}
	
	private String name;
	private Address addr;
	
	public Stud(String name,Address addr) {
		
		this.name=name;
		this.addr=addr;
	}
	
	public void showData()
	{
		System.out.println(name);
		System.out.println(addr.getCityname());
	}
}
