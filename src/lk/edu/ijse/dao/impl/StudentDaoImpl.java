/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import lk.edu.ijse.dao.custom.*;
import lk.edu.ijse.controller.custom.*;
import lk.edu.ijse.db.DBConnection;
import lk.edu.ijse.dto.StudentDTO;

/**
 *
 * @author epc
 */
public class StudentDaoImpl implements StudentDao {

        private Connection connection;

    public StudentDaoImpl() {
        connection = DBConnection.getDBConnection().getConnection();
    }

    @Override
    public boolean add(StudentDTO dto) throws Exception {
               String SQL = "INSERT INTO Student VALUES (?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement stm = connection.prepareStatement(SQL);

        stm.setObject(1, dto.getSid());
        stm.setObject(2, dto.getNic());
        stm.setObject(3, dto.getNameWithInitial());
        stm.setObject(4, dto.getFullname());
        stm.setObject(1, dto.getAddress());
        stm.setObject(2, dto.getTel());
        stm.setObject(3, dto.getSchool());
        stm.setObject(4, dto.getDob());
        stm.setObject(4, dto.getGender());
        stm.setObject(5, dto.getEducationState());
        int res = stm.executeUpdate();
        return res > 0;
    }

    @Override
    public boolean delete(String dto) throws Exception {
                Statement stm = connection.createStatement();
        String sql = "delete from Student where sid='" + dto + "'";
        int res = stm.executeUpdate(sql);
        return res > 0;
    }

    @Override
    public boolean Update(StudentDTO dto) throws Exception {
               System.out.println(dto.getSid());
        Statement stm = connection.createStatement();
       
        String sql = "update Student set nic='" + dto.getNic()+ "',NameWithInitial='" + dto.getNameWithInitial()+ "',fullname='" + dto.getFullname() + "',address='" + dto.getAddress()+ "',Tel='" + dto.getTel()+ "',School='" + dto.getSchool()+ "',dob='" + dto.getDob()+ "',Gender='" + dto.getGender()+ "',EducationState='" + dto.getEducationState()+ "' where sid='" + dto.getSid() + "'";
        int res = stm.executeUpdate(sql);
        return res > 0;
    }

    @Override
    public StudentDTO Search(String dto) throws Exception {
                Statement stm = connection.createStatement();
                System.out.println("Student id "+dto);
        String sql = "Select * from Student where sid='" + dto + "'";
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            StudentDTO result = new StudentDTO(
       
                    rst.getString("sid"),
                    rst.getString("nic"),
                    rst.getString("NameWithInitial"),
                    rst.getString("fullname"),
                    rst.getString("address"),
                    rst.getString("Tel"),
                    rst.getString("School"),
                    rst.getString("dob"),
                    rst.getString("Gender"),
                    rst.getString("EducationState"));
            return result;
        } else {
            return null;
        }
    }

    @Override
    public ArrayList<StudentDTO> SearchAll() throws Exception {
              String SQL = "Select * From batch";
        Statement sta = connection.createStatement();
        ResultSet rst = sta.executeQuery(SQL);
        ArrayList<StudentDTO> itemList = new ArrayList<>();
        while (rst.next()) {
            StudentDTO c1 = new StudentDTO(
       
                    rst.getString("sid"),
                    rst.getString("nic"),
                    rst.getString("NameWithInitial"),
                    rst.getString("fullname"),
                    rst.getString("address"),
                    rst.getString("Tel"),
                    rst.getString("School"),
                    rst.getString("dob"),
                    rst.getString("Gender"),
                    rst.getString("EducationState"));
            itemList.add(c1);
        }
        return itemList;
    }

    @Override
    public StudentDTO SearchAllAndShort(String dto) throws Exception {
                        Statement stm = connection.createStatement();
        String sql = "Select * from Student where nic='" + dto + "'";
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            StudentDTO result = new StudentDTO(
       
                    rst.getString("sid"),
                    rst.getString("nic"),
                    rst.getString("NameWithInitial"),
                    rst.getString("fullname"),
                    rst.getString("address"),
                    rst.getString("Tel"),
                    rst.getString("School"),
                    rst.getString("dob"),
                    rst.getString("Gender"),
                    rst.getString("EducationState"));
            return result;
        } else {
            return null;
        }
    }

}
