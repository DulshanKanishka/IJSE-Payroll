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
import lk.edu.ijse.dao.custom.DailyCollectionDao;
import lk.edu.ijse.db.DBConnection;
import lk.edu.ijse.dto.DailycollectionDTO;

/**
 *
 * @author epc
 */
public class DailyCollectionDaoImpl implements DailyCollectionDao {

         private Connection connection;

    public DailyCollectionDaoImpl() {
        connection = DBConnection.getDBConnection().getConnection();
    }
    
    @Override
    public boolean add(DailycollectionDTO dto) throws Exception {
                String SQL = "INSERT INTO DailyCollection VALUES (?,?,?,?,?)";
        PreparedStatement stm = connection.prepareStatement(SQL);

        stm.setObject(1, dto.getAutoid());
        stm.setObject(2, dto.getStatee());
        stm.setObject(3, dto.getBatchhh());
        stm.setObject(4, dto.getDateee());
        stm.setObject(5, dto.getPayyy());

        int res = stm.executeUpdate();
        return res > 0;
    }

    @Override
    public boolean delete(String dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Update(DailycollectionDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DailycollectionDTO Search(String dto) throws Exception {
                Statement stm = connection.createStatement();
        String sql = "Select * from DailyCollection where statee='" + dto + "'";
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            DailycollectionDTO result = new DailycollectionDTO(
                    rst.getInt("autoid"),
                    rst.getString("statee"),
                    rst.getString("batchhh"),
                    rst.getString("dateee"),
                    rst.getString("payyy"));
            return result;

        } else {

            return null;
        }
    }

    @Override
    public ArrayList<DailycollectionDTO> SearchAll() throws Exception {
                String SQL = "Select * From DailyCollection";
        Statement sta = connection.createStatement();
        ResultSet rst = sta.executeQuery(SQL);
        ArrayList<DailycollectionDTO> itemList = new ArrayList<>();
        while (rst.next()) {
            DailycollectionDTO c1 = new DailycollectionDTO(
                    rst.getInt("autoid"),
                    rst.getString("statee"),
                    rst.getString("batchhh"),
                    rst.getString("dateee"),
                    rst.getString("payyy"));
            itemList.add(c1);
        }
        return itemList;
    }

    @Override
    public DailycollectionDTO SearchAllAndShort(String dto) throws Exception {
                        Statement stm = connection.createStatement();
        String sql = "Select * from DailyCollection where batchhh='" + dto + "'";
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            DailycollectionDTO result = new DailycollectionDTO(
                    rst.getInt("autoid"),
                    rst.getString("statee"),
                    rst.getString("batchhh"),
                    rst.getString("dateee"),
                    rst.getString("payyy"));
            return result;

        } else {

            return null;
        }
    }

}
