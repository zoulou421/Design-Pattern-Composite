package design_pattern_composite;
//component
public abstract class ComponentChild {
	protected String name;
	protected int level;
	
	public abstract void view();

	public ComponentChild(String name) {
		this.name = name;
	}
	
	public String indentation() {
		String str="";
		for(int i=0;i<level;i++) {
			str+="\t";
		}
		
		return str;
		
	}
	

}
