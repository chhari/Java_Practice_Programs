public class NewClass {


	public static void main(String[] args) {
		
		Sport newsport = new Sport();
		Hey heyy = new Hey();
		System.out.println(heyy.getspeed());
		doSomething();
		Sport sport1 = new Sport();
		
	}
	
	static void doSomething(){
		System.out.println("yo");
	}

}
 
class Sport{
	static int k = 10;
	public Sport(){
		System.out.println(k);
		System.out.println("making sure");
	}
	
}
