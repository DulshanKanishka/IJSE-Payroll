/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.dao;

import lk.edu.ijse.controller.impl.BatchControllerImpl;
import lk.edu.ijse.controller.impl.CourseControllerImpl;
import lk.edu.ijse.controller.impl.PaymentControllerImpl;
import lk.edu.ijse.controller.impl.RegistrationControllerImpl;
import lk.edu.ijse.controller.impl.StudentControllerImpl;
import lk.edu.ijse.dao.impl.BatchDaoImpl;
import lk.edu.ijse.dao.impl.BatchTransferDaoImpl;
import lk.edu.ijse.dao.impl.CourseDaoImpl;
import lk.edu.ijse.dao.impl.DailyCollectionDaoImpl;
import lk.edu.ijse.dao.impl.PaymentDaoImpl;
import lk.edu.ijse.dao.impl.RegistrationDaoImpl;
import lk.edu.ijse.dao.impl.StudentDaoImpl;

/**
 *
 * @author epc
 */
public class DaoFactory {

    private static DaoFactory daoFactory;

    public enum getServicesType {
        BATCH, COURSE, PAYMENT, REGISTRATION, STUDENT, BATCHTRANSFER,DAILYCOLLECTION
    }

    public static DaoFactory getIntense() {
        if (daoFactory == null) {
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }

    public SuperDao getServices(getServicesType type) {
        switch (type) {
            case BATCH:
                return new BatchDaoImpl();
            case COURSE:
                return new CourseDaoImpl();
            case PAYMENT:
                return new PaymentDaoImpl();
            case REGISTRATION:
                return new RegistrationDaoImpl();
            case STUDENT:
                return new StudentDaoImpl();
            case BATCHTRANSFER:
                return new BatchTransferDaoImpl();
            case DAILYCOLLECTION:
                return new DailyCollectionDaoImpl();
            default:
                return null;
        }
    }
}
