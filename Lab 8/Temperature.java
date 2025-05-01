class Temperature{
	private double celcius;

	public void setCelcius(double celcius)
	{
      this.celcius=celcius;
	}
      public double getForenheight()
      {

        return  celcius*9/5+32;
      }

}