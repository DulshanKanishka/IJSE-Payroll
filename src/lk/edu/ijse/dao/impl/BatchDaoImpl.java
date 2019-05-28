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
import lk.edu.ijse.dto.BatchDTO;

/**
 *
 * @author epc
 */
public class BatchDaoImpl implements BatchDao {

    private Connection connection;

    public BatchDaoImpl() {
        connection = DBConnection.getDBConnection().getConnection();
    }

    @Override
    public boolean add(BatchDTO dto) throws Exception {
        String SQL = "INSERT INTO batch VALUES (?,?,?,?,?,?,?)";
        PreparedStatement stm = connection.prepareStatement(SQL);

        stm.setObject(1, dto.getBid());
        stm.setObject(2, dto.getCourseId());
        stm.setObject(3, dto.getBatch());
        stm.setObject(4, dto.getStartDate());
        stm.setObject(5, dto.getBatchState());
        stm.setObject(6, dto.getDiscountForFullPayment());
        stm.setObject(7, dto.getFee());
        int res = stm.executeUpdate();
        return res > 0;
    }

    @Override
    public boolean delete(String dto) throws Exception {
        Statement stm = connection.createStatement();
        String sql = "delete from batch where bid='" + dto + "'";
        int res = stm.executeUpdate(sql);
        return res > 0;
    }

    @Override
    public boolean Update(BatchDTO dto) throws Exception {

        System.out.println(dto.getBid());
        Statement stm = connection.createStatement();

        String sql = "update batch set courseid='" + dto.getCourseId() + "',batch='" + dto.getBatch() + "',startDate='" + dto.getStartDate() + "',BatchState='" + dto.getBatchState() + "',DiscountsForFullPayments='" + dto.getDiscountForFullPayment() + "',fee='" + dto.getFee() + "' where bid='" + dto.getBid() + "'";
        int res = stm.executeUpdate(sql);
        return res > 0;

    }

    @Override
    public BatchDTO Search(String dto) throws Exception {
        Statement stm = connection.createStatement();
        String sql = "Select * from batch where bid='" + dto + "'";
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            BatchDTO result = new BatchDTO(
                    rst.getString("bid"),
                    rst.getString("courseid"),
                    rst.getString("batch"),
                    rst.getString("startDate"),
                    rst.getString("BatchState"),
                    rst.getString("DiscountsForFullPayments"),
                    rst.getString("fee"));
            return result;
        } else {
            return null;
        }
    }

    @Override
    public ArrayList<BatchDTO> SearchAll() throws Exception {
        String SQL = "Select * From batch";
        Statement sta = connection.createStatement();
        ResultSet rst = sta.executeQuery(SQL);
        ArrayList<BatchDTO> itemList = new ArrayList<>();
        while (rst.next()) {
            BatchDTO c1 = new BatchDTO(
                    rst.getString("bid"),
                    rst.getString("courseid"),
                    rst.getString("batch"),
                    rst.getString("startDate"),
                    rst.getString("BatchState"),
                    rst.getString("DiscountsForFullPayments"),
                    rst.getString("fee"));
            itemList.add(c1);
        }
        return itemList;
    }

    @Override
    public BatchDTO SearchAllAndShort(String dto) throws Exception {
        Statement stm = connection.createStatement();
        String sql = "Select * from batch where courseid='" + dto + "'";
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            BatchDTO result = new BatchDTO(
                    rst.getString("bid"),
                    rst.getString("courseid"),
                    rst.getString("batch"),
                    rst.getString("startDate"),
                    rst.getString("BatchState"),
                    rst.getString("DiscountsForFullPayments"),
                    rst.getString("fee"));
            return result;
        } else {
            return null;
        }
    }

    @Override
    public ArrayList<BatchDTO> SearchAll1(String id) throws Exception {
        String SQL = "Select * from batch where courseid='" + id + "'";
        Statement sta = connection.createStatement();
        ResultSet rst = sta.executeQuery(SQL);
        ArrayList<BatchDTO> itemList = new ArrayList<>();
        while (rst.next()) {
            BatchDTO c1 = new BatchDTO(
                    rst.getString("bid"),
                    rst.getString("courseid"),
                    rst.getString("batch"),
                    rst.getString("startDate"),
                    rst.getString("BatchState"),
                    rst.getString("DiscountsForFullPayments"),
                    rst.getString("fee"));
            itemList.add(c1);
        }
        return itemList;
    }
        @Override
    public BatchDTO SearchAllandsort2(String dto) throws Exception {
        Statement stm = connection.createStatement();
        String sql = "Select * from batch where batch='" + dto + "'";
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            BatchDTO result = new BatchDTO(
                    rst.getString("bid"),
                    rst.getString("courseid"),
                    rst.getString("batch"),
                    rst.getString("startDate"),
                    rst.getString("BatchState"),
                    rst.getString("DiscountsForFullPayments"),
                    rst.getString("fee"));
            return result;
        } else {
            return null;
        }
    }

}
