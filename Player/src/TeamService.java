package Assi2;

import java.util.Scanner;

public class TeamService {
	static Team[] tarr;
	static int cnt;
	
	static {
		tarr=new Team[10];
		cnt=0;
	}
	
	//create a new team
	public static void addnewteam() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter team no");
		int tno=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter team name");
		String tname=sc.nextLine();
		//accept captain details
		System.out.println("Captain player number");
		int pno=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter player name");
		String pname=sc.nextLine();
		System.out.println("Enter skill");
		String skill=sc.nextLine();
		Player c=new Player(pno,pname,skill);
		
		Player[] plist=new Player[3];
		for(int i=0;i<plist.length;i++) {
			System.out.println("Player number");
			pno=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter player name");
			pname=sc.nextLine();
			
			System.out.println("Enter skill");
			skill=sc.nextLine();
			plist[i]=new Player(pno,pname,skill);
		}
		tarr[cnt]=new Team(tno,tname,c,plist);
		cnt++;
		
	}
	public static void displayall() {
		for(int i=0;i<cnt;i++) {
			System.out.println(tarr[i]);
		}
		
	}
	public static Team searchByCName(String nm) {
		for(int i=0;i<cnt;i++) {
			
		
			Player c=tarr[i].getCaptain();
			if(c.getPname().equals(nm)) {
				return tarr[i];
			}
		}
		return null;
	}
	public static Team searchByPlayerName(String nm) {
		for(int i=0;i<cnt;i++) {
			
			
			Player[] parr=tarr[i].getPlist();
			for(int j=0;j<parr.length;j++) {
				if(parr[i].getPname().equals(nm)) {
					return tarr[i];
				}
			}
			
		}
		return null;
	}
}