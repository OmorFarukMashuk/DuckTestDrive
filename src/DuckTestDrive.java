
public class DuckTestDrive {
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		WildTurkey turkey = new WildTurkey();
		
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		
		System.out.println("The Turkey says...");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\nThe Duck says...");
		//testDuck(duck);
		duck.quack();
		duck.fly();
		
		System.out.println("\nThe TurkeyAdapter says...");
//		testDuck(turkeyAdapter);
		turkeyAdapter.quack();
		turkeyAdapter.fly();
		
	}
	
	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}

}
