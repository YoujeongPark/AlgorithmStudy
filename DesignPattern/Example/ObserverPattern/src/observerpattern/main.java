package observerpattern;

public class main {
	
	public static void main(String[] args) {
		PlayController controller = new PlayController();
		
		MyClassA classA = new MyClassA(controller);
		MyClassB classB = new MyClassB(controller);
		
		System.out.println("��� Ŭ���� �Ͻ� ���� ");
		controller.setFlag(false);
		
		System.out.println("��� Ŭ���� �Ͻ� ���� ");
		controller.setFlag(true);

	}

}
