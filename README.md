black joker

this is a card game just like blackjack.
it is made by jingtiangao 

src/pro2 is the game source code


description

You will create a card game called BlackJoker, which is not Blackjack.
The game:
The cards:

The cards have ranks from 2 to 10, J, Q, K and A with suits and the cards may not reappear.
The hand values are the sum of card points according to the following table.

Rank 2 3 4 5 6 7 8 9 10 J Q K A
Points 2 3 4 5 6 7 8 9 10 10 10 10 10

The card suits are defined in the following table with their names, colours and symbols.

Suit ♠           ♥          ♦               ♣
Name Spades Hearts Diamonds Clubs
Colour Black Red   Red      Black
Symbol s      h    d        c 
The cards are in a random order of equiprobability.

The rules:
The dealer receives its initial two cards and one card is face up.
The player receives its initial two cards
If the two initial cards in the hand received by either the dealer or the player are two cards
from 10, J, Q, K or A in the same colour, it is called BlackJoker and the hand wins. The
player wins a tie.
If no one wins with BlackJoker, the game continues.
The player makes a decision among two options: “Hit” or “Stand”.
If the player hits, it takes another card until it stands.
If the player stands, it takes no more cards then the dealer will takes cards.
The dealer will take cards until the hand busts or achieves a value of 17 or higher.
If either the player or the dealer exceeds 20 points at any time, it busts and loses the game
immediately.
If no one busts, the hand of higher values wins and the player wins a tie.
Important Note: You must implement the above rules. If the game plays other rules such as the rules
of Blackjack, you will receive 0 mark for this program.

$java BlackJoker
Welcome to the game of BlackJoker!
What's your name? Peter
Dealer’s hand: 10d Total: 10
Peter’s hand: Ah 4c Total: 14
Programming Fundamentals
- 5/8 -Hit(H or h) or Stand(S or s):h
Peter’s hand: Ah 4c 5d Total: 19
Hit(H or h) or Stand(S or s):S
Dealer’s hand: 10d Ks Total: 20
Dealer wins!
$java BlackJoker
Welcome to the game of BlackJoker!
What's your name? John
Dealer’s hands: 6h Total: 6
John’s hand: 9d Qc Total: 19
Hit(H or h) or Stand(S or s):s
Dealer’s hand: 6h Ah Jd Total: 26
Dealer busts!
$java BlackJoker
Welcome to the game of BlackJoker!
What's your name? Peter
Dealer's hand: 6s Total: 6
Peter's hand: Qh Jh Total: 20
Dealer's hand: 6s 9h Total: 15
Peter has BlackJoker! Peter wins
$java BlackJoker
Welcome to the game of BlackJoker!
What's your name? Peter
Dealer's hand: Ad Total: 10
Peter's hand: 8h 3h Total: 11
Dealer's hand: Ad Qh Total: 20
Dealer has BlackJoker! The dealer wins
$java BlackJoker
Welcome to the game of BlackJoker!
What's your name? Bob
Dealer’s hand: 2s Total: 2
Bob’s hand: 9d 3c Total: 12
Hit(H or h) or Stand(S or s):H
Bob’s hand: 9d 3c Qs Total: 22
Bob busts!



