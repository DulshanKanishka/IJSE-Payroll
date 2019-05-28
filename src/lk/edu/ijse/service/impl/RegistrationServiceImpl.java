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
import lk.edu.ijse.dto.BatchTransferDTO;
import lk.edu.ijse.dto.RegistrationDTO;
import lk.edu.ijse.dto.StudentDTO;

/**
 *
 * @author epc
 */
public class RegistrationServiceImpl implements RegistrationService {

    private RegistrationDao registrationDao;

    public RegistrationServiceImpl() {
        registrationDao = (RegistrationDao) DaoFactory.getIntense().getServices(DaoFactory.getServicesType.REGISTRATION);
    }

    @Override
    public boolean add(RegistrationDTO dto) throws Exception {
        return registrationDao.add(dto);
    }

    @Override
    public boolean delete(String dto) throws Exception {
        return registrationDao.delete(dto);
    }

    @Override
    public boolean Update(RegistrationDTO dto) throws Exception {
        return registrationDao.Update(dto);
    }

    @Override
    public RegistrationDTO Search(String dto) throws Exception {
        return registrationDao.Search(dto);
    }

    @Override
    public ArrayList<RegistrationDTO> SearchAll() throws Exception {
        return registrationDao.SearchAll();
    }

    @Override
    public RegistrationDTO SearchAllAndShort(String dto) throws Exception {
                return registrationDao.SearchAllAndShort(dto);
    }

    @Override
    public boolean saveStudent(StudentDTO studentDTO, RegistrationDTO registrationDTO) throws Exception {
        return registrationDao.saveStudent(studentDTO, registrationDTO);
    }

    @Override
    public ArrayList<RegistrationDTO> SearchAllAndSort1(String dto) throws Exception {
        return registrationDao.SearchAllAndSort1(dto);
    }

    @Override
    public ArrayList<RegistrationDTO> SearchAllAndSort2(String dto) throws Exception {
        return registrationDao.SearchAllAndSort2(dto);
    }

    @Override
    public ArrayList<RegistrationDTO> SearchAllAndSort3() throws Exception {
return registrationDao.SearchAllAndSort3();
    }

}
