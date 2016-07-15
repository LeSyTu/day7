package buoi7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PhoneBook pb = new PhoneBook();

		int function = -1;
		while (function != 0) {
			System.out.println("Choose function:\n1: input\n2: add\n3: list\n4: edit\n5: delete\n6: find");
			function = input.nextInt();
			switch (function) {
			case 1: {
				System.out.println("Nhap lien lac:");
				System.out.println("Nhap so luong lien lac can nhap:");
				int number = input.nextInt();
				for (int i = 0; i < number; i++) {
					input.nextLine();
					System.out.println("Nhap ten:");
					String nameNumber = input.nextLine();
					System.out.println("Nhap so:");
					String phoneNumber = input.nextLine();
					PhoneEntry pe1 = new PhoneEntry(nameNumber, phoneNumber);
					if (pb.addEntry(pe1)) {
						System.out.println("Nhap lien lac thanh cong");
					} else {
						System.out.println("Lien lac da ton tai");
					}
				}

			}
				break;
			case 2: {
				System.out.println(pb.toString());
			}
				break;

			case 3: {
				PhoneEntry pe2 = new PhoneEntry();
				input.nextLine();
				System.out.println("Them lien lac");
				System.out.println("Nhap ten lien lac can them:");
				pe2.setName(input.nextLine());
				System.out.println("Nhap so lien lac can them:");
				pe2.setPhoneNumber(input.nextLine());
				if (pb.addEntry(pe2)) {
					System.out.println("Them thanh cong!");
				} else {
					System.out.println("Them that bai!");
				}

			}
				break;

			case 4: {
				System.out.println("Sua lien lac:");
				int n = 0;
				System.out.println("1. Sua ten lien lac:");
				System.out.println("2. Sua so lien lac");
				n = input.nextInt();
				switch (n) {

				case 1: {
					System.out.println("Sua ten lien he:");
					PhoneEntry pe3 = new PhoneEntry();
					input.nextLine();
					System.out.println("Nhap ten can sua");
					String oldName = input.nextLine();
					System.out.println("Nhap ten moi:");
					String newName = input.nextLine();
					if (pb.modifyEntryName(oldName, newName)) {
						System.out.println("Sua ten thanh cong!");

					} else {
						System.out.println("Sua ten that bai!");
					}

				}
					break;

				case 2: {
					System.out.println("Sua so lien lac:");
					input.nextLine();
					System.out.println("Nhap ten len lac:");
					String entryName = input.nextLine();
					System.out.println("Nhap so mơi:");
					String newNumber = input.nextLine();

					if (pb.modifyEntryNumber(entryName, newNumber)) {
						System.out.println("Sua so lien lac thanh cong!");
					} else {
						System.out.println("Ten lien lac khong co trong danh ba");
					}
				}
					break;

				}

			}
				break;

			case 5: {
				System.out.println("Xoa lien lac:");
				input.nextLine();
				System.out.println("nhap tien lien lac can xoa:");
				String entryName = input.nextLine();
				if(pb.deleteEntry(entryName)) {
					System.out.println("Xoa thanh cong!");
				}
				else {
					System.out.println("Xoa that bai!");
				}

			}
			break;
			
			case 6: {
				System.out.println("Tim kiem:");
				int n = 0;
				System.out.println("1. Tim kiem theo ten: ");
				System.out.println("2. Tim kiem theo so: ");
				n = input.nextInt();
				switch(n) {
				case 1: {
					input.nextLine();
					System.out.println("Nhap ten can tim kiem");
					String entryName = input.nextLine();
					System.out.println("Lien lac can tim:" + pb.findEntryByName(entryName));
				}
				break;
				
				case 2: {
					input.nextLine();
					System.out.println("Nhap so dien thoai can tim:");
					String entryNumber = input.nextLine();
					System.out.println("Lien lac can tim: " + pb.findEntryByNumber(entryNumber));
				}
				break;
				}
			}
			break;
			
			case 7: 
				break;
			
				
			}
		}
	}
}
