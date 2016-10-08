package problem2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CardDeck {
	 String[] ranks=new String[52];
	 char[]   suits =new char[52];
	 Card[]   cards;
	int currentCard=-1;
	
	public CardDeck(){
		//ranks= ;
		//this.cards=intocards;
		int rankcount=0;
		for(int i=0;i<4;i++){
		   for(int j=0;j<13;j++){
			   if(j>=0&&j<=8){
				   ranks[rankcount]=""+(j+2);
			   }else if(j==9){
				   ranks[rankcount]="J";
			   }else if(j==10){
				   ranks[rankcount]= "Q";
			   }else if(j==11){
				   ranks[rankcount]="K";
			   }else if(j==12){
				   ranks[rankcount]="A";
			   } 
			   rankcount++;
			  }
		   }
		 //suits=new char[52];
		 int suitscount=0;
		 for(int i=0;i<13;i++){
			for(int j=0;j<4;j++){
			   switch(j){
			   case 0:
				   suits[suitscount]='s';
				   break;
			   case 1:
				   suits[suitscount]='h';
				   break;
			   case 2:
				   suits[suitscount]='d';
				   break;
			   case 3:
				   suits[suitscount]='c';
				   break;
			   }
			   suitscount++;
			}
		}
		
		
	}
	public Card drawNextCard(){
		currentCard++;
		return cards[currentCard];	
	}
	public void shuffle(){
		    
	       /*List list=new ArrayList<Integer>();  
	        for (int i = 0; i < 52; i++)  
	            list.add(i+1);  
	        Collections.shuffle(list);  
	        list.toArray(cards);  */
		Random r = new Random();  
		for(int i=cards.length-1; i>=1; i--){  
		    int j=r.nextInt(i);  
		    Card t =cards[i];  //t is a local value
		    cards[i]=cards[j];  //last card and random card swap
		    cards[j]=t;  
		}  
		 
	         
	}
	

}
