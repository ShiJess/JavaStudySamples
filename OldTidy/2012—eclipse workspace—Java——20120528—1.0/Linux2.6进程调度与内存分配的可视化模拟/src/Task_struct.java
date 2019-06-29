//进程结构【1】
public class Task_struct {
	private long state;//进程状态
	public long getState() {
		return state;
	}
	public void setState(long state) {
		this.state = state;
	}
	

	private int prio;//,static_prio,normal_prio;//动态优先级，静态优先级，正常优先级
	public int getPrio() {
		return prio;
	}
	public void setPrio(int prio) {
		this.prio = prio;
	}

	public void Build_Task()
	{
		
	}
}
