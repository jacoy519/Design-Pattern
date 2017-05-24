
public class Client {
	
	public static void main(String[] args) {
		
		//实例化所有节点
		Handler handler1 = new ConcreteHandler1();
		Handler handler2 = new ConcreteHandler2();
		Handler handler3 = new ConcreteHandler3();
		
		//将所有节点组装成链
		handler1.setNextHandler(handler2);
		handler2.setNextHandler(handler3);
		
		//提交请求
		Request request = new Request();
		request.setLevel(2);
		handler1.handleRequest(request);

	}
}
