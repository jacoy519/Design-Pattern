
public class Client {
	
	public static void main(String[] args) {
		
		//实例化接收者
		Receiver receiver = new ConcreteReceiver();
		
		//实例化命令
		Command command = new ConcreteCommand(receiver);
		
		//实例化调用者并设置命令
		Invoker invoker = new Invoker();
		invoker.setCommand(command);
		
		//执行
		invoker.action();
		
	}
}
