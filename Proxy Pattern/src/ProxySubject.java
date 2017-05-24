
public class ProxySubject implements Subject {
	
	private Subject subject;
	
	public ProxySubject(Subject subject) {
		this.subject = subject;
	}
	
	@Override
	public void doSomething() {
		before();
		this.subject.doSomething();
		after();
	}
	
	private void before() {
		System.out.println("before do something");
	}
	
	private void after() {
		System.out.println("after do something");
	}

}
