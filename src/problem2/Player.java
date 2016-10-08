package problem2;

public class Player {
     String name;
     Card[] cards;
     int totalCards=0;
     public Player(String name){
    	 this.name=name;
     }
     public String getName(){
    	    return name;
     }
     public void drawACard(CardDeck carddeck){
    	 cards[totalCards]=carddeck.drawNextCard();
    	 totalCards++;
     }
     public int getHandValues(){
    	    int sum=0;
    	    for(int i=0;i<totalCards;i++){
    	    	sum+=cards[i].getPoint();
    	    }
    	    return sum;
     }
     public void displayAllCards(){
    	 String allcards="";
    	 for(int i=0;i<totalCards;i++){
 	    	allcards=allcards+cards[i].toString()+" ";
 	    }
    	 System.out.print(allcards);
     }
     public boolean hasBlackJoker(){
    	 int[] a={0,0};
    	 if(totalCards==2){
    		for(int i=0;i<2;i++){
    			if(cards[i].suit=='h'||
    					cards[i].suit=='d')
    				a[0]++;
    			else 
    				a[1]++;
    		}
    		
    	 }
    	 if(a[0]==2||a[1]==2)
 			return true;
 		 else 
 			return false;
     }
}
