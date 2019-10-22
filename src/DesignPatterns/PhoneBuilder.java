package DesignPatterns;
public class PhoneBuilder {
	
	int batteryCapacity;
	String os ;
	String processor;
	
	
	public PhoneBuilder setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
		return this;
	}
	
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;

	}
	
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;

	}
	
	public Phone getPhone() {
		return new Phone( batteryCapacity,os ,processor );	
	}
	
	

}
