/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Switch;

/**
 *
 * @author YNZ
 */
public class CaseSeq {

    public CaseSeq() {
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char b = 'b'; //-128 to 127
        switch(b){
            case 'b':
            case 'c':System.out.println("c");
            default:System.out.println("default");
            case 2:
            case 80:
        }
        
        System.out.println("end");
        char c = 200; 
        int d =400;
        c = (char) d;
        d = c;
        
        int $_$ = 0;

        
    }
    
}