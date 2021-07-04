
class characterdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char ch1=88,ch2='Y';
System.out.print("ch1 and ch2:");
System.out.println(ch1+""+ch2);
ch1++;//increment in AsCII(even Unicode)value
System.out.println("ch1 now contains "+ch1);
--ch2;//decrement in ASCII(even Unicode)value
System.out.println("ch2 now contains "+ch2);/*ch1=35;ch2=30;char ch3;ch3=ch1+ch2;//Error*/
ch2='6'+'A';//valid
System.out.println("ch2 now contains "+ch2);
	

	}

}
