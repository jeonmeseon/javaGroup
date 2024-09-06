package t11_interface.t02;

public class ToyRun {
	public static void main(String[] args) {
		System.out.println("연령별 장난감 가능 현황");
		
		Toy bear = new Bear();
		Toy robot = new Robot();
		Toy tank = new Tank();
		Toy airplan = new Airplan();
		
		Toy[] toy = {bear, robot, tank, airplan};
		String[] title = {"곰돌이","로보트","탱크","비행기"};
		
		
		for(int i=0; i<toy.length; i++) {
			toy[i].age();
			toy[i].product(title[i]);
			toy[i].moving();
			toy[i].fire();
			toy[i].misaile();
			
		}
	}
}
