/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khp.pba.testhandin3;

/**
 *
 * @author Kasper
 */
public class NumDaysInMonth {
    
    public int getNumDaysinMonth(int month, int year){
        boolean isLeapYear = false;
        boolean invalid = false;
        int result = 0;
        if(month > 12 || month < 1){
            System.out.println("Invalid month. Must be between 1 and 12");
            invalid = true;
        }
        if(year < 0 && year < (2^31-1)){
            System.out.println("Invalid year. Must be greater than or equal to 0");
            invalid = true;
        }
        if(year % 4 == 0){
            if((year % 100 == 0) && !(year % 400 == 0)){
                isLeapYear = false;
            }
            else{
                isLeapYear = true;
            }
        }
        switch(month){
            case 1: result = 31;
                    break;
            case 2: 
                if(isLeapYear){
                result = 29;
                }
                else{
                result = 28;
                }
                break;
            case 3: result = 31;
                    break;
            case 4: result = 30;
                    break;
            case 5: result = 31;
                    break;
            case 6: result = 30;
                    break;
            case 7: result = 31;
                    break;
            case 8: result = 31;
                    break;
            case 9: result = 30;
                    break;
            case 10: result = 31;
                    break;
            case 11: result = 30;
                    break;
            case 12: result = 31;
                    break;
                
        }
        if(invalid)
            result = 0;
        return result;
    }
}
