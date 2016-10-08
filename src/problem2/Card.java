package problem2;

public class Card {
       String rank;
       char   suit;
       public Card(String rank,char suit){
    	      this.rank=rank;
    	      this.suit=suit;
       }
   public String getRank(){
    	   return rank;
       }
   public char   getSuit(){
	   return suit;
   }
   public int  getPoint(){
	   if(rank=="J"||rank=="Q"||rank=="K"||rank=="A")
		   return 10;
	   else {
		   return Integer.parseInt(rank);
	  }	   
   }
   
   public String toString(){
	   		return rank+suit;
   }
}
