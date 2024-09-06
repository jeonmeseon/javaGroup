package t10_abstract.t1;

public class Run2 {
	public static void main(String[] args) {
		phone SamsungPhone= new Samsung("홍길동");
		SamsungPhone.powerOn();
		SamsungPhone.sound();
		SamsungPhone.function();
		SamsungPhone.functionSamsung();
		SamsungPhone.poweroff();
		System.out.println();
		
		phone lgphone = new Lg("김말숙");
		lgphone.powerOn();
		lgphone.sound();
		lgphone.function();
		lgphone.functionLg();
		lgphone.poweroff();
		System.out.println();		
	}
}
