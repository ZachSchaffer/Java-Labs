// **********************************************************************
//   ShoppingCart.java
//
//   Represents a shopping cart as an array of cart
// **********************************************************************

import java.text.NumberFormat;

public class ShoppingCart


{

    private int itemCount;      // total number of cart in the cart
    private double totalPrice;  // total price of cart in the cart
    private int capacity;       // current cart capacity
	
	Item[] cart = new Item[capacity];
    // -----------------------------------------------------------
    //  Creates an empty shopping cart with a capacity of 5 cart.
    // -----------------------------------------------------------

    public ShoppingCart()

    {
            capacity = 5;
            itemCount = 0;
            totalPrice = 0.0;
            
    		
    }

    // -------------------------------------------------------
    //  Adds an item to the shopping cart.
    // -------------------------------------------------------

    public void addToCart(Item item)
    {
	increaseSize();
	
		for(int i = 0; i < cart.length; i++)
    	{
    		if(cart[i] == null)
    		{
    			cart[i] = item;
    			i = cart.length;
    		}
    	}
 

    }



    // ---------------------------------------------------------
    //  Increases the capacity of the shopping cart by 3
    // ---------------------------------------------------------
   
    private void increaseSize()
    {
		int oriLength = cart.length;
		Item[] temp = new Item[cart.length +3];
		for(int x = 0; x < temp.length; x++)
		{
			if(x<=(oriLength-1))
			{
			temp[x] = cart[x];
			}
			else
			{
				temp[x] = null;
			}
			
		}
		cart = temp;	

    }
    
      public void addItem(Item item)
    {
    	increaseSize();
    	
    	for(int i = 0; i < cart.length; i++)
    	{
    		if(cart[i] == null)
    		{
    			cart[i] = item;
    			i = cart.length;
    		}
    	}
    }
    
    public int getItemCount()
    {
    	int sum = 0;
    	
    	for(int i = 0; i < cart.length; i++)
    	{
    		if(cart[i] != null)
    		{
    			sum += cart[i].getQuantity();
    		}
    	}
    	
    	return sum;
    }
        
   	public double getPriceTotal()
   	{
   		double sum = 0;
   		
   		for(int i = 0; i < cart.length; i++)
   		{
   			if(cart[i] != null)
   			{
   				sum += cart[i].getPrice() * cart[i].getQuantity();
   			}
   		}
   		
   		return sum;
   	}
    
   public String toString()
    {
    	 NumberFormat fmt = NumberFormat.getCurrencyInstance();
    	
    	String work = new String("\nItem Name \t Price \t Quantity ");
    	
    	for(int i = 0; i < cart.length; i++)
    	{
    		if(cart[i] != null)
    		{
    			work = work + "\n"+cart[i].getName() +"\t\t "+ fmt.format(cart[i].getPrice()) +"\t\t"+cart[i].getQuantity()+ "\n\n";
    		}
    	}
    	
    	work += "---------------------------------------------------------------\n\nTotal Price : " + fmt.format(getPriceTotal()) + "\ncart Purchased : " + getItemCount();
    	
    	
    	        
    
    return work;
    }

    
 

}