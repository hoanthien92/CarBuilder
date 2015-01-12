
/**
 */
public abstract class CarColor extends CarItem
{
    /*
     * CarColor Constructor, accepting a CarModelImproved variable
     */
    public CarColor(CarModelImproved car)
    {
        super(car);
    }
    /**
     * CarColor Constructor accepting CarColor variable
     */
    public CarColor(CarColor color)
    {
        super(color);
    }
    /**
     * get CarColor cost price
     */
    public double cost()
    {
        return super.cost() + 247.67; 
    }
    /**
     * get CarColor String
     */
    public String toString()
    {
        return super.toString() + "Color: ";
    }
}
