
public class Client {

	public static void main(String[] args) {
		
		//生成被代理实例
		Subject realSubject = new RealSubject();
		
		//注册并生成代理类
		Subject proxySubject = new ProxySubject(realSubject);
		
		proxySubject.doSomething();

	}

}
