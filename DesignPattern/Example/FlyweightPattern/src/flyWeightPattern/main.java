package flyWeightPattern;

public class main {
	
	public static void main(String[] args) {
		FlyWeightFactory flyweight = new FlyWeightFactory();
		flyweight.getSubject("a");
		flyweight.getSubject("a");
		flyweight.getSubject("b");
		flyweight.getSubject("b");
	}

}
