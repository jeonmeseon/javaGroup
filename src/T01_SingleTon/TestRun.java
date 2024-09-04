package T01_SingleTon;

public class TestRun {
	public static void main(String[] args) {
		//new singleton();
		//singleton.singleton;
		
	singleton mbc =	singleton.getinstance();
	singleton kbs =	singleton.getinstance();
	singleton sbs =	singleton.getinstance();
	
	if(mbc == kbs) System.out.println("mbc와 kbs는 서로 같은 객체를 가리키고 있습니다.");
	else System.out.println("mbc와 kbs는 서로 다른 객체를 가리키고 있습니다.");
	
	if(mbc == sbs) System.out.println("mbc와 sbs는 서로 같은 객체를 가리키고 있습니다.");
	else System.out.println("mbc와 sbs는 서로 다른 객체를 가리키고 있습니다.");
	}

}
