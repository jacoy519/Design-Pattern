
public class Client {

	public static void main(String[] args) {
		
		//创建一个被观察者
		ConcreteSubject subject = new ConcreteSubject();
		
		//创建一个观察者
		Observer obs = new ConcreteObserver();
		
		//注册一个观察者
		subject.addObserver(obs);
		
		//业务逻辑
		subject.doSomething();
	}

}
