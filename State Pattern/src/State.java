
public abstract class State {
	
	//����һ��������ɫ���ṩ�������
	protected Context context;
	
	//���û�����ɫ
	public void setContext(Context context) {
		this.context = context;
	}
	
	//��Ϊ1
	public abstract void handler1();
	
	//��Ϊ2
	public abstract void handler2();
}
