package t12_nestde.t01;

// 중첩클래스 : 인스턴스 멤버 클래스
public class Test1 {
	int su = 100;
	
	public Test1() {
		System.out.println("이곳은 Test1클래스 입니다.");
	}
	
	public void modTest1() {
		int su = 150;
		if(su < 0) {
			//int su  = 200;
			System.out.println("su :" + su);
		}
		System.out.println("이곳은 Test1클래스의 modRest1메소드 입니다.");
	}

	public class Aa{
		//int su = 200;(o)
		int suA = 200;
		
		public Aa() {
			System.out.println("이곳은 Test1클래스안의 중첩클래스 Aa의 기본 생성자입니다.");
		}
		
		public void modTest1A() {
			System.out.println("이곳은 Test1클래스안의 중첩클래스의 modTest1A()메소드 입니다.");
		}
		
	}
	
	public class Bb{
		
	}
}

class Aa {
	public Aa() {
		System.out.println("이곳은 Aa클래스 입니다.");
	}
}