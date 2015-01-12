public class Spoilers extends CarOption
{
    //Contructor connected to colors
    public Spoilers(CarColor car)
    {
        super(car);
    }
    //Contructor connected to option
    public Spoilers(CarOption option)
    {
        super(option);
    }
    
	/**
     * verifies if the paramater is equal to this object
     */
	public boolean equals(CarOption option)
	{	
		return option instanceof Spoilers;
	}
	//toString to printout Spoilers Option
    public String toString()
    {
        return super.toString() + " Spoilers \r\n";
    }
    

}
