package text;

	
	import java.util.Scanner;

	

	public class Main {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ThongTin[] thongtin = new ThongTin[10];
			thongtin[0] = getThongTinInfo();
			Xuat.xuat();

		}

		public static ThongTin getThongTinInfo() {
			ThongTin s = null;
			String maTaiKhoan, fullName, soCMND;
			Scanner sc = new Scanner(System.in);
			while (true) {
				System.out.print("Mã tài Khoản: ");
				// maTaiKhoan = sc.nextLine();
				maTaiKhoan = sc.nextLine();
				String nhap = "\\d+";
				if (maTaiKhoan.matches(nhap)) {
					System.out.print("");
					break;
				} else {
					System.out.println("mã nhap sai");
					maTaiKhoan = null;
				}
			}
			while (true) {
				System.out.print("Tên tài khoản: ");
				fullName = sc.nextLine();
				String nhapten = "^[a-zA-Z\\\\s]+";
				if (fullName.matches(nhapten)) {
					System.out.print("");
					break;
				} else {
					System.out.println("Nhap ten ko chinh xac");
					fullName = null;

				}
			}

			while (true) {
				System.out.print("soCMND: ");
				soCMND = sc.nextLine();
				String so = "\\d{10}";
				if (soCMND.matches(so)) {
					System.out.print("");
					break;
				} else {
					System.out.println("số CMND không hợp lệ ");
					soCMND = null;

				}
			}
			return null;
		}
	}
	
