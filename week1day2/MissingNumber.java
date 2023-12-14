package week1day2;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a []= {1,4,3,2,8,6,7};
for (int i=0;i<a.length;i++) {
	System.out.println("Before Sort" +a[i]);
}
Arrays.sort(a);
for (int i=0;i<a.length;i++) {
	System.out.println("After Sort" +a[i]);
}
//a []= {0,1,2,3,4,6,7,8};
for (int i=0;i<a.length;i++) {
	//System.out.println("***"+i);
	System.out.println(i+1 +"==" +a[i]);
	if (i+1 !=a[i]) {
		System.out.println("***"+(i+1));
		break;
	}
}

	
	}

}
