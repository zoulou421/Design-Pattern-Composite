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
		
		f1.addComponent(new File("Composite"));
		f1.addComponent(new File("Decorator"));
		
		f2.addComponent(new File("Strategy"));
		
		f3.addComponent(new File("Singleton"));
		f3.addComponent(new File("Builder"));
		
		/* same result as next
		 * Folder fst1=(Folder)f1.addComponent(new Folder("st1"));
		fst1.addComponent(new File("Composite version 2"));
		*/
		//next
		f1.addComponent(new Folder("st1"));
		Folder fst1=(Folder)f1.getComponent("st1");
		fst1.addComponent(new File("Composite version 2"));
		root.view();

	}

}
