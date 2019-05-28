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
import lk.edu.ijse.dto.CourseDTO;
import lk.edu.ijse.dto.PaymentDTO;
import lk.edu.ijse.service.SuperService;

/**
 *
 * @author epc
 */
public class PaymentServiceImpl implements PaymentService{
    private PaymentDao paymentDao;

    public PaymentServiceImpl(){
        paymentDao=(PaymentDao) DaoFactory.getIntense().getServices(DaoFactory.getServicesType.PAYMENT);
    }
    
    @Override
    public boolean add(PaymentDTO dto) throws Exception {
      return paymentDao.add(dto);}

    @Override
    public boolean delete(String dto) throws Exception {
          return paymentDao.delete(dto);    }

    @Override
    public boolean Update(PaymentDTO dto) throws Exception {
      return paymentDao.Update(dto);    }

    @Override
    public PaymentDTO Search(String dto) throws Exception {
      return paymentDao.Search(dto);    }

    @Override
    public ArrayList<PaymentDTO> SearchAll() throws Exception {
      return paymentDao.SearchAll();    }

    @Override
    public PaymentDTO SearchAllAndShort(String dto) throws Exception {
        return paymentDao.SearchAllAndShort(dto);
    }

    @Override
    public ArrayList<PaymentDTO> SearchAllAndShort1(String dto) throws Exception {
       return paymentDao.SearchAllAndShort1(dto);
    }

}
