
/**
 */
public abstract class CarOption extends CarItem
{
    /**
     * CarOption constructor accepting CarColor variable
     */
    public CarOption(CarColor color)
    {
        super(color);
    }
    /**
     * CarOption constructor accepting CarOption variable
     */
    public CarOption(CarOption opt)
    {
        super(opt);
    }
    /**
     * get CarOption cost price
     */
    public double cost()
    {
        return super.cost() + 399.33;
    }
    /**
     * verify if the paramater is equal to this object
     */
    public abstract boolean equals(CarOption co);
    //Check for duplicate object
    public boolean isDuplicate()
    {
        return super.isDuplicate(this);
    }
    public String toString()
    {
        return super.toString() + "Option: ";
    }
    
    
    
}
