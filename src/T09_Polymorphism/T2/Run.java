package T09_Polymorphism.T2;

//instanceof : 과거에 부모객체로 타입변환이 되있었는지를 알아보는 연산자(true/false)
public class Run {
	public static void main(String[] args) {
		Aa aa = new Bb();
			
		//Bb bb =(Bb)aa; (o)
		
		//Cc cc = (Cc)aa; (x)
		
		// Down Casting을 하기위해서는 반드시 Up Casting가 선행되어 있어야한다.
		if(aa instanceof Bb) {
			Bb bb = (Bb)aa;
			System.out.println("Down Casting성공~~");
			
		}
		else {
			System.out.println("Down Casting실패~~!");
		}
		System.out.println();
		
		if(aa instanceof Cc) {
			Cc Cc = (Cc)aa;
			System.out.println("Down Casting성공~~");
			
		}
		else {
			System.out.println("Down Casting실패~~!");
		}
		}
}
