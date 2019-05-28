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
public class BatchDTO extends SuperDTO {

    private String bid;
    private String courseId;
    private String batch;
    private String startDate;
    private String batchState;
    private String discountForFullPayment;
    private String fee;

    public BatchDTO(String bid, String courseId, String batch, String startDate, String batchState, String discountForFullPayment, String fee) {
        this.bid = bid;
        this.courseId = courseId;
        this.batch = batch;
        this.startDate = startDate;
        this.batchState = batchState;
        this.discountForFullPayment = discountForFullPayment;
        this.fee = fee;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getBatchState() {
        return batchState;
    }

    public void setBatchState(String batchState) {
        this.batchState = batchState;
    }

    public String getDiscountForFullPayment() {
        return discountForFullPayment;
    }

    public void setDiscountForFullPayment(String discountForFullPayment) {
        this.discountForFullPayment = discountForFullPayment;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

}
