package com.cts.dp;

import java.util.Scanner;

import com.cts.dp.services.PhoneOrderRepair;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to our site. Would you like to order or repair?");
		String processOption = sc.nextLine().toLowerCase().trim();
		PhoneOrderRepair phoneOrderRepair = new PhoneOrderRepair();
		String productDetail = "";

		switch (processOption) {
		case "order": {
			System.out.println("Please Provide the phone model name");
			productDetail = sc.nextLine().trim();
			phoneOrderRepair.ProcessOrder(productDetail);
			break;
		}
		case "repair": {
			System.out.println("Is it the phone or the accessory that you want to be repaired?");
			String productType = sc.nextLine().toLowerCase();
			if (productType.equals("phone")) {
				System.out.println("Please provide the phone model name");
				productDetail = sc.nextLine().trim();
				phoneOrderRepair.ProcessPhoneRepair(productType);
			} else {
				System.out.println("Please provide the accessory detail, like headphone, tempered glass");
				productDetail = sc.nextLine().trim();
				phoneOrderRepair.ProcessAccessoryRepair(productType);
			}
			break;
		}
		default:
			break;
		}

	}

}
