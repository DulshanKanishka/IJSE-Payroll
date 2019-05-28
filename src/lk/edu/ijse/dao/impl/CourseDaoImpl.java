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
import lk.edu.ijse.dto.CourseDTO;

/**
 *
 * @author epc
 */
public class CourseDaoImpl implements CourseDao {

    private Connection connection;

    public CourseDaoImpl() {
        connection = DBConnection.getDBConnection().getConnection();
    }

    @Override
    public boolean add(CourseDTO dto) throws Exception {
        String SQL = "INSERT INTO course VALUES (?,?,?,?)";
        PreparedStatement stm = connection.prepareStatement(SQL);

        stm.setObject(1, dto.getCid());
        stm.setObject(2, dto.getCoursename());
        stm.setObject(3, dto.getDuration());
        stm.setObject(4, dto.getTaxRate());

        int res = stm.executeUpdate();
        return res > 0;
    }

    @Override
    public boolean delete(String dto) throws Exception {
        Statement stm = connection.createStatement();
        String sql = "delete from course where cid='" + dto + "'";
        int res = stm.executeUpdate(sql);
        return res > 0;
    }

    @Override
    public boolean Update(CourseDTO dto) throws Exception {
        System.out.println(dto.getCid());
        Statement stm = connection.createStatement();

        String sql = "update course set coursename='" + dto.getCoursename() + "',duration='" + dto.getDuration() + "',taxRate='" + dto.getTaxRate() + "' where cid='" + dto.getCid() + "'";
        int res = stm.executeUpdate(sql);
        return res > 0;
    }

    @Override
    public CourseDTO Search(String dto) throws Exception {
        Statement stm = connection.createStatement();
        String sql = "Select * from course where cid='" + dto + "'";
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            CourseDTO result = new CourseDTO(
                    rst.getString("cid"),
                    rst.getString("coursename"),
                    rst.getString("duration"),
                    rst.getString("taxRate"));
            return result;

        } else {

            return null;
        }
    }

    @Override
    public ArrayList<CourseDTO> SearchAll() throws Exception {
        String SQL = "Select * From course";
        Statement sta = connection.createStatement();
        ResultSet rst = sta.executeQuery(SQL);
        ArrayList<CourseDTO> itemList = new ArrayList<>();
        while (rst.next()) {
            CourseDTO c1 = new CourseDTO(
                    rst.getString("cid"),
                    rst.getString("coursename"),
                    rst.getString("duration"),
                    rst.getString("taxRate"));
            itemList.add(c1);
        }
        return itemList;
    }

    @Override
    public CourseDTO SearchAllAndShort(String dto) throws Exception {
        Statement stm = connection.createStatement();
        String sql = "Select * from course where coursename='" + dto + "'";
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            CourseDTO result = new CourseDTO(
                    rst.getString("cid"),
                    rst.getString("coursename"),
                    rst.getString("duration"),
                    rst.getString("taxRate"));
            return result;
        } else {
            return null;
        }

    }

}
