package com;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestSubsequence{
	static void LIS(List<Integer> list, int l) {
		int a,b,c,d;
		System.out.println(list);
		List<Integer> lis=new ArrayList<Integer>(); 
		int i,j,max=0;
		for(i=0;i<l;i++) {
			lis.add(1);
		}
		
		for(i=1; i<l; i++) {
			for(j=0;j<i;j++) {
				a=(int) list.get(i);
				b=(int) list.get(j);
				c= lis.get(i);
				d = lis.get(j);		
						
				if(a>b && c<=d+1 ) {
					c=lis.get(j)+1;
					lis.set(i, c);
				}
			}
}
		
		for(i=0;i<l;i++) {
			if(max < lis.get(i)) {
				max = lis.get(i);
			}
		}
		
		System.out.println("Max value :" +max);
	}

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>(); 
		int l;
		System.out.print("enter the total elements in a list: ");
		Scanner sc = new Scanner(System.in);
		l=sc.nextInt();
		for(int i=0;i<l;i++) 
		{
			System.out.print("enter elements of a list: ");
			int a=sc.nextInt();
			list.add(a);
		}
				
		LongestSubsequence.LIS(list, l);
		
	}
}