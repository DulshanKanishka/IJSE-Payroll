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
public class BatchTransferDTO extends SuperDTO{

    private String bTID;
    private String registrationId;
    private String fromBatch;
    private String toBatch;
    private String btFee;

    public BatchTransferDTO(String bTID, String registrationId, String fromBatch, String toBatch, String btFee) {
        this.bTID = bTID;
        this.registrationId = registrationId;
        this.fromBatch = fromBatch;
        this.toBatch = toBatch;
        this.btFee = btFee;
    }

    public String getbTID() {
        return bTID;
    }

    public void setbTID(String bTID) {
        this.bTID = bTID;
    }

    public String getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }

    public String getFromBatch() {
        return fromBatch;
    }

    public void setFromBatch(String fromBatch) {
        this.fromBatch = fromBatch;
    }

    public String getToBatch() {
        return toBatch;
    }

    public void setToBatch(String toBatch) {
        this.toBatch = toBatch;
    }

    public String getBtFee() {
        return btFee;
    }

    public void setBtFee(String btFee) {
        this.btFee = btFee;
    }

}
