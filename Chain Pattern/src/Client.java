
public class Client {
	
	public static void main(String[] args) {
		
		//ʵ�������нڵ�
		Handler handler1 = new ConcreteHandler1();
		Handler handler2 = new ConcreteHandler2();
		Handler handler3 = new ConcreteHandler3();
		
		//�����нڵ���װ����
		handler1.setNextHandler(handler2);
		handler2.setNextHandler(handler3);
		
		//�ύ����
		Request request = new Request();
		request.setLevel(2);
		handler1.handleRequest(request);

	}
}
