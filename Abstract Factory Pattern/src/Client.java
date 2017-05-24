
public class Client {

	public static void main(String[] args) {
		
		AbstractCreator creator1 = new Creator1();
		
		AbstractCreator creator2 = new Creator2();
		
		//创造编号为1的系列产品
		AbstractProductA a1 = creator1.createProductA();
		AbstractProductB b1 = creator1.createProductB();
		
		//创建编号为2的系列产品
		AbstractProductA a2 = creator2.createProductA();
		AbstractProductB b2 = creator2.createProductB();
		
		//业务代码
		a1.doSomething();
		a2.doSomething();
		b1.doSomething();
		b2.doSomething();
	}
}
