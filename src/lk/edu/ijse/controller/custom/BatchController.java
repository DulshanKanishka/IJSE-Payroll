/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.controller.custom;

import java.util.ArrayList;
import lk.edu.ijse.controller.SuperController;
import lk.edu.ijse.dto.BatchDTO;

/**
 *
 * @author epc
 */
public interface BatchController extends SuperController<BatchDTO>{
    
        public ArrayList<BatchDTO> SearchAll1(String id) throws Exception;
         
        public BatchDTO SearchAllandsort2(String dto) throws Exception ;
}
