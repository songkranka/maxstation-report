package report.api.models.Station;

import java.util.List;

public class CashierModel {
    private String compCode;
    private String compName;
    private String brnCode;
    private String brnName;
    private List<DopPeriodEmp> dopPeriodEmpList;


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

    public List<DopPeriodEmp> getDopPeriodEmpList() {
        return dopPeriodEmpList;
    }

    public void setDopPeriodEmpList(List<DopPeriodEmp> dopPeriodEmpList) {
        this.dopPeriodEmpList = dopPeriodEmpList;
    }

    public String getCompCode() {
        return compCode;
    }

    public void setCompCode(String compCode) {
        this.compCode = compCode;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }
}
