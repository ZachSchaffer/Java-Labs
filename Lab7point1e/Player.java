// **********************************************************
// Player.java
//
// Defines a Player class that holds information about an athlete.
// **********************************************************

public class Player
{
    private String name;
    private String team;
    private int jerseyNumber;


    //-----------------------------------------------------------
    // Prompts for and reads in the player's name, team, and 
    // jersey number.
    //-----------------------------------------------------------

    public void readPlayer()
    {
    	
		name = GetInfo.getString("Name: ");
 
 		team = GetInfo.getString("Team: ");

		jerseyNumber = GetInfo.getInt("Jersey number: ");
		
    }

	public String getName()
	{
		return name;
	}
	
	public String getTeam()
	{
		return team;
	}

	public int getJersey()
	{
		return jerseyNumber;
	}
	
	public boolean equals(Player alt_player)
	{
		if((this.getJersey() == (alt_player.getJersey()))  && ((alt_player.getTeam()).equals(team)))
		{
			return true;
		}
		else return false;
	}


    }
    
    


