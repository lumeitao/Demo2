package com.ahead;
import java.util.Scanner;
public class demo1 {
	public static void main(String [] asd){
		int age=0;
		char sex;
		Scanner s=new Scanner(System.in);
		System.out.println("��������");
		age=s.nextInt();
		System.out.println("�����Ա�");
		String sex1=s.next();
		sex=sex1.charAt(0);
		if(age>7||(age>5&&sex=='��'))
		{
			System.out.println("���԰�����");
			
		}
		else
		System.out.println("���ܰ�");
	}

}
