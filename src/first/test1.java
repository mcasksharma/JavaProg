package first;

public class test1 implements Cloneable{
	int val;
	String str;
	
	public Object clone() throws CloneNotSupportedException{
		
		return super.clone();
	}

}
