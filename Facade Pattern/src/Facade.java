
public class Facade {
	
	//��ί�ж���
	private ClassA classA = new ClassA();
	private ClassB classB = new ClassB();
	
	//�ṩ���ⲿ���ʵķ���
	public void methodA() {
		this.classA.doSomething();
	}
	
	public void methodB() {
		this.classB.doSomething();
	}
 }
