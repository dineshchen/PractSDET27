package wednesdayDrive;

import java.util.LinkedHashSet;

public class IntegersCount {

	public static void main(String[] args) {
//		int a[]= {1,2,3,4,1,2,4,5};
//		LinkedHashSet<Integer>lhs=new LinkedHashSet<Integer>();
//		for(int i=0;i<a.length;i++) {
//			lhs.add(a[i]);
//		}
//		for(Integer in:lhs) {
//			int count=0;
//			for(int i=0;i<a.length;i++) {
//				if(in==a[i]) {
//					count++;
//				}
//			}if(count>=1) {
//				System.out.println(in+"="+count+" "+"time");
//			}
//		}
		
	int a[]= {123451};
	String s = a.toString();
	char[] s1 = s.toCharArray();
	LinkedHashSet<String>lhs=new LinkedHashSet<String>();
	for(int i=0;i<s1.length;i++) {
	    lhs.addAll(lhs);
	}
	for(String in:lhs) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(in==s) {
				count++;
			}
		}if(count>=1) {
			System.out.println(in+"="+count+" "+"time");
		}
//	

		}
	}
	}

