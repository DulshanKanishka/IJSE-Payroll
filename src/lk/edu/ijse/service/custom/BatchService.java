/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.service.custom;

import java.util.ArrayList;
import lk.edu.ijse.dao.custom.*;
import lk.edu.ijse.controller.custom.*;
import lk.edu.ijse.dto.BatchDTO;
import lk.edu.ijse.service.SuperService;

/**
 *
 * @author epc
 */
public interface BatchService extends SuperService<BatchDTO> {
    
        public ArrayList<BatchDTO> SearchAll1(String id) throws Exception;
         
        public BatchDTO SearchAllandsort2(String dto) throws Exception ;
}
