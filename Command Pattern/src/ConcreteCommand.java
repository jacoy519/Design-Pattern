
public class ConcreteCommand implements Command {
	
	private Receiver receiver;
	
	public ConcreteCommand(Receiver receiver) {
		this.receiver = receiver;
	}
	
	@Override
	public void execute() {
		System.out.println("execute command");
		receiver.doSomething();
	}

}
