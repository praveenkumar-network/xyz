
public class ss extends as{
@Override
public void m1(){
	super.m1();
	System.out.println("ss..."+new RuntimeException());
}
	public static void main(String[] args) {
		new ss().m1();

	}

}
