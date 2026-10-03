class Methods
{
    void calculateTotalEnergy(double morningEnergy, double eveningEnergy)
    {
        double TotalEnergy= morningEnergy + eveningEnergy;
       System.out.println("Total Energy Generated:" + TotalEnergy);
    }
    public static void main(String args[])
    {
        Methods sc=new Methods();
        sc.calculateTotalEnergy(45.2,22.0);
    }
}