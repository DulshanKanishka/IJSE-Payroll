/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.service.impl;

import java.util.ArrayList;
import lk.edu.ijse.dao.DaoFactory;
import lk.edu.ijse.dao.custom.BatchDao;
import lk.edu.ijse.dao.custom.BatchTransferDao;
import lk.edu.ijse.dto.BatchDTO;
import lk.edu.ijse.dto.BatchTransferDTO;
import lk.edu.ijse.service.custom.BatchTransferService;

/**
 *
 * @author epc
 */
public class BatchTransferServiceImpl implements BatchTransferService {

    private BatchTransferDao batchTransferDao;

    public BatchTransferServiceImpl() {
        batchTransferDao = (BatchTransferDao) DaoFactory.getIntense().getServices(DaoFactory.getServicesType.BATCHTRANSFER);
    }

    @Override
    public boolean add(BatchTransferDTO dto) throws Exception {
        return batchTransferDao.add(dto);
    }

    @Override
    public boolean delete(String dto) throws Exception {
        return batchTransferDao.delete(dto);
    }

    @Override
    public boolean Update(BatchTransferDTO dto) throws Exception {
        return batchTransferDao.Update(dto);
    }

    @Override
    public BatchTransferDTO Search(String dto) throws Exception {
        return batchTransferDao.Search(dto);
    }

    @Override
    public ArrayList<BatchTransferDTO> SearchAll() throws Exception {
        return batchTransferDao.SearchAll();
    }

    @Override
    public BatchTransferDTO SearchAllAndShort(String dto) throws Exception {
            return batchTransferDao.SearchAllAndShort(dto);
    }

 

}
