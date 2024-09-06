package T09_Polymorphism.t1;

public class Bb extends Aa {
	public int su = 20;
	
	public Bb() {
		System.err.println("이곳은 Bb 기본생성자 입니다.");
		
	}
	
	public void modBb() {
		System.err.println("이곳은 Bb클래스의 modBb메소드 입니다.");
	}
	
	@Override
	public void modAa() {
		System.err.println("이곳은 Bb클래스의 modAa메소드 입니다.");
		
	}
}
