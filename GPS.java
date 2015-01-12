public class GPS extends CarOption
{
    //Contructor connected to colors
    public GPS(CarColor car)
    {
        super(car);
    }
    //Contructor connected to options
    public GPS(CarOption option)
    {
        super(option);
    }
    
	/**
     * verifies if the paramater is equal to this object
     */
	public boolean equals(CarOption option)
	{	
		return option instanceof GPS;
	}
	//toString method to printout Option
    public String toString()
    {
        return super.toString() + " GPS \r\n";
    }
    

}
