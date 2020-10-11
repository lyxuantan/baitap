package bai2;

import java.io.IOException;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n");
		int n = 0;
		try {

			n = Integer.parseInt(sc.nextLine());

			do {
				System.out.println("=====MENU===========");
				System.out.println("1.Kiểm tra số nguyên tố");
				System.out.println("2.Tìm tất cả các ước");
				System.out.println("3.Tính tổng các ước lẻ");
				System.out.println("4.In ra dãy Fibonacci nhỏ hơn n");
				System.out.println("5.Tính tổng các số từ 1 đến n");
				System.out.println("Thoát");
				int luaChon = Integer.parseInt(sc.nextLine());
			
				switch (luaChon) {
				case 1:
					if (kiemTraSoNguyenTo(n))
						System.out.println("Là số nguyên tố");
					else {
						System.out.println("Không là số nguyên tố");
					}
					break;
				case 2:
					try {
						System.out.println("Các ước");
						timUoc(n);
					} catch (Exception ex) {

					}
					break;
				case 3:
					try {
						System.out.println("Tổng ước lẻ" + tinhTongUocLe(n));
					} catch (Exception ex) {

					}

					break;
				case 4:
					try {
						System.out.println("Dãy fibonacci ");
						for (int i = 0; i < n; i++) {

							System.out.print(fibonacci(i) + "  ");
						}
					} catch (Exception ex) {

					}
					break;
				case 5:
					System.out.println("Tong tu 1 den N "+tinhTongTuMotDenN(n));

					break;
				case 6:
					System.out.print("Đã thoát");
					System.exit(0);
					
					break;
				default:
					break;
				}
			} while (true);

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public static boolean kiemTraSoNguyenTo(int n) throws IOException {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void timUoc(int n) throws IOException {

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i + "  ");
			}
		}

	}

	public static int tinhTongUocLe(int n) throws IOException {

		int tongLe = 1;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0 && i % 2 == 1) {
				tongLe += i;
			}
		}

		return tongLe;

	}

	public static int fibonacci(int n) throws IOException {
		int a1 = 1, a2 = 1;
		if (n == 1 || n == 2)
			return 1;
		int i = 3, a = 0;
		while (i <= n) {
			a = a1 + a2;
			a1 = a2;
			a2 = a;
			i++;
		}
		return a;

	}

	public static int tinhTongTuMotDenN(int n) throws IOException {
		int tong = 0;
		for (int i = 0; i <= n; i++) {
			tong += i;

		}
		return tong;

	}

}
