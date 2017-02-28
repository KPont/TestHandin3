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
public class DecisionTable {
    
    public double Reimbursement(boolean deduct, String visit){
       double result = 0.0;
       if(deduct){
           if(visit.equals("D")){
               result = 0.5;
           }
           else if(visit.equals("H")){
               result = 0.8;
           }
       }
       return result;
    }
}
