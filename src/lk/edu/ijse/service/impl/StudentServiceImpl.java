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
import lk.edu.ijse.dto.StudentDTO;

/**
 *
 * @author epc
 */
public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;

    public StudentServiceImpl() {
        studentDao = (StudentDao) DaoFactory.getIntense().getServices(DaoFactory.getServicesType.STUDENT);
    }

    @Override
    public boolean add(StudentDTO dto) throws Exception {
        return studentDao.add(dto);
    }

    @Override
    public boolean delete(String dto) throws Exception {

        return studentDao.delete(dto);
    }

    @Override
    public boolean Update(StudentDTO dto) throws Exception {

        return studentDao.Update(dto);
    }

    @Override
    public StudentDTO Search(String dto) throws Exception {

        return studentDao.Search(dto);
    }

    @Override
    public ArrayList<StudentDTO> SearchAll() throws Exception {

        return studentDao.SearchAll();
    }

    @Override
    public StudentDTO SearchAllAndShort(String dto) throws Exception {
                return studentDao.SearchAllAndShort(dto);
    }



}
