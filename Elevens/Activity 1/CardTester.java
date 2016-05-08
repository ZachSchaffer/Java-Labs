/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card card1 = new Card("King", "Hearts", 13);
		
		Card card2 = new Card("Two", "Clubs", 2);
			
		Card card3 = new Card("Two", "Clubs", 2);
		
		System.out.println(card1.toString());
			
			if(card1.matches(card2))
				System.out.println("This card matches card 2");
			if(card1.matches(card3))
				System.out.println("This card matches card 3");
				
			
		System.out.println(card2.toString());
				
			if(card2.matches(card1))
				System.out.println("This card matches card 1");
			if(card2.matches(card3))
				System.out.println("This card matches card 3");
	
		System.out.println(card3.toString());
			
			if(card3.matches(card1))
				System.out.println("This card matches card 1");
			if(card3.matches(card2))
				System.out.println("This card matches card 2");			
				
	
	}
}
