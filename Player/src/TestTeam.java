package Assi2;

import java.util.Scanner;

public class TestTeam {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
		System.out.println("1. Add new team\n 2. Display all teams\n 3. Search team by captain\n 4. Exit\nChoice : ");
	
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			TeamService.addnewteam();
			break;
		case 2:
			TeamService.displayall();
			break;
		case 3:
			sc.nextLine();
			System.out.println("Enter the name of the Captain");
			String nm=sc.nextLine();
			Team t=TeamService.searchByCName(nm);
			if(t!=null)
			   System.out.println(t);
			else
				System.out.println("Team not found");
			
			break;
		case 4:
			sc.close();
			System.out.println("Thank you for visiting....");
			break;
		default:
			System.out.println("Invalid choice");
		}
		}while(choice!=4);
		
	}

}