
public class Client {

	public static void main(String[] args) {
		
		//�����н���
		Mediator mediator = new ConcreteMediator();
		
		//���ɾ���ͬ����
		Colleague c1 = new ConcreteColleague1(mediator);
		Colleague c2 = new ConcreteColleague2(mediator);
		
		//��ͬ����ע����н���
		mediator.setColleague1(c1);
		mediator.setColleague2(c2);
		
		c1.dependMethod();
		c2.dependMethod();
	}

}
