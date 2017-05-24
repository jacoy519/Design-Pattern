
public class Client {

	public static void main(String[] args) {
		
		AbstractCreator creator1 = new Creator1();
		
		AbstractCreator creator2 = new Creator2();
		
		//������Ϊ1��ϵ�в�Ʒ
		AbstractProductA a1 = creator1.createProductA();
		AbstractProductB b1 = creator1.createProductB();
		
		//�������Ϊ2��ϵ�в�Ʒ
		AbstractProductA a2 = creator2.createProductA();
		AbstractProductB b2 = creator2.createProductB();
		
		//ҵ�����
		a1.doSomething();
		a2.doSomething();
		b1.doSomething();
		b2.doSomething();
	}
}
