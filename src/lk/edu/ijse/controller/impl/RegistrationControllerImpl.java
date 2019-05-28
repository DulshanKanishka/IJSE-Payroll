/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.controller.impl;

import java.util.ArrayList;
import lk.edu.ijse.controller.custom.*;
import lk.edu.ijse.dto.BatchTransferDTO;
import lk.edu.ijse.dto.RegistrationDTO;
import lk.edu.ijse.dto.StudentDTO;
import lk.edu.ijse.service.ServiceFactory;
import lk.edu.ijse.service.custom.PaymentService;
import lk.edu.ijse.service.custom.RegistrationService;

/**
 *
 * @author epc
 */
public class RegistrationControllerImpl implements RegistrationController {

    private RegistrationService registrationService;

    public RegistrationControllerImpl() {
        registrationService = (RegistrationService) ServiceFactory.getIntense().getServices(ServiceFactory.getServicesType.REGISTRATION);
    }

    @Override
    public boolean add(RegistrationDTO dto) throws Exception {
        return registrationService.add(dto);
    }

    @Override
    public boolean delete(String dto) throws Exception {
        return registrationService.delete(dto);
    }

    @Override
    public boolean Update(RegistrationDTO dto) throws Exception {
        return registrationService.Update(dto);
    }

    @Override
    public RegistrationDTO Search(String dto) throws Exception {
        return registrationService.Search(dto);
    }

    @Override
    public ArrayList<RegistrationDTO> SearchAll() throws Exception {
        return registrationService.SearchAll();
    }

    @Override
    public RegistrationDTO SearchAllAndShort(String dto) throws Exception {
                return registrationService.SearchAllAndShort(dto);
    }

    @Override
    public boolean saveStudent(StudentDTO studentDTO, RegistrationDTO registrationDTO) throws Exception {
        return registrationService.saveStudent(studentDTO, registrationDTO);
    }

    @Override
    public ArrayList<RegistrationDTO> SearchAllAndSort1(String dto) throws Exception {
        return registrationService.SearchAllAndSort1(dto);
    }

    @Override
    public ArrayList<RegistrationDTO> SearchAllAndSort2(String dto) throws Exception {
        return registrationService.SearchAllAndSort2(dto);
    }

    @Override
    public ArrayList<RegistrationDTO> SearchAllAndSort3() throws Exception {
        return registrationService.SearchAllAndSort3();
    }


}
