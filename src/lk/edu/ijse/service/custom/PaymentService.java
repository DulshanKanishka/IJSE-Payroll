/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.service.custom;

import java.util.ArrayList;
import lk.edu.ijse.dao.custom.*;
import lk.edu.ijse.controller.custom.*;
import lk.edu.ijse.dto.CourseDTO;
import lk.edu.ijse.dto.PaymentDTO;
import lk.edu.ijse.service.SuperService;

/**
 *
 * @author epc
 */
public interface PaymentService extends SuperService<PaymentDTO>{
  public ArrayList<PaymentDTO> SearchAllAndShort1(String dto) throws Exception;   
}
