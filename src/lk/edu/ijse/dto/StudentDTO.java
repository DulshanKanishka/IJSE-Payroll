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
public class StudentDTO extends SuperDTO {

    private String sid;
    private String nic;
    private String nameWithInitial;
    private String fullname;
    private String address;
    private String tel;
    private String school;
    private String dob;
    private String gender;
    private String EducationState;

    public StudentDTO() {
    }
    

    public StudentDTO(String sid, String nic, String nameWithInitial, String fullname, String address, String tel, String school, String dob, String gender, String EducationState) {
        this.sid = sid;
        this.nic = nic;
        this.nameWithInitial = nameWithInitial;
        this.fullname = fullname;
        this.address = address;
        this.tel = tel;
        this.school = school;
        this.dob = dob;
        this.gender = gender;
        this.EducationState = EducationState;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getNameWithInitial() {
        return nameWithInitial;
    }

    public void setNameWithInitial(String nameWithInitial) {
        this.nameWithInitial = nameWithInitial;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEducationState() {
        return EducationState;
    }

    public void setEducationState(String EducationState) {
        this.EducationState = EducationState;
    }

}
