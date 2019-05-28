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
import lk.edu.ijse.dao.custom.BatchTransferDao;
import lk.edu.ijse.db.DBConnection;
import lk.edu.ijse.dto.BatchTransferDTO;

/**
 *
 * @author epc
 */
public class BatchTransferDaoImpl implements BatchTransferDao {

    private Connection connection;

    public BatchTransferDaoImpl() {
        connection = DBConnection.getDBConnection().getConnection();
    }

    @Override
    public boolean add(BatchTransferDTO dto) throws Exception {
        String SQL = "INSERT INTO BatchTransferring VALUES (?,?,?,?,?)";
        PreparedStatement stm = connection.prepareStatement(SQL);

        stm.setObject(1, dto.getbTID());
        stm.setObject(2, dto.getRegistrationId());
        stm.setObject(3, dto.getFromBatch());
        stm.setObject(4, dto.getToBatch());
        stm.setObject(5, dto.getBtFee());
        int res = stm.executeUpdate();
        return res > 0;
    }

    @Override
    public boolean delete(String dto) throws Exception {
        Statement stm = connection.createStatement();
        String sql = "delete from BatchTransferring where BTID='" + dto + "'";
        int res = stm.executeUpdate(sql);
        return res > 0;
    }

    @Override
    public boolean Update(BatchTransferDTO dto) throws Exception {
        System.out.println(dto.getbTID());
        Statement stm = connection.createStatement();

        String sql = "update BatchTransferring set RegistrationID='" + dto.getRegistrationId() + "',FromBatch='" + dto.getFromBatch() + "',ToBatch='" + dto.getToBatch() + "',BTFee='" + dto.getBtFee() + "' where BTID='" + dto.getbTID() + "'";
        int res = stm.executeUpdate(sql);
        return res > 0;
    }

    @Override
    public BatchTransferDTO Search(String dto) throws Exception {
        Statement stm = connection.createStatement();
        String sql = "Select * from BatchTransferring where BTID='" + dto + "'";
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            BatchTransferDTO result = new BatchTransferDTO(
                    rst.getString("BTID"),
                    rst.getString("RegistrationID"),
                    rst.getString("FromBatch"),
                    rst.getString("ToBatch"),
                    rst.getString("BTFee"));
            return result;
        } else {
            return null;
        }
    }

    @Override
    public ArrayList<BatchTransferDTO> SearchAll() throws Exception {
        String SQL = "Select * From BatchTransferring";
        Statement sta = connection.createStatement();
        ResultSet rst = sta.executeQuery(SQL);
        ArrayList<BatchTransferDTO> itemList = new ArrayList<>();
        while (rst.next()) {
            BatchTransferDTO c1 = new BatchTransferDTO(
                    rst.getString("BTID"),
                    rst.getString("RegistrationID"),
                    rst.getString("FromBatch"),
                    rst.getString("ToBatch"),
                    rst.getString("BTFee"));
            itemList.add(c1);
        }
        return itemList;
    }

    @Override
    public BatchTransferDTO SearchAllAndShort(String dto) throws Exception {
        
          Statement stm = connection.createStatement();
        String sql = "Select * from BatchTransferring where RegistrationID='" + dto + "'";
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            BatchTransferDTO result = new BatchTransferDTO(
                    rst.getString("BTID"),
                    rst.getString("RegistrationID"),
                    rst.getString("FromBatch"),
                    rst.getString("ToBatch"),
                    rst.getString("BTFee"));
            return result;
        } else {
            return null;
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
