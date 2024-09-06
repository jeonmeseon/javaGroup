package t10_abstract.t1;

public class Run1 {
	public static void main(String[] args) {
		Samsung SamsungPhone= new Samsung("홍길동");
		SamsungPhone.powerOn();
		SamsungPhone.sound();
		SamsungPhone.function();
		SamsungPhone.functionSamsung();
		SamsungPhone.poweroff();
		System.out.println();
		
		Lg lgphone = new Lg("김말숙");
		lgphone.powerOn();
		lgphone.sound();
		lgphone.function();
		lgphone.functionLg();
		lgphone.poweroff();
		System.out.println();		
	}
}
