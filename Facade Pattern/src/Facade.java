
public class Facade {
	
	//被委托对象
	private ClassA classA = new ClassA();
	private ClassB classB = new ClassB();
	
	//提供给外部访问的方法
	public void methodA() {
		this.classA.doSomething();
	}
	
	public void methodB() {
		this.classB.doSomething();
	}
 }
