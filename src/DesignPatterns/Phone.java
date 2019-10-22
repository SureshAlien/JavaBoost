package DesignPatterns;


public class Phone {
	
	int batteryCapacity;
	String os ;
	String processor;
	
	
	public Phone(int batteryCapacity,String os,String processor){
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
