package report.api.models.Billing;

import java.util.Date;

public class BillingItem {
    private String docNo;
    private int seqNo;
    private String txNo;
    private Date txDate;
    private String txType;
    private String txBrnCode;
    private double txAmt;
    private double txAmtCur;

    public String getDocNo() {
        return docNo;
    }

    public void setDocNo(String pdId) {
        this.docNo = docNo;
    }

    public int getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(int seqNo) {
        this.seqNo = seqNo;
    }

    public String getTxNo() {
        return txNo;
    }

    public void setTxNo(String txNo) {
        this.txNo = txNo;
    }

    public Date getTxDate() {
        return txDate;
    }

    public void setTxDate(Date txDate) {
        this.txDate = txDate;
    }

    public String getTxType() {
        return txType;
    }

    public void setTxType(String txType) {
        this.txType = txType;
    }

    public String getTxBrnCode() {
        return txBrnCode;
    }

    public void setTxBrnCode(String txBrnCode) {
        this.txBrnCode = txBrnCode;
    }

    public Double getTxAmt() {
        return txAmt;
    }

    public void setTxAmt(Double txAmt) {
        this.txAmt = txAmt;
    }

    public Double getTxAmtCur() {
        return txAmtCur;
    }

    public void setTxAmtCur(Double txAmtCur) {
        this.txAmtCur = txAmtCur;
    }
}
