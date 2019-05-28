/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.controller.impl;

import java.util.ArrayList;
import lk.edu.ijse.controller.custom.*;
import lk.edu.ijse.dto.PaymentDTO;
import lk.edu.ijse.service.ServiceFactory;
import lk.edu.ijse.service.custom.BatchTransferService;
import lk.edu.ijse.service.custom.PaymentService;

/**
 *
 * @author epc
 */
public class PaymentControllerImpl implements PaymentController {

    private PaymentService paymentService;

    public PaymentControllerImpl() {
        paymentService = (PaymentService) ServiceFactory.getIntense().getServices(ServiceFactory.getServicesType.PAYMENT);
    }

    @Override
    public boolean add(PaymentDTO dto) throws Exception {
        return paymentService.add(dto);
    }

    @Override
    public boolean delete(String dto) throws Exception {
        return paymentService.delete(dto);
    }

    @Override
    public boolean Update(PaymentDTO dto) throws Exception {
        return paymentService.Update(dto);
    }

    @Override
    public PaymentDTO Search(String dto) throws Exception {
        return paymentService.Search(dto);
    }

    @Override
    public ArrayList<PaymentDTO> SearchAll() throws Exception {
        return paymentService.SearchAll();
    }

    @Override
    public PaymentDTO SearchAllAndShort(String dto) throws Exception {
                return paymentService.SearchAllAndShort(dto);
    }

    @Override
    public ArrayList<PaymentDTO> SearchAllAndShort1(String dto) throws Exception {
       return paymentService.SearchAllAndShort1(dto);
    }



}
