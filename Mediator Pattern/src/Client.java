
public class Client {

	public static void main(String[] args) {
		
		//生成中介类
		Mediator mediator = new ConcreteMediator();
		
		//生成具体同事类
		Colleague c1 = new ConcreteColleague1(mediator);
		Colleague c2 = new ConcreteColleague2(mediator);
		
		//将同事类注册给中介类
		mediator.setColleague1(c1);
		mediator.setColleague2(c2);
		
		c1.dependMethod();
		c2.dependMethod();
	}

}
