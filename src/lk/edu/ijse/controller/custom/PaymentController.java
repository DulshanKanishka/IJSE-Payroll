/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.controller.custom;

import java.util.ArrayList;
import lk.edu.ijse.controller.SuperController;
import lk.edu.ijse.dto.BatchDTO;
import lk.edu.ijse.dto.PaymentDTO;

/**
 *
 * @author epc
 */
public interface PaymentController extends SuperController<PaymentDTO> {
       public ArrayList<PaymentDTO> SearchAllAndShort1(String dto) throws Exception;
}
