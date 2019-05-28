/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.controller.impl;

import java.util.ArrayList;
import lk.edu.ijse.controller.custom.*;
import lk.edu.ijse.dto.StudentDTO;
import lk.edu.ijse.service.ServiceFactory;
import lk.edu.ijse.service.custom.RegistrationService;
import lk.edu.ijse.service.custom.StudentService;

/**
 *
 * @author epc
 */
 public class StudentControllerImpl implements StudentController {

    private StudentService studentService;

    public StudentControllerImpl() {
        studentService = (StudentService) ServiceFactory.getIntense().getServices(ServiceFactory.getServicesType.STUDENT);
    }

    @Override
    public boolean add(StudentDTO dto) throws Exception {
        return studentService.add(dto);
    }

    @Override
    public boolean delete(String dto) throws Exception {
        return studentService.delete(dto);
    }

    @Override
    public boolean Update(StudentDTO dto) throws Exception {
        return studentService.Update(dto);
    }

    @Override
    public StudentDTO Search(String dto) throws Exception {
        return studentService.Search(dto);
    }

    @Override
    public ArrayList<StudentDTO> SearchAll() throws Exception {
        return studentService.SearchAll();
    }

    @Override
    public StudentDTO SearchAllAndShort(String dto) throws Exception {
               return studentService.SearchAllAndShort(dto);
    }

}
