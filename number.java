package assignments;

import java.util.HashMap;
import java.util.Scanner;
public class number {
	public static void main(String arg[]) {
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Num");
		int n=sc.nextInt();
		System.out.println("Enter the Name and Phone num");
		for(int i=0;i<n;i++) {
			String str=sc.next();
			int num=sc.nextInt();
			hm.put(str,num);
		}
		System.out.println("Enter the data ");
		int k=sc.nextInt();
		for(int i=0;i<k;i++) {
			String str1=sc.next();
			if(hm.containsKey(str1)) {
				System.out.println(str1+" : "+hm.get(str1));
			}
			else {
				System.out.println("Not Found");
			}
		}

	}

}
