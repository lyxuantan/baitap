package phanso;

import java.util.Scanner;

public class Run {
	public static void main(String[] args)
	{
		try {
			Scanner sc = new Scanner(System.in);
		System.out.println("Nhap tu phan so 1");
		int tuSo1 = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap Mau So 1");
		int mauSo1 = Integer.parseInt(sc.nextLine());
		
		
		System.out.println("Nhap tu phan so 2");
		int tuSo2 = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap Mau So 2");
		int mauSo2 = Integer.parseInt(sc.nextLine());
		
		PhanSo phanSo1 = new PhanSo(tuSo1, mauSo1);
		PhanSo phanSo2 = new PhanSo(tuSo2, mauSo2);
		
		phanSo1.congPhanSo(phanSo2);
		phanSo1.truPhanSo(phanSo2);
		phanSo1.nhanPhanSo(phanSo2);
		phanSo1.chiaPhanSo(phanSo2);
		
		
		}catch(Exception ex)
		{
			
		}
		
	}

}
