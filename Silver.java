
/**
 * Thien Lai
 */
public class Silver extends CarColor
{
    //Contructor connected CarModelImproved
    public Silver(CarModelImproved car)
    {
        super(car);
    }
    //Contructor connected CarMColor
    public Silver(CarColor color)
    {
        super(color);
    }
    //toString method to printout Silver color
    public String toString()
    {
        return super.toString() + "Silver Color \r\n";
    }
   
}
