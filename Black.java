
/**
 * Thien Lai
 */
public class Black extends CarColor
{
    //Contructor connected to CarModelImproved
    public Black(CarModelImproved car)
    {
        super(car);
    }
    //Contructor connected to CarColor
    public Black(CarColor color)
    {
        super(color);
    }
    //toString method to printout Black Color
    public String toString()
    {
        return super.toString() + "Black Color \r\n";
    }
   
}
