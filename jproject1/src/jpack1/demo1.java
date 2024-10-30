package jpack1;
import java.util.*;
public class demo1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		student s1=new student();
		Scanner obj =new Scanner(System.in);
		System.out.println("enetr your details:");
		System.out.println("enetr your name:");
		s1.setS_name(obj.nextLine());
		System.out.println("enetr your Register no:");
		s1.setReg_no(obj.nextInt());
		System.out.println("enetr your grade:");
		s1.setS_grade(obj.next());
		System.out.println("enetr your cgpa:");
		s1.setS_cgpa(obj.nextFloat());
		System.out.println("-------your details-------");
		System.out.println(s1.toString());
		obj.close();
	}

}
