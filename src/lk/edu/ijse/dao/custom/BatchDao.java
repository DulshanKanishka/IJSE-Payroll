/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.dao.custom;

import java.util.ArrayList;
import lk.edu.ijse.controller.custom.*;
import lk.edu.ijse.dao.SuperDao;
import lk.edu.ijse.dto.BatchDTO;
import lk.edu.ijse.dto.SuperDTO;

/**
 *
 * @author epc
 */
public interface BatchDao extends SuperDao<BatchDTO>{
        public ArrayList<BatchDTO> SearchAll1(String id) throws Exception; 
        public BatchDTO SearchAllandsort2(String dto) throws Exception ;
}
