package t11_interface.t02;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Airplan implements Toy {
	private int age = 16;
	
	@Override
	public void age() {
		System.out.println(age + "세 이상만 사용하실수 있습니다.");

	}

	@Override
	public void moving() {}

	@Override
	public void fire() {}

	@Override
	public void misaile() {
		System.out.println("미사일 발사기능이 있습니다.");
	}
	
	

	@Override
	public int possibleAge() {
		return age;
	}

	@Override
	public void product(String name) {
		System.out.println("장난감 이름 :" + name);
		
	}

}
