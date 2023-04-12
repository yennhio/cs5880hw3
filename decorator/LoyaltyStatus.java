package decorator;

public class LoyaltyStatus {

    int status;

    public LoyaltyStatus(int status) {
        this.status = status;
    }

    public double applyDiscount(double cost) {

        if(status == 1) {
            cost *= 0.9;
        }
        else if (status == 2){
            cost *= 0.8;
        }
        else if (status == 3) {
            cost *= 0.7;
        }

        return cost;
    }
    
}
