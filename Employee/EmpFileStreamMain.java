package com.montran.main;

import java.io.File;
import java.util.Scanner;

import com.montran.util.EmpOutputStreamUtil;
import com.montran.util.EmpInputStream;

public class EmpFileStreamMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String filePath;
		String data;
		File file;
		int employeeId;
		String name;
		double salary;
		byte[] fileData;
		String sal;
		String id;
		String countinueChoice;
		
		int choice;
		
		do {
		System.out.println("Menu");
		System.out.println("1.Write operation");
		System.out.println("2.Read operation");
		System.out.println("Enter your Choice::");
		choice=scanner.nextInt();
		switch (choice) {
		
		case 1:
			
			EmpOutputStreamUtil util = new EmpOutputStreamUtil();
			System.out.println("Enter Path");
			filePath = scanner.next();
			file = new File(filePath);

			scanner.nextLine();
			System.out.println("Enter EmployeeID::");
			employeeId = scanner.nextInt();
			id = Integer.toString(employeeId);
			System.out.println("Enter Employee Name");
			name = scanner.next();
			System.out.println("Enter Employee Salary:: ");
			salary = scanner.nextDouble();
			sal = Double.toString(salary);
			data=id+"\t"+name+"\t"+sal;
			util.WriteDataIntoFile(file, data.getBytes());
			
			System.out.println("Please check your file !!");

			break;
		case 2:
			EmpInputStream emp = new EmpInputStream();

			System.out.println("Enter path for file");
			filePath = scanner.next();

			file = new File(filePath);
			fileData = emp.getFileData(file);

			System.out.println("Data from file:");
			for (byte b : fileData) {
				System.out.print((char) b);

			}

		default:
			break;
			
		} 
		System.out.println("Do you want to continue?");
		 countinueChoice=scanner.next();
		}while(countinueChoice.equals("yes"));
		scanner.close();

	}

}
