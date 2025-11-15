package Day6;

import java.util.Scanner;

public class D6Q2 {
   public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice=sc.nextInt();

		switch(choice) {
		case 1:
			Test<Integer> t1 = new Test<Integer>();
			t1.add(30, 20);
			break;
		case 2: 
			Test<Double> t2 = new Test<Double>();
			t2.add(10.0, 20.0);
			break;
		case 3: 
			Test<Float> t3 = new Test<Float>();
			t3.add(20.0f, 20.0f);
			break;

		}

	} 
}
class  Test <T extends Number> {
T varia1 ;
T varia2;
  void add(T varia1,T varia2){
	double ans = varia1.doubleValue() + varia2.doubleValue();
	System.out.println("the sum is = "+ ans);
  }
}