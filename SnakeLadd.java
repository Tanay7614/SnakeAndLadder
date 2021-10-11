package sample;

import java.util.Scanner;

public class SnakeLadd {
	public static int player1(int p, int[] ladder, int[] snake, int Total_die_player1) {
		
		 System.out.println(" Player1 Roll a die");
		 Scanner sc =new Scanner(System.in);
		 String play=sc.next();
		 int q=(int) Math.floor(Math.random()*10)%6+1;
		 Total_die_player1++;
		 p=p+q;
		 if(p>100)
		 {
			   p=p-q;
		 }
		   if(p<100){
			   System.out.println("Player 1 at position "+p);
		 }
		   if(p==100) {
			   System.out.println("Player 1 Wins the Game");
			   System.out.println("---------------REPORT---------------");
			   System.out.println("Player 1 takes "+ Total_die_player1 +"Times Roll a dice");
		   }
		  
		    for (int i=0; i<5; i++){
		        if(p==ladder[i]){
		            System.out.println("Player 1 got a ladder and he is Exted by "+q);
		            p=p+q;
		            System.out.println("p is at "+p);
		            System.out.println("Player 1 having chance for again a roll die");
		            player1(p,ladder,snake,Total_die_player1);
		   }
		 }
		   for (int j=0; j<4; j++){
		      if(p==snake[j]){
		         System.out.println("Player 1 bite by snake and it loose by "+q);
		         p=p-q;
		         System.out.println("p is at "+p);
		 }
		   }
		   return p;
	}
	 public static int player2(int p,int ladder[], int snake[],int Total_die_player2)
     {
   	      System.out.println("Player 2 Roll a die");
     	  Scanner sc =new Scanner(System.in);
		  String play=sc.next();
		  int q=(int) Math.floor(Math.random()*10)%6+1;
		  Total_die_player2++;
		  p=p+q;
		   
		  if(p>100){
		   p=p-q;
		 }
		  if(p<100){
			  System.out.println("Player 2 at position "+p);
		 }
		  if(p==100) {
			   System.out.println("Player 2 Wins the Game");
			   System.out.println("---------------REPORT---------------");
			   System.out.println("Player 2 takes "+Total_die_player2+" No Times Roll a dice");
		   }
		   
		    for (int i=0; i<5; i++){
		    if(p==ladder[i]){
		     System.out.println("Player 2 got a ladder and he is exted by "+q);
		      p=p+q;
		      System.out.println("Player 2 is at "+p);
		      System.out.println("Player 2 having chance for Again a Roll Die");
		      player2(p,ladder,snake,Total_die_player2);
		   }
		 }
		   for (int j=0; j<4; j++){
		  if(p==snake[j]){
		      System.out.println("Player 2 bite by snake and it loose by "+q);
		      p=p-q;
		       System.out.println("Player 2 is at "+p);
		 }
		   }
		   return p; 
     }
	 
		  public static void main(String[] args)
		  {
		  int p=0;
		  int p2=0;
		  int Total_die_player1=0;
		  int Total_die_player2=0;
		  //p=Math.floor(Math.random()*10)
		  int ladder[]={8,23,40,67,80};
		   int snake[]={34,49,51,60};
		 
		while(p<=100 || p2<=100 ){
			p=player1(p,ladder,snake,Total_die_player1);
			if(p==100) {
				break;
			}
			p2=player2(p2,ladder,snake,Total_die_player2);
			if(p2==100) {
				break;
			}
		
		}
    }
}


