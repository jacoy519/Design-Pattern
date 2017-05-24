
public class Client {
	
	public static void main(String[] args) {
		
		//ʵ����������
		Receiver receiver = new ConcreteReceiver();
		
		//ʵ��������
		Command command = new ConcreteCommand(receiver);
		
		//ʵ���������߲���������
		Invoker invoker = new Invoker();
		invoker.setCommand(command);
		
		//ִ��
		invoker.action();
		
	}
}
