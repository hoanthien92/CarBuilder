
/**
 */
public class CarBuilder
{
    private CarItem car;
    
    /**
     * CarBuilder constructor
     */
    public CarBuilder()
    {
        car = null;
    }
    /*
     * Create a model if the input is ok
     */
    public boolean buildModel(char modelChar)
    {
        modelChar = Character.toUpperCase(modelChar); //Convert to Upper Case
        if (!hasModel()&&(modelChar == 'A' || modelChar == 'C' || modelChar =='F'))
        {
            car = new CarModelImproved(modelChar); //create a model based on input
        }
        else
            return false; //return false if no Model is chosen
        return true;
    }
    /*
     * Create a color if the input is ok
     */
    public boolean buildColor(char colorChar)
    {
        colorChar = Character.toUpperCase(colorChar); //Convert it to Upper Case
        if(hasModel()) // check if it has a model
            if (car instanceof CarModelImproved) //Check if car belongs to object CarModelImproved
                if(colorChar == 'B')
                    car = new Black((CarModelImproved) car); //Create Black Color
                else if (colorChar == 'S')
                    car = new Silver((CarModelImproved) car); //Create Silver Color
                else if (colorChar == 'W')
                    car = new White((CarModelImproved) car); // Create White Color
                else
                    return false;
            else if (car instanceof CarColor) //Check if car is the type of CarColor
                if (colorChar == 'B')
                    car = new Black((CarColor) car);
                else if (colorChar == 'S')
                    car = new Silver((CarColor) car);
                else if (colorChar == 'W')
                    car = new White((CarColor) car);
                else
                    return false;
            else
                return false;
            
        else
            return false;
        return true;
    }
    /*
     * Create an Option if the input is okay
     */
    public boolean buildOption(char optionChar)
    {
        optionChar = Character.toUpperCase(optionChar);
        if (hasModel())
            if(car instanceof CarColor)
                if (optionChar== 'A')
                {
                    Alloy alloyWheel = new Alloy((CarColor) car);
                    if(!alloyWheel.isDuplicate())
                        car = alloyWheel;
                }
                else if (optionChar == 'F')
                {
                    FloorMats floor = new FloorMats((CarColor) car);
                    if(!floor.isDuplicate())
                        car = floor;
                }
                else if (optionChar == 'G')
                {
                    GPS gps = new GPS((CarColor) car);
                    if(!gps.isDuplicate())
                        car = gps;
                }
                else if (optionChar == 'S')
                {
                    Spoilers spoil = new Spoilers ((CarColor) car);
                    if(!spoil.isDuplicate())
                        car = spoil;
                }
                else
                    return false;
            
            else if(car instanceof CarOption)
                if (optionChar== 'A')
                {
                    Alloy alloyWheel = new Alloy((CarOption) car);
                    if(!alloyWheel.isDuplicate())
                        car = alloyWheel;
                }
                else if (optionChar == 'F')
                {
                    FloorMats floor = new FloorMats((CarOption) car);
                    if(!floor.isDuplicate())
                        car = floor;
                }
                else if (optionChar == 'G')
                {
                    GPS gps = new GPS((CarOption) car);
                    if(!gps.isDuplicate())
                        car = gps;
                }
                else if (optionChar == 'S')
                {
                    Spoilers spoil = new Spoilers ((CarOption) car);
                    if(!spoil.isDuplicate())
                        car = spoil;
                }
                else
                    return false;
            
            else
                return false;
        
        else 
            return false;
        return true;
    }
    /*
     * Check Whether or not it has a model
     */
    private boolean hasModel()
    {
        if (car != null)
            return true;
        else
            return false;
    }
    /*
     * return the finished order or null if the order is incomplete
     */
    public CarItem orderCar()
    {
        return car;
    }
}
