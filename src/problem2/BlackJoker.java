package problem2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BlackJoker {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to the game of BlackJoker!");
		System.out.print("What's your name?");
		InputStreamReader ir = new InputStreamReader(System.in);  
	    BufferedReader in = new BufferedReader(ir);
	     
	    String name="";
		try {
			name = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	     Player player=new Player(name);
	     Player dealer=new Player("dealer");
	     dealer.cards =new Card[5];//dealer init
	     player.cards =new Card[5];//player init
	     CardDeck carddeck= new CardDeck();
	     Card[] cards= new Card[52];
	     
			for(int i=0;i<52;i++){
				cards[i]= new Card(carddeck.ranks[i],carddeck.suits[i]);
			}
		 carddeck.cards=cards;
		 carddeck.shuffle();
	     dealer.drawACard(carddeck);
	     dealer.drawACard(carddeck);
	     player.drawACard(carddeck);
	     player.drawACard(carddeck);
		 System.out.println("Dealer’s hands: "+dealer.cards[0].toString()+
				 " Total: "+dealer.cards[0].getPoint());
		 System.out.println(player.name+"’s hand: "+
				 player.cards[0].toString()+" "+
				 player.cards[1].toString()+
				 " Total: "+ player.getHandValues());
		 if(player.hasBlackJoker()){
			 System.out.println("dealer’s hand: "+
					 dealer.cards[0].toString()+" "+
					 dealer.cards[1].toString()+
					 " Total: "+ dealer.getHandValues());
			 System.out.println(player.name+" has BlackJoker! "+player.name+" wins");
		 }else if(dealer.hasBlackJoker()){
			 System.out.println("dealer’s hand: "+
					 dealer.cards[0].toString()+" "+
					 dealer.cards[1].toString()+
					 " Total: "+ dealer.getHandValues());
			 System.out.println("Dealer has BlackJoker! The dealer wins");
		 }else{
		 
		 System.out.print("Hit(H or h) or Stand(S or s):");
		 char hitOrStand;
		 boolean isplayerbust=false;
		
			//hitOrStand = in.readLine();
		 hitOrStand = (char) System.in.read();
		 while(hitOrStand=='h'|| hitOrStand=='H'){//THIS IS the program for hit and stand
			player.drawACard(carddeck);
			String playercardstring="";			// THIS IS THE PART FOR HIT
			for(int i=0;i<player.totalCards;i++){
			playercardstring = playercardstring+player.cards[i].toString()+" ";
			
			}
			System.out.println(player.name+"’s hand: "+
					playercardstring+
					 " Total: "+ player.getHandValues());
			if(player.getHandValues()>20)
			{
				System.out.println(player.name+ " busts!");
				isplayerbust = true;	
				break;
			}
			System.out.print("Hit(H or h) or Stand(S or s):");
			System.in.read();
			hitOrStand = (char) System.in.read();
			
			
		}
		
		//this is the part for stand
		if(!isplayerbust){
					     System.out.println("dealer’s hand: "+
						 dealer.cards[0].toString()+" "+
						 dealer.cards[1].toString()+
						 " Total: "+ dealer.getHandValues());
				
						if(dealer.getHandValues()>20)
							 System.out.println("Dealer busts!");
						else if(dealer.getHandValues()>player.getHandValues()){
							System.out.println("Dealer wins!");
						}else if(dealer.getHandValues()<player.getHandValues()){
							System.out.println(player.name+" wins!");
						}
		}
	  }
	}
}
