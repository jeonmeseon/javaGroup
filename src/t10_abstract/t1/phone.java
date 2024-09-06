package t10_abstract.t1;

public abstract class phone {
	private String name;
	
	public phone(String name) {
		this.name = name;
	}
	// 추상메소드
	public abstract void function();
	public abstract void sound();
	
	// 일반메소드
	public void powerOn() {
		System.out.println(name + "님의 전화기 전원을 켭니다.");
	}
	public void poweroff() {
		System.out.println(name + "님의 전화기 전원을 끕니다.");
	}
	
	public String getName() {
		return name;
	}
	
	public void functionSamsung() {}
	public void functionLg() {}
	
}

