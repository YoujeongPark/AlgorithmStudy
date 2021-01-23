package observerpattern2;

import java.util.Observable;
import java.util.Observer; 


public class MyClassA implements Observer{
	
	Observable observable;
	private boolean bPlay;
	
	public MyClassA(Observable o) {
		this.observable = o;
		observable.addObserver(this);
	}
	
	
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if(o instanceof PlayController) {
			PlayController myControl = (PlayController)o;
			this.bPlay = myControl.getFlag();
			myActControl(); 
		}
		
	} 
	
	private void myActControl() {
		if(bPlay) {
			System.out.println("MYClass A : ���� ���� ");
			
		}else {
			System.out.println("MyClass A : ���� ����" ); 
		}
	}

}
