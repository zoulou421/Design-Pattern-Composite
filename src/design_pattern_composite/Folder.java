package design_pattern_composite;

import java.util.ArrayList;
import java.util.List;

//composite
public class Folder extends ComponentChild {
	private List<ComponentChild>components=new ArrayList<>();
    
	public Folder(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void view() {
		String tab=indentation();
		System.out.println(tab+"Folder:"+name);
		for(ComponentChild c:components) {
			c.view();
		}
		
	}
	
	/*public void addComponent(ComponentChild cp) {
		cp.level=this.level+1;
		this.components.add(cp);
	}*/
	
	public ComponentChild addComponent(ComponentChild cp) {
		cp.level=this.level+1;
		cp.parent=this;//IMPORTANT//reférence:ComponentChild
		this.components.add(cp);
		return cp;
	}
	
	public ComponentChild getComponent(String name) {
		for(ComponentChild c:components) {
			if(c.name.equals(name))return c;
		}
		return null;
		
	}

}
