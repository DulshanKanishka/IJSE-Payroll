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
import lk.edu.ijse.dto.BatchDTO;
import lk.edu.ijse.dto.CourseDTO;
import lk.edu.ijse.service.SuperService;

/**
 *
 * @author epc
 */
public class CourseServiceImpl implements CourseService {

    private CourseDao courseDao;

    public CourseServiceImpl() {
        courseDao = (CourseDao) DaoFactory.getIntense().getServices(DaoFactory.getServicesType.COURSE);
    }

    @Override
    public boolean add(CourseDTO dto) throws Exception {
        return courseDao.add(dto);
    }

    @Override
    public boolean delete(String dto) throws Exception {
        return courseDao.delete(dto);
    }

    @Override
    public boolean Update(CourseDTO dto) throws Exception {
        return courseDao.Update(dto);
    }

    @Override
    public CourseDTO Search(String dto) throws Exception {
        return courseDao.Search(dto);
    }

    @Override
    public ArrayList<CourseDTO> SearchAll() throws Exception {
        return courseDao.SearchAll();
    }

    @Override
    public CourseDTO SearchAllAndShort(String dto) throws Exception {
               return courseDao.SearchAllAndShort(dto);
    }





}
