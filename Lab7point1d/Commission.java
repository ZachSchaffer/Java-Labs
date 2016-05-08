
import java.text.NumberFormat;
public class Commission extends Hourly
{

double commision;
double sales;
double crate1;

NumberFormat fmt = NumberFormat.getCurrencyInstance();

    public Commission(String eName, String eAddress, String ePhone,String socSecNumber, double rate, double crate)
    {
    	
    	super(eName,  eAddress,  ePhone,socSecNumber,  rate);
    	crate1 = crate;
    }
    
    public void addSales (double totalSales)
    {
    	sales += totalSales;
    }
    
    public double pay()
    { 	
    	double pay1= (super.pay())+commision;
    	sales = 0;
    	return pay1;
    }
    
    public String toString()
    {
    commision = crate1*sales;
    String work = (super.toString() +"\nTotal Sales: "+fmt.format(sales)+"\nCommision Pay: "+fmt.format(commision)+"\nTotal Pay: "+fmt.format(this.pay()));
    return work;
    }
    
}