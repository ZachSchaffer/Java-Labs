
public class Shopping 
{

    public static void main(String[] args)
    {
    	ShoppingCart cartt = new ShoppingCart();
    	
    	do
    	{
    
    		String itemName = GetInfo.getString("What is the name of the item?");
    		int quantity = GetInfo.getInt("Enter how many " + itemName + "(s) do you want?");
    		double price = GetInfo.getDouble("How much does each " + itemName + " cost?");
    		
    		Item item1 = new Item(itemName, price, quantity);
    		cartt.addToCart(item1);
    		
    	System.out.println(cartt.toString());
    	}
    	while(GetInfo.getYesNo("Would you like to purchase more goods?"));
    	
    }
    
    
}