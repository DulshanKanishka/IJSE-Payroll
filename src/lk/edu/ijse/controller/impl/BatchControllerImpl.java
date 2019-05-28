/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.controller.impl;

import java.util.ArrayList;
import lk.edu.ijse.controller.custom.*;
import lk.edu.ijse.dto.BatchDTO;
import lk.edu.ijse.service.ServiceFactory;
import lk.edu.ijse.service.custom.BatchService;

/**
 *
 * @author epc
 */
public class BatchControllerImpl implements BatchController{
  private BatchService batchService;

    public BatchControllerImpl() {
      batchService=(BatchService) ServiceFactory.getIntense().getServices(ServiceFactory.getServicesType.BATCH);
    }
    
    @Override
    public boolean add(BatchDTO dto) throws Exception {
        return batchService.add(dto);
    }

    @Override
    public boolean delete(String dto) throws Exception {
       return batchService.delete(dto);
    }

    @Override
    public boolean Update(BatchDTO dto) throws Exception {
        return batchService.Update(dto);
    }

    @Override
    public BatchDTO Search(String dto) throws Exception {
        return batchService.Search(dto);
    }

    @Override
    public ArrayList<BatchDTO> SearchAll() throws Exception {
        return batchService.SearchAll();
    }

    @Override
    public BatchDTO SearchAllAndShort(String dto) throws Exception {
        return batchService.SearchAllAndShort(dto);
    }

    @Override
    public ArrayList<BatchDTO> SearchAll1(String id) throws Exception {
        return batchService.SearchAll1(id);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BatchDTO SearchAllandsort2(String dto) throws Exception {
        return batchService.SearchAllandsort2(dto);
    }



 
    
}
