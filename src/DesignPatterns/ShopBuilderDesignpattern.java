//its so flexible
//constructo of phone need not to be sequencial 



package DesignPatterns;

public class ShopBuilderDesignpattern {
	
	public static void main(String[] args) {
		
		Phone phone1 = new PhoneBuilder().setBatteryCapacity(3000).getPhone();
		System.out.println(phone1);
		
	}

}
