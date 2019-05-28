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
import lk.edu.ijse.dto.PaymentDTO;

/**
 *
 * @author epc
 */
public class PaymentDaoImpl implements PaymentDao {

    private Connection connection;

    public PaymentDaoImpl() {
        connection = DBConnection.getDBConnection().getConnection();
    }

    @Override
    public boolean add(PaymentDTO dto) throws Exception {
        String SQL = "INSERT INTO payment VALUES (?,?,?,?,?)";
        PreparedStatement stm = connection.prepareStatement(SQL);

        stm.setObject(1, dto.getPid());
        stm.setObject(2, dto.getRegId());
        stm.setObject(3, dto.getPaymentstate());
        stm.setObject(4, dto.getArrears());
        stm.setObject(5, dto.getNextPaymentDate());
        int res = stm.executeUpdate();
        return res > 0;
    }

    @Override
    public boolean delete(String dto) throws Exception {
        Statement stm = connection.createStatement();
        String sql = "delete from payment where pid='" + dto + "'";
        int res = stm.executeUpdate(sql);
        return res > 0;
    }

    @Override
    public boolean Update(PaymentDTO dto) throws Exception {
        System.out.println(dto.getPid());
        Statement stm = connection.createStatement();

        String sql = "update payment set paymentstate='" + dto.getPaymentstate() + "',Arrears='" + dto.getArrears() + "',NextPaymentDate='" + dto.getNextPaymentDate() + "' where pid='" + dto.getPid() + "'";
        int res = stm.executeUpdate(sql);
        return res > 0;
    }

    @Override
    public PaymentDTO Search(String dto) throws Exception {
        Statement stm = connection.createStatement();
        String sql = "Select * from payment where pid='" + dto + "'";
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            PaymentDTO result = new PaymentDTO(
                    rst.getString("pid"),
                    rst.getString("RegistrationID"),
                    rst.getString("paymentstate"),
                    rst.getString("Arrears"),
                    rst.getString("NextPaymentDate"));
            return result;
        } else {
            return null;
        }
    }

    @Override
    public ArrayList<PaymentDTO> SearchAll() throws Exception {
        String SQL = "Select * From payment";
        Statement sta = connection.createStatement();
        ResultSet rst = sta.executeQuery(SQL);
        ArrayList<PaymentDTO> itemList = new ArrayList<>();
        while (rst.next()) {
            PaymentDTO c1 = new PaymentDTO(
                    rst.getString("pid"),
                    rst.getString("RegistrationID"),
                    rst.getString("paymentstate"),
                    rst.getString("Arrears"),
                    rst.getString("NextPaymentDate"));
            itemList.add(c1);
        }
        return itemList;

    }

    @Override
    public PaymentDTO SearchAllAndShort(String dto) throws Exception {
        Statement stm = connection.createStatement();
        String sql = "Select * from payment where RegistrationID='" + dto + "'";
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            PaymentDTO result = new PaymentDTO(
                    rst.getString("pid"),
                    rst.getString("RegistrationID"),
                    rst.getString("paymentstate"),
                    rst.getString("Arrears"),
                    rst.getString("NextPaymentDate"));
            return result;
        } else {
            return null;
        }
    }

    @Override
    public ArrayList<PaymentDTO> SearchAllAndShort1(String rId) throws Exception {
        Statement stm = connection.createStatement();
        String sql = "Select * from payment where RegistrationID='" + rId + "'";
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<PaymentDTO> pList = new ArrayList<>();
        while (rst.next()) {
            PaymentDTO c1 = new PaymentDTO(
                    rst.getString("pid"),
                    rst.getString("RegistrationID"),
                    rst.getString("paymentstate"),
                    rst.getString("Arrears"),
                    rst.getString("NextPaymentDate"));
            pList.add(c1);
        }
        return pList;

    }

}
