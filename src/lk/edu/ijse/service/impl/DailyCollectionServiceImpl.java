/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.service.impl;

import java.util.ArrayList;
import lk.edu.ijse.dao.DaoFactory;
import lk.edu.ijse.dao.custom.DailyCollectionDao;
import lk.edu.ijse.dto.DailycollectionDTO;
import lk.edu.ijse.service.custom.DailyCollectionService;

/**
 *
 * @author epc
 */
public class DailyCollectionServiceImpl implements DailyCollectionService{

        private DailyCollectionDao dailyCollectionDao;

    public DailyCollectionServiceImpl() {
        dailyCollectionDao =  (DailyCollectionDao) DaoFactory.getIntense().getServices(DaoFactory.getServicesType.DAILYCOLLECTION);
    }
    
    @Override
    public boolean add(DailycollectionDTO dto) throws Exception {
       return dailyCollectionDao.add(dto);
    }

    @Override
    public boolean delete(String dto) throws Exception {
       return dailyCollectionDao.delete(dto);
    }

    @Override
    public boolean Update(DailycollectionDTO dto) throws Exception {
return dailyCollectionDao.Update(dto);
    }

    @Override
    public DailycollectionDTO Search(String dto) throws Exception {
return dailyCollectionDao.Search(dto);
    }

    @Override
    public ArrayList<DailycollectionDTO> SearchAll() throws Exception {
return dailyCollectionDao.SearchAll();
    }

    @Override
    public DailycollectionDTO SearchAllAndShort(String dto) throws Exception {
return dailyCollectionDao.SearchAllAndShort(dto);
    }
    
}
