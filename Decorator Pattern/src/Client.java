
public class Client {
	
	public static void main(String[] args) {
		
		Component component = new ConcreteComponent();
		
		//��һ��װ��
		component = new ConcreteDecorator1(component);
		
		//�ڶ���װ��
		component = new ConcreteDecorator2(component);
		
		component.operate();
	}
}
