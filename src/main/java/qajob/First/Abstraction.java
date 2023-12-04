package qajob.First;

public class Abstraction extends ChildAbstration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Abstraction var=new Abstraction();
		var.AC();
		var.Fan();
		
	}

	@Override
	public void Fan() {
		// TODO Auto-generated method stub
		
		System.out.println("Fan colour is black");
		System.out.println("Thats is Abstraction");
		
	}

}
