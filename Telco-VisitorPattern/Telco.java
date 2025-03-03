public class Telco implements TelcoSubscription {

    private String telcoName;
    private double promoPrice;
    private int dataAllowance;
    private boolean unliCallText;
    
    public Telco(int dateAllowance, double promoPrice, String telcoName, boolean unliCallText){
        setDataAllowance(dateAllowance);
        setPromoPrice(promoPrice);
        setTelcoName(telcoName);
        setUnliCallText(unliCallText);
    }
    public void setTelcoName(String telcoName){
        this.telcoName = telcoName;
    }
    public String getTelcoName(){
        return telcoName;
    }

    public void setPromoPrice(double promoPrice){
        this.promoPrice = promoPrice;
    }
    public double getPromoPrice(){
        return promoPrice;
    }

    public void setDataAllowance(int dateAllowance){
        this.dataAllowance = dateAllowance;
    }
    public int getDataAllowance(){
        return dataAllowance;
    }

    public void setUnliCallText(boolean unliCallText){
        this.unliCallText = unliCallText;
    }
    public boolean getUnliCallText(){
        return unliCallText;
    }
    
}