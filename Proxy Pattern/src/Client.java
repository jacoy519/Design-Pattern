
public class Client {

	public static void main(String[] args) {
		
		//���ɱ�����ʵ��
		Subject realSubject = new RealSubject();
		
		//ע�Ტ���ɴ�����
		Subject proxySubject = new ProxySubject(realSubject);
		
		proxySubject.doSomething();

	}

}
