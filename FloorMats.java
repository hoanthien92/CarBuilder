public class FloorMats extends CarOption
{
    //Contructor connected to colors
    public FloorMats(CarColor car)
    {
        super(car);
    }
    //Contructor connected to option
    public FloorMats(CarOption option)
    {
        super(option);
    }
    
	/**
     * verifies if the paramater is equal to this object
     */
	public boolean equals(CarOption option)
	{	
		return option instanceof FloorMats;
	}
	//toString method to printout the option
    public String toString()
    {
        return super.toString() + " Floor Mats \r\n";
    }
    

}
