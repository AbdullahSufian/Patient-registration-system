/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abdallahphysiotherapyclinic;

import java.util.Calendar;

//enum DayOfWeek {
//    SUNDAY, MONDAY, TUESDAY, WEDNSEDAY, THURSDAY, FRIDAY, SATURDAY
//
//}

/**
 *
 * @author Abdula Sofian
 */
class Appointment {

    private int day;
    private int month;
    private int year;

    public Appointment() {
        this.day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        this.month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        this.year = Calendar.getInstance().get(Calendar.YEAR);

    }

    public Appointment(int day, int month, int year) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day > 0 && day <= 31) {
                    this.day = day;
                } else {
                    this.day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day > 0 && day <= 30) {
                    this.day = day;
                } else {
                    this.day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
                }
                break;
            case 2:
                if (year % 4 == 0) {
                    if (day > 0 && day <= 29) {
                        this.day = day;
                    } else {
                        this.day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
                    }
                } else if (year != 4) {
                    if (day > 0 && day <= 28) {
                        this.day = day;
                    } else {
                        this.day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
                    }
                }
                break;
            default:
                this.day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            this.month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= Calendar.getInstance().get(Calendar.YEAR) && year < Calendar.getInstance().get(Calendar.YEAR) + 5) {
            this.year = year;
        } else {
            this.year = Calendar.getInstance().get(Calendar.YEAR);
        }

    }
    

    public String getFormattedDate() {
        return String.format("%02d/%02d/%04d", day, month, year) + ":" ;//+ getDayOfWeek();

    }

    public String getDate() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }

    public String toString() {
        return ("Day :" + day
                + "\nMonth :" + month
                + "\nYear :" + year
                );
    }
}
