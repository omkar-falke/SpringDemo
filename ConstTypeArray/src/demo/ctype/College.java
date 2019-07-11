package demo.ctype;

public class College {

	public College() {
		System.out.println("Const Calling ..............");
	}
	private int id;
	private String cName;
	private String[] cAdd;
	
	
	public College(int id,String cName,String[] cAdd) {
		this.id=id;
		this.cName=cName;
		this.cAdd=cAdd;
	}
	
	public void showData()
	{
		System.out.println("Id"+":"+id);
		System.out.println("Name"+":"+cName);
		for(String s:cAdd)
		{
			System.out.println("Branch"+":"+s);
		}
	}
	
}
