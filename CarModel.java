
/**
 * Tortilla Class
 */
public abstract class CarModel extends CarItem
{
    /*
     * CarModel constructor
     */
    public CarModel()
    {
        super(null);
    }
    /*
     * GET CarModel cost price
     */
    public abstract double cost();
    /*
     * Return string
     */
    public String toString()
    {
        return "Car Model: ";
    }
}
