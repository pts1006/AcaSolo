package jjw.solo.car;

public class CarArray {

	private Tire [] tire;
	
	public void run() {
		tire = new Tire[4];
		tire[0] = new Tire("앞 왼쪽 타이어", 2);
		tire[1] = new Tire("앞 오른쪽 타이어", 2);
		tire[2] = new Tire("뒤 왼쪽 타이어", 4);
		tire[3] = new Tire("뒤 오른쪽 타이어", 4);
		
		for(Tire member : tire) {
			member.toString();
		}
	}
	
}
