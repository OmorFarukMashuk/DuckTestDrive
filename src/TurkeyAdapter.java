
public class TurkeyAdapter implements Duck {

	Turkey turkey;
	public TurkeyAdapter(Turkey turkey) {
		// TODO Auto-generated constructor stub
		this.turkey = turkey;
	}
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		turkey.gobble();

	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		turkey.fly();

	}

}
