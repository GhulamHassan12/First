package qajob.First;
class student
{
	public void Dep()
	{
		
		System.out.println("Depertement is IT");
		
	}	
}	
   class Laptop extends student
{
	  public void Company()
	  {
		  System.out.println("HP company ");
	  }
   
}

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//student var=new student();
		//var.Dep();
		Laptop L=new Laptop();
		L.Dep();
		L.Company();
		

	}

}
