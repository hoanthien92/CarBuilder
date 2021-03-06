
/**
 * Write a description of class CarItem here.
 * 
 * Thien Lai 
 * 9/29/2014
 */
public abstract class CarItem
{
    private CarItem nextCar;
    /*
     * CarItem Constructior
     */
    public CarItem(CarItem nextCar){
        this.nextCar = nextCar;    
    }
    /*
     * return the cost of next car item
     */
    public double cost()
    {
        return nextCar.cost();
    }
    /*
     * Verify if the parameter is a duplicate object
     */
    public boolean isDuplicate(CarOption check) 
    {
        if (nextCar instanceof CarColor)
            return false;
        else if(check.equals((CarOption) nextCar))
            return true;
        else 
            return nextCar.isDuplicate(check);
    }
   /*
    * returns the String description of next Car Item
    */
    public String toString()
    {
        return nextCar.toString();
    }
}

