package counter;

public class Counter extends CounterSubject{

	private int count=0;
	
	public void increment(){
		count++;
		donotify(count);
	}
	
	public void decrement(){
		count--;
		donotify(count);
	}

	public void setObserver(CounterObserver observer) {
		this.addObserver(observer);
	}

}
