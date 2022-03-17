public class Truck extends Vehicle
{
  private int axles;
  private boolean hasTrailer;
  
  public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer)
  {
    super(licensePlate, tollFee, passengers);
    this.axles = axles;
    this.hasTrailer = hasTrailer;
  }

  public int getAxles()
  {
    return axles;
  }

  public boolean isHasTrailer()
  {
    return hasTrailer;
  }

  public boolean validateLicensePlate()
  {
    if(hasTrailer)
    {
      String lastTwo = getLicensePlate().substring(getLicensePlate().length() - 2);
      boolean isValid = (lastTwo.equals("MX") && axles > 4 || (lastTwo.equals("LX") && axles <= 4));
      return isValid;
    }
    else
    {
      return true;
    }
  }

  public void printTruck()
  {
    System.out.println("License plate: " + getLicensePlate() + "\nToll fee: " + getTollFee() + "\nPassengers: " +
            getPassengers() + "\nNumber of axles: " + getAxles() + "\nHas trailer? " + isHasTrailer());
  }
}