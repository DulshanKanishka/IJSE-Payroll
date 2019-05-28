/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.service.impl;

import java.util.ArrayList;
import lk.edu.ijse.service.custom.*;
import lk.edu.ijse.dao.custom.*;
import lk.edu.ijse.controller.custom.*;
import lk.edu.ijse.dao.DaoFactory;
import lk.edu.ijse.dto.BatchDTO;

/**
 *
 * @author epc
 */
public class BatchServiceImpl implements BatchService {
    private BatchDao batchDao;

    public BatchServiceImpl() {
        batchDao = (BatchDao) DaoFactory.getIntense().getServices(DaoFactory.getServicesType.BATCH);
    }

    @Override
    public boolean add(BatchDTO dto) throws Exception {
        return batchDao.add(dto);
    }

    @Override
    public boolean delete(String dto) throws Exception {
        return batchDao.delete(dto);
    }

    @Override
    public boolean Update(BatchDTO dto) throws Exception {
        return batchDao.Update(dto);
    }

    @Override
    public BatchDTO Search(String dto) throws Exception {
        return batchDao.Search(dto);
    }

    @Override
    public ArrayList<BatchDTO> SearchAll() throws Exception {
        return batchDao.SearchAll();
    }

    @Override
    public BatchDTO SearchAllAndShort(String dto) throws Exception {
       return batchDao.SearchAllAndShort(dto);
    }

    @Override
    public ArrayList<BatchDTO> SearchAll1(String id) throws Exception {
        return  batchDao.SearchAll1(id);
    }

    @Override
    public BatchDTO SearchAllandsort2(String dto) throws Exception {
        return batchDao.SearchAllandsort2(dto);
    }

}
