/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.controller.impl;

import java.util.ArrayList;
import lk.edu.ijse.controller.custom.DailyCollectionController;
import lk.edu.ijse.dto.DailycollectionDTO;
import lk.edu.ijse.service.ServiceFactory;
import lk.edu.ijse.service.custom.DailyCollectionService;

/**
 *
 * @author epc
 */
public class DailyCollectionControllerImpl implements DailyCollectionController {

    private DailyCollectionService dailyCollectionService;

    public DailyCollectionControllerImpl() {
        dailyCollectionService = (DailyCollectionService) ServiceFactory.getIntense().getServices(ServiceFactory.getServicesType.DAILYCOLLECTION);
    }

    @Override
    public boolean add(DailycollectionDTO dto) throws Exception {
        return dailyCollectionService.add(dto);
    }

    @Override
    public boolean delete(String dto) throws Exception {
        return dailyCollectionService.delete(dto);
    }

    @Override
    public boolean Update(DailycollectionDTO dto) throws Exception {
        return dailyCollectionService.Update(dto);
    }

    @Override
    public DailycollectionDTO Search(String dto) throws Exception {
        return dailyCollectionService.Search(dto);
    }

    @Override
    public ArrayList<DailycollectionDTO> SearchAll() throws Exception {
        return dailyCollectionService.SearchAll();
    }

    @Override
    public DailycollectionDTO SearchAllAndShort(String dto) throws Exception {
        return dailyCollectionService.SearchAllAndShort(dto);
    }

}
