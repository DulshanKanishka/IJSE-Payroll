/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.dto;

import java.util.Date;

/**
 *
 * @author epc
 */
public class RegistrationDTO extends SuperDTO {

    private String rid;
    private String studentid;
    private String batchId;
    private String regFee;
    private String regDate;

    public RegistrationDTO(String rid, String studentid, String batchId, String regFee, String regDate) {
        this.rid = rid;
        this.studentid = studentid;
        this.batchId = batchId;
        this.regFee = regFee;
        this.regDate = regDate;
    }

    public RegistrationDTO() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getBatchid() {
        return batchId;
    }

    public void setBatchid(String batchId) {
        this.batchId = batchId;
    }

    public String getRegFee() {
        return regFee;
    }

    public void setRegFee(String regFee) {
        this.regFee = regFee;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

   
}
