
/**
 */
public class HondaFitLoaded extends CarBuilder
{
    /**
     * HondaFitLoaded Constructor
     */
    public HondaFitLoaded()
    {
        super();
        super.buildModel('F');
        super.buildColor('S');
        super.buildOption('S');
        super.buildOption('G');
    }
    public CarItem orderCar()
    {
        return super.orderCar();
    }
}
