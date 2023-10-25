package report.api.models.Goverment;

public class DopPeriodTank {
    private String tankId;
    private String pdId;
    private double realQty;


    public String getTankId() {
        return tankId;
    }

    public void setTankId(String tankId) {
        this.tankId = tankId;
    }

    public String getPdId() {
        return pdId;
    }

    public void setPdId(String pdId) {
        this.pdId = pdId;
    }

    public double getRealQty() {
        return realQty;
    }

    public void setRealQty(double realQty) {
        this.realQty = realQty;
    }
}
