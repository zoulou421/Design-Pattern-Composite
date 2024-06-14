package design_pattern_composite;

public class File extends ComponentChild {
	
	public File(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void view() {
		String tab=indentation();
		System.out.println(tab+"File:"+name);
		
	}
	
	

}
