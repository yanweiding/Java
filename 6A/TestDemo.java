class Value{
	public int val;
}

public class TestDemo{
public static void swap( Value value1,Value value2){
	int tmp=value1.val;
	value1.val=value2.val;
	value2.val=tmp;
}

public static void main(String[] args) {
	Value value1=new Value();
	value1.val=2;
	Value value2=new Value();
	value2.val=3;
	System.out.println(value1.val+" "+value2.val);
swap(value1,value2);
System.out.println(value1.val+" "+value2.val);
}
}
