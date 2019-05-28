/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.controller.impl;

import java.util.ArrayList;
import lk.edu.ijse.controller.custom.*;
import lk.edu.ijse.dto.CourseDTO;
import lk.edu.ijse.service.ServiceFactory;
import lk.edu.ijse.service.custom.CourseService;

/**
 *
 * @author epc
 */
public class CourseControllerImpl implements CourseController {
    

    private CourseService courseService;

    public CourseControllerImpl() {
        courseService = (CourseService) ServiceFactory.getIntense().getServices(ServiceFactory.getServicesType.COURSE);
    }

    @Override
    public boolean add(CourseDTO dto) throws Exception {
        return courseService.add(dto);
    }

    @Override
    public boolean delete(String dto) throws Exception {
        return courseService.delete(dto);
    }

    @Override
    public boolean Update(CourseDTO dto) throws Exception {
        return courseService.Update(dto);
    }

    @Override
    public CourseDTO Search(String dto) throws Exception {
        return courseService.Search(dto);
    }

    @Override
    public ArrayList<CourseDTO> SearchAll() throws Exception {
        return courseService.SearchAll();
    }

    @Override
    public CourseDTO SearchAllAndShort(String dto) throws Exception {
            return courseService.SearchAllAndShort(dto);
    }


}
