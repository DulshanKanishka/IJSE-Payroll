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
public class CourseDTO extends SuperDTO {

    private String cid;
    private String coursename;
    private String duration;
    private String taxRate;

    public CourseDTO(String cid, String coursename, String duration, String taxRate) {
        this.cid = cid;
        this.coursename = coursename;
        this.duration = duration;
        this.taxRate = taxRate;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(String taxRate) {
        this.taxRate = taxRate;
    }

}
