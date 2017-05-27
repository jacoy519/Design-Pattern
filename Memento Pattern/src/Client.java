
public class Client {
	
	public static void main(String[] args) {
		//定义发起人
		Originator originator = new Originator();
		//定义备忘录管理员
		Caretaker caretaker = new Caretaker();
		//设置状态已
		originator.setState("state 1");
		//备份
		caretaker.setMemento(originator.createMemento());
		//备份还原
		originator.restoreMemento(caretaker.getMemento());
	}
}
