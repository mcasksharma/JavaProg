package first;

public class testMain {

	public static void main(String[] args) {
		
		System.out.println("Excution Start..");
		test1 t1 =new test1();
		t1.val=10;
		t1.str="hello";
		
		try {
			test1 t2 = (test1) t1.clone();
			System.out.println("String = "+t2.str);
			System.out.println("val =" +t2.val);
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
