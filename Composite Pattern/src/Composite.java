import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
	
	//��������
	private List<Component> componentList = new ArrayList<Component>();
	
	//����һ�����ڵ㹹������Ҷ�ӹ���
	public void add(Component component) {
		componentList.add(component);
	}
	
	//�Ƴ�һ��Ҷ�ӹ����������ڵ㹹��
	public void remove(Component component) {
		componentList.remove(component);
	}
	
	public List<Component> getChildren() {
		return this.componentList;
	}
}
