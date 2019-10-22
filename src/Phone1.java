
public class Phone1 {
	int batteryCapacity;
	String os ;
	String processor;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	
	public Phone1(int batteryCapacity,String os,String processor){
		super();
		this.batteryCapacity = batteryCapacity ;
		this.os = os ;
		this.processor = processor ;		
	}

	
	@Override
	public String toString() {
		return "Phone [batteryCapacity=" + batteryCapacity + ", os=" + os + ", processor=" + processor + "]";
	}

}
