package XylemPrograms;

public class AbstractClassSyntax extends Demo{
	@Override
	void method(){
		System.out.println("inside implementation class");
	}
	public void getsupermethod()
	{
		super.method();
	}
	public static void main(String[] args) {
		new AbstractClassSyntax().getsupermethod();
	}
	

}
abstract class Demo{
	void method(){
		System.out.println("inside abstract demo class");
	}
}