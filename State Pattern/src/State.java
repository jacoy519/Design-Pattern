
public abstract class State {
	
	//定义一个环境角色，提供子类访问
	protected Context context;
	
	//设置环境角色
	public void setContext(Context context) {
		this.context = context;
	}
	
	//行为1
	public abstract void handler1();
	
	//行为2
	public abstract void handler2();
}
