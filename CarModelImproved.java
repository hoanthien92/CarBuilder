
/**
 * Thien Lai
 */
public class CarModelImproved extends CarItem
{
    private double cost;
    private String str;
    
    /* 
     * CarModelmproved Constructor
     */
    public CarModelImproved(char choice)
    {
        super(null);
        str = "Car Model: ";
        if (choice=='A')
        {
            cost = 23000.99;
            str += "Accord";
        }
        else if (choice == 'C')
        {
            cost = 19000.79;
            str += "Civic";
        }
        else if (choice == 'F')
        {
            cost = 17000.02;
            str += "Fit";
        }
        str += "\r\n";
    }
   
    /**
     * Get CarModelImproved cost price
     */
    public double cost()
    {
        return cost;
    }
    public String toString()
    {
        return str;
    }
}
