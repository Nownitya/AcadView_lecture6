
package Vehicle;

public class VehicleMain 
{
    public static void main(String[] args) 
    {
        Vehicle TW = new TwoWheeler();
        TW.start();
        TW.stop();
                
        Vehicle FW = new FourWheeler();
        FW.start();
        FW.stop();
        
    }
    
}
