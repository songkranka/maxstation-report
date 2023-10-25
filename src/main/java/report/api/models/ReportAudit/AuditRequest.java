package report.api.models.ReportAudit;

public class AuditRequest {
    public String CompCode;
    public String BrnCode;
    public String DocNo;

    public AuditRequest(String compCode, String brnCode, String docNo) {
        CompCode = compCode;
        BrnCode = brnCode;
        DocNo = docNo;
    }

    public String getCompCode() {
        return CompCode;
    }

    public void setCompCode(String compCode) {
        CompCode = compCode;
    }

    public String getBrnCode() {
        return BrnCode;
    }

    public void setBrnCode(String brnCode) {
        BrnCode = brnCode;
    }

    public String getDocNo() {
        return DocNo;
    }

    public void setDocNo(String docNo) {
        DocNo = docNo;
    }
}
