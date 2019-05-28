package lk.edu.ijse.utill;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author epc
 */
public class validatio {
    public static boolean setTelNumber(String telNumber) throws Exception {
        if(telNumber.matches(("\\d{3}-\\d{7}"))){
            return true;
        }else{
            return false;
        }
    }
    public static boolean setNIc(String nic) throws Exception {
        if(nic.matches(("^[0-9]{9}[vVxX]$"))){
            return true;
        }else{
            return false;
        }
    }
}
