// **********************************************************
// ComparePlayers
//
// Reads in two Player objects and tells whether they represent
// the same player.
// **********************************************************

public class ComparePlayers
{
    public static void main(String[] args)
    {
	Player player1 = new Player();
	Player player2 = new Player();

	//Prompt for and read in information for player 1
	
	player1.readPlayer();
	

	//Prompt for and read in information for player 2

	player2.readPlayer();

	//Compare player1 to player 2 and print if they are equal
	
	if (player1.equals(player2))
	{
		GetInfo.showMessage("The players the same person");	
	}

	else
		GetInfo.showMessage("The players are not the same person");
	

    }
}
	    
