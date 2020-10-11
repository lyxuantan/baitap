package bai3.quanli;

import java.util.Scanner;

import bai3.customer.CountCustomer;
import bai3.customer.Customer;

public class QuanLi {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			int choose;
			final int  numberOfCustomer = 1;
			Customer[] customer = new Customer[numberOfCustomer];
			
			do {
				
				
				System.out.println("=====MENU===========");

				System.out.println("1.Them khach hang vao danh sach");
				System.out.println("2.In ra tat ca danh sach");
				System.out.println("3.Tim kiem thong tin khach hang theo ma chuyen bay va ma ghe");
				System.out.println("4.Xoa hanh khach khoi danh sach");
				System.out.println("5.Sap xep danh sach theo ten khach hang");
				choose = Integer.parseInt(sc.nextLine());
				
				switch (choose) {

				case 1:
					System.out.println("Thêm khác hàng");

					for (int i = 0; i < numberOfCustomer; i++) {
						customer[i] = new Customer();
						System.out.println("Nhap thong tin khach hang " + (i + 1) + ": ");
						//customer[i].setId(i);
						//customer[i].nhapThongTinNhanVien();
						enterInformation(customer[i], sc);

					}

					break;

				case 2:
					System.out.println("In ra tat ca danh sach");
					for (int i = 0; i < customer.length; i++) {
						
						System.out.println(customer[i].toString());
					}

					break;
				case 3:
//					System.out.println("In ra danh sach theo ma chuyen bay");
//					Customer temp = customer[0];
////					for(int i=0;i<customer.length-1;i++)
////					{
////						for(int j=i+1;j<customer.length;j++)
////						{
////							if(customer[i].getMaChuyenBay()<customer[j].getMaChuyenBay())
////							{
////								temp = customer[j];
////								customer[j] = customer[i];
////								customer[i] = temp;
////							}
////						}
////					}
////					for(int i=0;i<customer.length;i++)
////					{
////						customer[i].toString();
////					}
//					
//					System.exit(0);
					break;
				case 4:
					System.out.println("Tim kiem thog tin khach hang theo ma chuyen bay");
					System.out.println("Nhap ma chuyen bay");
					int flightCode = Integer.parseInt(sc.nextLine());

					for (int i = 0; i < customer.length; i++) {
						/*
						 * if(customer[i].getMaChuyenBay() == flightCode)
						 * System.out.print(customer[i].toString());
						 */
					}
					break;
				case 5:
					System.out.println("Xoa khach hang khoi danh sach");
					String name = sc.nextLine();
					Customer temp1 = customer[0];
					for (int i = 0; i < customer.length; i++) {

					}
					break;
				case 6:
					System.out.println("");

				default:

					break;
				}

			} while (true);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	static void enterInformation(Customer customer, Scanner sc) {

		System.out.println("Nhập Ten: ");
		customer.setTen(sc.nextLine());
 		System.out.println("Nhap Tuoi");
		customer.setTuoi(sc.nextLine());
		System.out.println("Nhap gioi tinh");
		customer.setGioiTinh(sc.nextLine());
		System.out.println("Nhap dia chi");
		customer.setDiaChi(sc.nextLine());
		System.out.println("Ma chuyen bay");
		customer.setMaChuyenBay(sc.nextLine());
		System.out.println("Ma ghe");
		customer.setMaGhe(sc.nextLine());

	}

	public static String toString(Customer custormer) {

		return custormer.getTen() + " " + custormer.getTuoi() + " " + custormer.getGioiTinh() + " "
				+ custormer.getDiaChi() + " " + custormer.getMaChuyenBay() + " " + custormer.getMaGhe();

	}
	
	
	public static void removeAt(Customer[] customer,CountCustomer n,Scanner sc)
	{
		
		int location;
		
		
	}
	
	//Function check ID exists
    public static int checkIDExists(Customer[] customer, String name, int n) throws Exception
    {
        try
        {
            int result = -1;

            if(n > 0)
            {
                for(int i = 0; i < n; i++)
                {
                    if(name.equalsIgnoreCase(customer[i].getTen()))
                    {
                        result = i;
                        break;
                    }
                }
            }

            return result;
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }
    
    public static void remove(Customer[] customer,CountCustomer n, Scanner sc)
    {
    	
    	   Scanner input = new Scanner(System.in);
           String ID;
           int location;

           try
           {
               System.out.println("\nBạn nhập vào mã sinh viên cần xóa: ");
               ID = input.nextLine();
               removeSpace(ID, true);
               location = checkIDExists(sinhVien, ID, n.getN());//lấy vị trí của học sinh trong danh sách có ID bằng ID nhập vào

               if(location >= 0)
               {
                   n.setN(n.getN() - 1);//giảm số lượng học sinh đi 1 đơn vị

                   //bắt đầu gán lại thông tin cho các học sinh từ vị trí thứ i tới n - 1.
                   for(int i = location; i < n.getN(); i++)
                   {
                       sinhVien[i] = sinhVien[i + 1];
                   }

                   System.out.printf("Sinh viên có mã \"%s\" đã được xóa khỏi danh sách.", ID);
               }
               else
               {
                   System.out.printf("Không có sinh viên nào có mã \"%s\".", ID);
               }
           }
           catch(Exception ex)
           {
               throw ex;
           }
    }

}
