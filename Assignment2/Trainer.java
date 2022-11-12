package Assignment2;

public class Trainer 
{
	String name,dept,email;
	int id;

	public static void main(String[] args) {
	
		
/*
		Trainer trainer1= new Trainer("Mukesh","mukesh@gmail.com",1);
		Trainer trainer2= new Trainer("Hitesh","mukesh@gmail.com",2);
		Trainer trainer3= new Trainer("Mukesh","mukesh@gmail.com",3);
		trainer1.teach();
		trainer2.teach();
		trainer3.teach();
*/
		TrainerExt[] obj=new TrainerExt[3];
	obj[0]=new TrainerExt("Mukesh","mukesh@gmail.com",1);
	obj[1]=new TrainerExt("Hitesh","mukesh@gmail.com",2);
	obj[2]=new TrainerExt("Mukesh","mukesh@gmail.com",3);
		obj[0].display();
		obj[1].display();
		obj[2].display();
	}
	
	public Trainer(String strname,String emailid,int empid)
	{
		name = strname;
		email=emailid;
		id=empid;
	}

	public void teach()
	{
		if(id==1)
		{ 
			System.out.println("Name:"+name);
			System.out.println("Email:"+email);
			System.out.println("ID:"+id);
			System.out.println("Department:Testing");
			
		}
		else if(id==2)
		{ 
			System.out.println("Name:"+name);
			System.out.println("Email:"+email);
			System.out.println("ID:"+id);
			System.out.println("Department:Development");
			
		}
		else if(id==3)
		{ 
			System.out.println("Name:"+name);
			System.out.println("Email:"+email);
			System.out.println("ID:"+id);
			System.out.println("Department:Devops");
			
		}
	}
}
