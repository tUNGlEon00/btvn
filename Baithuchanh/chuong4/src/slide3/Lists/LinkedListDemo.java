package slide3.Lists;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" n = ");
		int n = sc.nextInt();
		Student st = new Student();
		LinkedList<Student> b = new LinkedList<Student>();
		for (int i = 0; i < n; i++) {
			System.out.println(" nhap phan tu thu " + i + " : ");
			if(i>0)    st.NextL();
			st.nhapTT();
			b.add(i, st);
		}

		for (int j = n; j < n + 2; j++) {
			System.out.println(" nhap them thong tin: ");
			System.out.println(" nhap phan tu thu " + j + " : ");
			st.NextL();
			st.nhapTT();
			b.add(j, st);
		}

		for (int i = 0; i < n + 2; i++){
			System.out.println(" sua thong tin: ");
			System.out.println(" nhap phan tu thu " + i + " : ");
            st.NextL();
			st.nhapTT();
			b.set(i, st);
		}

		for (int i = 0; i < n + 2; i++){
			System.out.println(" hien thi thong tin: ");
			b.get(i).xuatTT();
		}



	}
}
