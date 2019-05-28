/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.dto;

/**
 *
 * @author epc
 */
public class PaymentDTO extends SuperDTO {

    private String pid;
    private  String regId;
    private String paymentstate;
    private String Arrears;
    private String NextPaymentDate;

    public PaymentDTO() {
    }

    public PaymentDTO(String pid, String regId, String paymentstate, String Arrears, String NextPaymentDate) {
        this.pid = pid;
        this.regId = regId;
        this.paymentstate = paymentstate;
        this.Arrears = Arrears;
        this.NextPaymentDate = NextPaymentDate;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getRegId() {
        return regId;
    }

    public void setRegId(String regId) {
        this.regId = regId;
    }

    public String getPaymentstate() {
        return paymentstate;
    }

    public void setPaymentstate(String paymentstate) {
        this.paymentstate = paymentstate;
    }

    public String getArrears() {
        return Arrears;
    }

    public void setArrears(String Arrears) {
        this.Arrears = Arrears;
    }

    public String getNextPaymentDate() {
        return NextPaymentDate;
    }

    public void setNextPaymentDate(String NextPaymentDate) {
        this.NextPaymentDate = NextPaymentDate;
    }

   
}
