import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
	
	//构件容器
	private List<Component> componentList = new ArrayList<Component>();
	
	//增加一个树节点构建或者叶子构建
	public void add(Component component) {
		componentList.add(component);
	}
	
	//移除一个叶子构建或者树节点构建
	public void remove(Component component) {
		componentList.remove(component);
	}
	
	public List<Component> getChildren() {
		return this.componentList;
	}
}
