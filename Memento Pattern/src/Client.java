
public class Client {
	
	public static void main(String[] args) {
		//���巢����
		Originator originator = new Originator();
		//���屸��¼����Ա
		Caretaker caretaker = new Caretaker();
		//����״̬��
		originator.setState("state 1");
		//����
		caretaker.setMemento(originator.createMemento());
		//���ݻ�ԭ
		originator.restoreMemento(caretaker.getMemento());
	}
}
