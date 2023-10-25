package report.api.models.Goverment;

import java.util.List;

public class Gov03 {
    private String compCode;
    private String compName;
    private String registerId;
    private String brnCode;
    private String brnName;
    private String brnAddress;
    private String branchNo;
    private String monthName;
    private String year;
    private List<Gov03Tank> tanks;
    private List<Gov03Summary> summaries;

    public String getCompCode() {
        return compCode;
    }

    public void setCompCode(String compCode) {
        this.compCode = compCode;
    }

    public String getBrnCode() {
        return brnCode;
    }

    public void setBrnCode(String brnCode) {
        this.brnCode = brnCode;
    }

    public String getBrnName() {
        return brnName;
    }

    public void setBrnName(String brnName) {
        this.brnName = brnName;
    }

    public String getBrnAddress() {
        return brnAddress;
    }

    public void setBrnAddress(String brnAddress) {
        this.brnAddress = brnAddress;
    }

    public String getBranchNo() {
        return branchNo;
    }

    public void setBranchNo(String branchNo) {
        this.branchNo = branchNo;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public String getMonthName() {
        return monthName;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public List<Gov03Tank> getTanks() {
        return tanks;
    }

    public void setTanks(List<Gov03Tank> tanks) {
        this.tanks = tanks;
    }

    public List<Gov03Summary> getSummaries() {
        return summaries;
    }

    public void setSummaries(List<Gov03Summary> summaries) {
        this.summaries = summaries;
    }

    public String getRegisterId() {
        return registerId;
    }

    public void setRegisterId(String registerId) {
        this.registerId = registerId;
    }
}
