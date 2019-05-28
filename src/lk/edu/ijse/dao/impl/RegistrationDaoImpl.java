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
import lk.edu.ijse.dto.BatchTransferDTO;
import lk.edu.ijse.dto.CourseDTO;
import lk.edu.ijse.dto.RegistrationDTO;
import lk.edu.ijse.dto.StudentDTO;

/**
 *
 * @author epc
 */
public class RegistrationDaoImpl implements RegistrationDao {

    private Connection connection;

    public RegistrationDaoImpl() {
        connection = DBConnection.getDBConnection().getConnection();
    }

    @Override
    public boolean add(RegistrationDTO dto) throws Exception {
        String SQL = "INSERT INTO registration VALUES (?,?,?,?,?)";
        PreparedStatement stm = connection.prepareStatement(SQL);

        stm.setObject(1, dto.getRid());
        stm.setObject(2, dto.getStudentid());
        stm.setObject(3, dto.getBatchid());
        stm.setObject(4, dto.getRegFee());
        stm.setObject(5, dto.getRegDate());
        int res = stm.executeUpdate();
        return res > 0;
    }

    @Override
    public boolean delete(String dto) throws Exception {
        Statement stm = connection.createStatement();
        String sql = "delete from registration where rid='" + dto + "'";
        int res = stm.executeUpdate(sql);
        return res > 0;
    }

    @Override
    public boolean Update(RegistrationDTO dto) throws Exception {
        System.out.println(dto.getRid());
        Statement stm = connection.createStatement();

        String sql = "update registration set studentid='" + dto.getStudentid() + "',batchid='" + dto.getBatchid()+ "',RegFee='" + dto.getRegFee() + "',Regdate='" + dto.getRegDate() + "' where rid='" + dto.getRid() + "'";
        int res = stm.executeUpdate(sql);
        return res > 0;
    }

    @Override
    public RegistrationDTO Search(String dto) throws Exception {
        Statement stm = connection.createStatement();
        String sql = "Select * from registration where rid='" + dto + "'";
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            RegistrationDTO result = new RegistrationDTO(
                    rst.getString("rid"),
                    rst.getString("studentid"),
                    rst.getString("batchid"),
                    rst.getString("RegFee"),
                    rst.getString("Regdate"));
            return result;
        } else {
            return null;
        }
    }

    @Override
    public ArrayList<RegistrationDTO> SearchAll() throws Exception {
        String SQL = "Select * From registration";
        Statement sta = connection.createStatement();
        ResultSet rst = sta.executeQuery(SQL);
        ArrayList<RegistrationDTO> itemList = new ArrayList<>();
        while (rst.next()) {
            RegistrationDTO c1 = new RegistrationDTO(
                    rst.getString("rid"),
                    rst.getString("studentid"),
                    rst.getString("batchid"),
                    rst.getString("RegFee"),
                    rst.getString("Regdate"));
            itemList.add(c1);
        }
        return itemList;
    }

    @Override
    public RegistrationDTO SearchAllAndShort(String dto) throws Exception {
        Statement stm = connection.createStatement();
        String sql = "Select * from registration where rid='" + dto + "'";
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            RegistrationDTO result = new RegistrationDTO(
                    rst.getString("rid"),
                    rst.getString("studentid"),
                    rst.getString("batchid"),
                    rst.getString("RegFee"),
                    rst.getString("Regdate"));
            return result;
        } else {
            return null;
        }

    }

    @Override
    public boolean saveStudent(StudentDTO studentDTO, RegistrationDTO registrationDTO) throws Exception {

        Statement sta = connection.createStatement();
        String sql = "insert into Student values('" + studentDTO.getSid() + "','" + studentDTO.getNic() + "','" + studentDTO.getNameWithInitial() + "','" + studentDTO.getFullname() + "','" + studentDTO.getAddress() + "','" + studentDTO.getTel() + "','" + studentDTO.getSchool() + "','" + studentDTO.getDob() + "','" + studentDTO.getGender() + "','" + studentDTO.getEducationState() + "')";
        connection.setAutoCommit(false);
        int x = sta.executeUpdate(sql);
        if (x > 0) {
            String sql2 = "insert into registration values('" + registrationDTO.getRid() + "','" + registrationDTO.getStudentid() + "','" + registrationDTO.getBatchid() + "','" + registrationDTO.getRegFee() + "','" + registrationDTO.getRegDate() + "' )";
            int y = sta.executeUpdate(sql2);
            if (y > 0) {

                connection.commit();
                connection.setAutoCommit(true);
                return true;

            }
            connection.rollback();
            return false;
        }
        connection.rollback();
        return false;

    }

    @Override
    public ArrayList<RegistrationDTO> SearchAllAndSort1(String dto) throws Exception {
        String SQL = "Select * from registration where studentid='" + dto + "'";
        Statement sta = connection.createStatement();
        ResultSet rst = sta.executeQuery(SQL);
        ArrayList<RegistrationDTO> itemList = new ArrayList<>();
        while (rst.next()) {
            RegistrationDTO c1 = new RegistrationDTO(
                    rst.getString("rid"),
                    rst.getString("studentid"),
                    rst.getString("batchid"),
                    rst.getString("RegFee"),
                    rst.getString("Regdate"));
            itemList.add(c1);
        }
        return itemList;
    }

    @Override
    public ArrayList<RegistrationDTO> SearchAllAndSort2(String dto) throws Exception {
        String SQL = "Select * from registration where batchid='" + dto + "'";
        Statement sta = connection.createStatement();
        ResultSet rst = sta.executeQuery(SQL);
        ArrayList<RegistrationDTO> itemList = new ArrayList<>();
        while (rst.next()) {
            RegistrationDTO c1 = new RegistrationDTO(
                    rst.getString("rid"),
                    rst.getString("studentid"),
                    rst.getString("batchid"),
                    rst.getString("RegFee"),
                    rst.getString("Regdate"));
            itemList.add(c1);
        }
        return itemList;
    }

    @Override
    public ArrayList<RegistrationDTO> SearchAllAndSort3() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
