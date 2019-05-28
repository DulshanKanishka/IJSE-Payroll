/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.controller.impl;

import java.util.ArrayList;
import lk.edu.ijse.controller.custom.BatchTransferController;
import lk.edu.ijse.dto.BatchTransferDTO;
import lk.edu.ijse.service.ServiceFactory;
import lk.edu.ijse.service.custom.BatchTransferService;

/**
 *
 * @author epc
 */
public class BatchTransferControllerImpl implements BatchTransferController{
    private BatchTransferService batchTransferService;

    public BatchTransferControllerImpl() {
    batchTransferService = (BatchTransferService) ServiceFactory.getIntense().getServices(ServiceFactory.getServicesType.BATCHTRANSFER);
    }

    @Override
    public boolean add(BatchTransferDTO dto) throws Exception {
      return batchTransferService.add(dto);
    }

    @Override
    public boolean delete(String dto) throws Exception {
      return batchTransferService.delete(dto);
    }

    @Override
    public boolean Update(BatchTransferDTO dto) throws Exception {
  return batchTransferService.Update(dto);
        
    }

    @Override
    public BatchTransferDTO Search(String dto) throws Exception {
        return batchTransferService.Search(dto);
    }

    @Override
    public ArrayList<BatchTransferDTO> SearchAll() throws Exception {
        return batchTransferService.SearchAll();


    }

    @Override
    public BatchTransferDTO SearchAllAndShort(String dto) throws Exception {
                return batchTransferService.SearchAllAndShort(dto);
    }

}
