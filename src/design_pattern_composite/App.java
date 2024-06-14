package design_pattern_composite;

public class App {

	public static void main(String[] args) {
		Folder root=new Folder("Root");
		Folder f1=new Folder("Structural");
		Folder f2=new Folder("Behavioural");
		Folder f3=new Folder("Creational");
		
		root.addComponent(f1);
		root.addComponent(f2);
		root.addComponent(f3);
		
		root.view();

	}

}
