/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.controller.custom;

import java.util.ArrayList;
import lk.edu.ijse.controller.SuperController;
import lk.edu.ijse.dto.BatchDTO;
import lk.edu.ijse.dto.BatchTransferDTO;
import lk.edu.ijse.dto.RegistrationDTO;
import lk.edu.ijse.dto.StudentDTO;

/**
 *
 * @author epc
 */
public interface RegistrationController extends SuperController<RegistrationDTO> {

    public boolean saveStudent(StudentDTO studentDTO, RegistrationDTO registrationDTO) throws Exception;

    public ArrayList<RegistrationDTO> SearchAllAndSort1(String dto) throws Exception;

    public ArrayList<RegistrationDTO> SearchAllAndSort2(String dto) throws Exception;

    public ArrayList<RegistrationDTO> SearchAllAndSort3() throws Exception;
}
