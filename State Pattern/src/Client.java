
public class Client {

	public static void main(String[] args) {
		Context context = new Context();
		context.setCurrentState(Context.STATE_1);
		context.handler1();
		context.handler2();
	}

}
