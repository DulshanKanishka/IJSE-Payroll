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
public class DailycollectionDTO extends SuperDTO{

    private int autoid;
    private String statee;
    private String batchhh;
    private String dateee;
    private String payyy;

    public DailycollectionDTO(int autoid, String statee, String batchhh, String dateee, String payyy) {
        this.autoid = autoid;
        this.statee = statee;
        this.batchhh = batchhh;
        this.dateee = dateee;
        this.payyy = payyy;
    }

    public int getAutoid() {
        return autoid;
    }

    public void setAutoid(int autoid) {
        this.autoid = autoid;
    }

    public String getStatee() {
        return statee;
    }

    public void setStatee(String statee) {
        this.statee = statee;
    }

    public String getBatchhh() {
        return batchhh;
    }

    public void setBatchhh(String batchhh) {
        this.batchhh = batchhh;
    }

    public String getDateee() {
        return dateee;
    }

    public void setDateee(String dateee) {
        this.dateee = dateee;
    }

    public String getPayyy() {
        return payyy;
    }

    public void setPayyy(String payyy) {
        this.payyy = payyy;
    }

    
    

}
