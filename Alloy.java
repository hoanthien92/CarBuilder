public class Alloy extends CarOption
{
    //Contructor connected to colors
    public Alloy(CarColor car)
    {
        super(car);
    }
    //Contructor connected to Options
    public Alloy(CarOption option)
    {
        super(option);
    }
    
	/**
     * verifies if the paramater is equal to this object
     */
	public boolean equals(CarOption option)
	{	
		return option instanceof Alloy;
	}
	//toString method printout the option Alloy Wheels
    public String toString()
    {
        return super.toString() + " Alloy Wheels \r\n";
    }
    

}
