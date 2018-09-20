package CounterWithoutStaticVariable;

public class Counter {
	int count=0;
	
	Counter(){
		count++;
		System.out.println(count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Counter C1 = new Counter();
			Counter C2 = new Counter();
	}

}
