
public class Client {

	public static void main(String[] args) {
		
		//����һ�����۲���
		ConcreteSubject subject = new ConcreteSubject();
		
		//����һ���۲���
		Observer obs = new ConcreteObserver();
		
		//ע��һ���۲���
		subject.addObserver(obs);
		
		//ҵ���߼�
		subject.doSomething();
	}

}
