
/**
 * Thien Lai
 */
public class White extends CarColor
{
    //Contructor connected to CarModelImproved
    public White(CarModelImproved car)
    {
        super(car);
    }
    //Contructor connected to CarColor
    public White(CarColor color)
    {
        super(color);
    }
    //toString method to printout White color
    public String toString()
    {
        return super.toString() + "White Color \r\n";
    }
   
}
