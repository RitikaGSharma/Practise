package Assignment2;

public class TrainerExt {

	String name1;
	String email1;
	int id1;
	public TrainerExt(String name1,String email1,int id1)
	{
this.name1=name1;
this.email1=email1;
this.id1=id1;
	}
public void display()
{
System.out.println("Name is:"+name1);
System.out.println("Email is:"+email1);
System.out.println("Id is:"+id1);
}
}