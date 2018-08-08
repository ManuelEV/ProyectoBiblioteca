/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author jorge
 */
public class Utility {
    public Utility(){}
    public Date retrieveDate(String fechaDeNacimiento) {
        String[] fecha = fechaDeNacimiento.split("-");
        int year = Integer.parseInt(fecha[0]);
        int month = Integer.parseInt(fecha[1]);
        int day = Integer.parseInt(fecha[2]);

        Date fechaDate =new Date(this.dateToMilis(year, month, day));
        return fechaDate;
    }

    public static long dateToMilis(int year, int month, int date) {
        GregorianCalendar gc = new GregorianCalendar();
        gc.set(year, month, date);
        return gc.getTimeInMillis();
    }
}
