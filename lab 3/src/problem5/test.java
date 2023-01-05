package problem5;

import java.sql.Date;

public class test {

	@SuppressWarnings("deprecation")
	public static <E> void main(String[] args) {
		Chocolate c = new Chocolate(26,"Twix");
		Chocolate b = new Chocolate(25,"Baunty");
		Chocolate m = new Chocolate(27, "Mars");
		Chocolate s = new Chocolate(29, "Snickers");
		Chocolate [] array = new Chocolate[4];
		array[0] = c;
		array[1] = b;
		array[2] = m;
		array[3] = s;
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println();
		sort.quickSort(array, 0, 3);
//		sort.bubbleSort(array);
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		Time t1 = new Time(12,5,10);
		Time t2 = new Time(13,6,16);
		Time t3 = new Time(12,6,9);
		Time t4 = new Time(10,5,5);
		Time [] arr = new Time[4];
		arr[0] = t1;
		arr[1] = t2;
		arr[2] = t3;
		arr[3] = t4;
		System.out.println();
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		sort.bubbleSort(arr);
//		sort.quickSort(arr, 0, 3);
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		Employee e1 = new Employee("Alan",30000,new Date(12,12,12),"123");
		Employee e2 = new Employee("Kate",35000,new Date(12,10,5),"123");
		Employee e3 = new Employee("Boris", 32000, new Date(13,11,2),"321");
		Employee [] arr1 = new Employee[3];
		arr1[0] = e1;
		arr1[1] = e2;
		arr1[2] = e3;
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println();
//		sort.bubbleSort(arr1);
		sort.quickSort(arr1, 0, 2);
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}

}
