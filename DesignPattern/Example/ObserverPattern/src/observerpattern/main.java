package observerpattern;

public class main {
	
	public static void main(String[] args) {
		PlayController controller = new PlayController();
		
		MyClassA classA = new MyClassA(controller);
		MyClassB classB = new MyClassB(controller);
		
		System.out.println("모든 클래스 일시 정지 ");
		controller.setFlag(false);
		
		System.out.println("모든 클래스 일시 정지 ");
		controller.setFlag(true);

	}

}
