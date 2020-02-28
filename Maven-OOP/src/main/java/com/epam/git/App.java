package com.epam.git;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
		ArrayList<sweets> sw=new ArrayList<>();
		sw.add(new Chocolate("DairyMilk",50,20.5f));
		sw.add(new Chocolate("Perk",20,10.2f));
		sw.add(new Chocolate("FiveStar",30,21.5f));
		sw.add(new Chocolate("Milkybar",60,30.2f));
		sw.add(new creams("pista",5,5.1f));
		sw.add(new creams("chocolash",10,5.1f));
		sw.add(new creams("kajuban",15,7.5f));
		sw.add(new candy("imily",60,8.1f));
		sw.add(new candy("mahalacto",90,30.1f));
		sw.add(new candy("lollypop",10,2.6f));
		sw.add(new candy("Mentos",30,15.6f));
		sw.add(new candy("BubbleGum",5,3.0f));
		List<sweets> ch=new ArrayList<>();
		int n=sw.size();
		float we=0.0f;
		for(int i=0;i<n;i++) we+=sw.get(i).weight;
		System.out.println("Total Weight of Gift is : "+we);
		for(int i=0;i<n;i++) {
			if(sw.get(i) instanceof Chocolate) ch.add(sw.get(i));
		}
		System.out.print("Enter the Option :\n1.sortByCost\n2.sortByWeight\n");
		int option=sc.nextInt();
		if(option==1) Collections.sort(ch,new sortByCost());
		else if(option==2) Collections.sort(ch,new sortByWeight());
		System.out.println("Chocolates Present in the Gift are:");
		for(int i=0;i<ch.size();i++){
			System.out.println(ch.get(i).name+" "+ch.get(i).cost+" "+ch.get(i).weight);
		}
		System.out.println("Do you Want List of Candies(y/n)");
		char cr=sc.next().charAt(0);
		if(cr=='y'){
			System.out.print("Enter the Option :\n1.Cost\n2.Weight\n");
			option=sc.nextInt();
			System.out.println("Enter the Range");
			int min=sc.nextInt();
			int max=sc.nextInt();
			sweets curr;
			if(option==1) {
				for(int i=0;i<n;i++) {
					curr=sw.get(i);
					if(curr instanceof candy && curr.cost>=min && curr.cost<=max){
						System.out.println(curr.name+" "+curr.cost+" "+curr.weight);
					}
				}
			}
			else if(option==2) {
				for(int i=0;i<n;i++) {
					curr=sw.get(i);
					if(curr instanceof candy && curr.weight>=min && curr.weight<=max){
						System.out.println(curr.name+" "+curr.cost+" "+curr.weight);
					}
				}
			}
			
		}
		sc.close();
    }
}
