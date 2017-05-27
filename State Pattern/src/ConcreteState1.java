
public class ConcreteState1 extends State {

	@Override
	public void handler1() {
		System.out.println("state 1 do something and change state to 2");
		
		//Ìø×ªµ½×´Ì¬2
		super.context.setCurrentState(Context.STATE_2);
	}

	@Override
	public void handler2() {
		System.out.println("state 1: do nothing");
	}

}
