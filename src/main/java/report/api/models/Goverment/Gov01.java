package report.api.models.Goverment;

import java.util.Date;
import java.util.List;

public class Gov01 {
    private String compCode;
    private String compName;

    private String brnCode;
    private String brnName;
    private String brnAddress;
    private String branchNo;

    private List<Gov01Head> docDates;

    private List<Gov01Meter> meters;
    private List<GOV01Summary> diffs;
    private List<GOV01Summary> summaries;

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


    public List<Gov01Head> getDocDates() {
        return docDates;
    }

    public void setDocDates(List<Gov01Head> docDates) {
        this.docDates = docDates;
    }

    public List<Gov01Meter> getMeters() {
        return meters;
    }

    public void setMeters(List<Gov01Meter> meters) {
        this.meters = meters;
    }

    public List<GOV01Summary> getDiffs() {
        return diffs;
    }

    public void setDiffs(List<GOV01Summary> diffs) {
        this.diffs = diffs;
    }



    public List<GOV01Summary> getSummaries() {
        return summaries;
    }

    public void setSummaries(List<GOV01Summary> summaries) {
        this.summaries = summaries;
    }
}
