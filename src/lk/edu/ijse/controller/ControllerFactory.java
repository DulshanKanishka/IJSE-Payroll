/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.controller;

import lk.edu.ijse.controller.impl.BatchControllerImpl;
import lk.edu.ijse.controller.impl.BatchTransferControllerImpl;
import lk.edu.ijse.controller.impl.CourseControllerImpl;
import lk.edu.ijse.controller.impl.DailyCollectionControllerImpl;
import lk.edu.ijse.controller.impl.PaymentControllerImpl;
import lk.edu.ijse.controller.impl.RegistrationControllerImpl;
import lk.edu.ijse.controller.impl.StudentControllerImpl;

/**
 *
 * @author epc
 */
public class ControllerFactory {

    private static ControllerFactory controllerFactory;

    public enum getServicesType {
        BATCH, COURSE, PAYMENT, REGISTRATION, STUDENT ,BATCHTRANSFER,DAILYCOLLECTION
    }

    public static ControllerFactory getIntense() {
        if (controllerFactory == null) {
            controllerFactory = new ControllerFactory();
        }
        return controllerFactory;
    }

    public SuperController getServices(getServicesType type) {
        switch (type) {
            case BATCH:
                return new BatchControllerImpl();
            case COURSE:
                return new CourseControllerImpl();
            case PAYMENT:
                return new PaymentControllerImpl();
            case REGISTRATION:
                return new RegistrationControllerImpl();
            case STUDENT:
                return new StudentControllerImpl();
            case BATCHTRANSFER:
                return new BatchTransferControllerImpl();
            case DAILYCOLLECTION:
                return new DailyCollectionControllerImpl();
            default:
                return null;
        }
    }
}
