
public class Client {
	
	public static void main(String[] args) {
		
		//����һ���������
		Strategy strategy = new ConcreteStrategy1();
		
		//���������Ķ���
		Context context = new Context(strategy);
		
		//ִ�з�װ��ķ���
		context.doAnything();
	}
}
