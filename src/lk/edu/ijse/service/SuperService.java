/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.service;

import java.util.ArrayList;
import lk.edu.ijse.dto.SuperDTO;

/**
 *
 * @author epc
 */
public interface SuperService<T extends SuperDTO> {

    public boolean add(T dto) throws Exception;

    public boolean delete(String dto) throws Exception;

    public boolean Update(T dto) throws Exception;

    public T Search(String dto) throws Exception;

    public ArrayList<T> SearchAll() throws Exception;

    public T SearchAllAndShort(String dto) throws Exception;

}
