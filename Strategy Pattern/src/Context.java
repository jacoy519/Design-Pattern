
public class Context {
	
	//�������
	private Strategy strategy = null;
	
	//���캯�����þ������
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	//��װ��Ĳ��Է���
	public void doAnything() {
		this.strategy.doSomething();
	}
}
