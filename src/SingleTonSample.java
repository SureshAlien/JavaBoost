/*create a static object
 * private constructor should be there
 * create a statatic method
 */
public class SingleTonSample {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				A obj1 = A.getInstance();		
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				A obj1 = A.getInstance();		
			}
		});	
		t1.start();
		t2.start();



		

	}

}


class A{
	static A obj ;
	

	private A(){ //constructor is private so cant create obj simply
		System.out.println("obj createdd for a class");
		
	}
	
	public synchronized static A getInstance() {
		if(obj == null ) {
			obj = new A();
		}
		return obj;
	}

	
}
