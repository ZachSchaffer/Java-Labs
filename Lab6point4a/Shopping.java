
import java.text.NumberFormat;
import java.util.ArrayList;

public class Shopping 
{

    public static void main(String[] args)
    {
    	ArrayList cart = new ArrayList();
    	NumberFormat fmt = NumberFormat.getCurrencyInstance();
    	
    int sum1 =0;
   	double sum2 = 0;
   	String work = "\n";
    	
    	
    	
    	do
    	{
    
    		String itemName = GetInfo.getString("What is the name of the item?");
    		int quantity = GetInfo.getInt("Enter how many " + itemName + "(s) do you want?");
    		double price = GetInfo.getDouble("How much does each " + itemName + " cost?");
    		
    		Item item1 = new Item(itemName, price, quantity);
    		cart.add(item1);
    
    
    		work = "\nItem Name \t Price \t Quantity ";
 			sum1 = 0;
 			sum2 = 0;   	
    	
    		for(int i = 0; i < cart.size(); i++)
    		{
    	
    				sum1 = sum1 + ((Item) cart.get(i)).getQuantity();

    		}
   	
   		
   			for(int i = 0; i < cart.size(); i++)
   			{
  
   					sum2 += (((Item)cart.get(i)).getPrice()) *  (((Item)cart.get(i)).getQuantity());
   			
   			}

	    	for (int i = 0; i < cart.size(); i++)
    		{
    		
    			work = work + ("\n" + ((Item)cart.get(i)).getName() + "\t" + fmt.format((((Item)cart.get(i)).getPrice()) * (((Item)cart.get(i)).getQuantity())) + "\t" + (((Item)cart.get(i)).getQuantity()) + "\n\n");
	    	
	    	}
    	
    		work += "---------------------------------------------------------------\n\nTotal Price : " + fmt.format(sum2) + "\nTotal Purchased : " + sum1;
    	
    	
    	
    		GetInfo.showMessage(work);	
    	

    	



			//GetInfo.showMessage("---------------------------------------------------------------\n\nTotal Price : " + fmt.format(sum1) + "\nTotal Purchased : " + sum2+work);

    	}
    	while(GetInfo.getYesNo("Would you like to purchase more goods?"));
    	GetInfo.showMessage("Total Price : " + fmt.format(sum2) + "\nTotal Items Purchased : " + sum1+"\n---------------------------------\n Thank you for shopping : ^ )");
    }
    
    
 
     
}