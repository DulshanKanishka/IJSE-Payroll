/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.service;

import lk.edu.ijse.controller.impl.BatchControllerImpl;
import lk.edu.ijse.controller.impl.CourseControllerImpl;
import lk.edu.ijse.controller.impl.PaymentControllerImpl;
import lk.edu.ijse.controller.impl.RegistrationControllerImpl;
import lk.edu.ijse.controller.impl.StudentControllerImpl;
import lk.edu.ijse.service.impl.BatchServiceImpl;
import lk.edu.ijse.service.impl.BatchTransferServiceImpl;
import lk.edu.ijse.service.impl.CourseServiceImpl;
import lk.edu.ijse.service.impl.DailyCollectionServiceImpl;
import lk.edu.ijse.service.impl.PaymentServiceImpl;
import lk.edu.ijse.service.impl.RegistrationServiceImpl;
import lk.edu.ijse.service.impl.StudentServiceImpl;

/**
 *
 * @author epc
 */
public class ServiceFactory {

    private static ServiceFactory servicesFactory;

    public enum getServicesType {
        BATCH,COURSE,PAYMENT,REGISTRATION,STUDENT,BATCHTRANSFER,DAILYCOLLECTION

    }

    public static ServiceFactory getIntense() {
        if (servicesFactory == null) {
            servicesFactory = new ServiceFactory();
        }
        return servicesFactory;
    }

    public SuperService getServices(getServicesType type) {
         switch (type) {
            case BATCH:
                return new BatchServiceImpl();
            case COURSE:
                return new CourseServiceImpl();
            case PAYMENT:
                return new PaymentServiceImpl();
            case REGISTRATION:
                return new RegistrationServiceImpl();
            case STUDENT:
                return new StudentServiceImpl();
            case BATCHTRANSFER:
                return new BatchTransferServiceImpl();
            case DAILYCOLLECTION:
                return new DailyCollectionServiceImpl();
            default:
                return null;
        }
    }
}
