package packageJava.com;
class Doctor{
	float salary=50000;
	void Simple() {
		System.out.println("doctor salary is"+salary);
	}
	
}
class Surgeon extends Doctor{
	float bonus=20000;
	void sample() {
		System.out.println("surgeon bonus is"+bonus);
	}
}

public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Surgeon obj=new Surgeon();
		obj.Simple();
		obj.sample();
		
	}

}
