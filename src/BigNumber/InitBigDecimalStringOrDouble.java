/*
 * 
 * how to correctly init. BigDecimal, please using String.  
 * 
 */
package BigNumber;

import java.math.BigDecimal;

/**
 *
 * @author YNZ
 */
public class InitBigDecimalStringOrDouble {
    
    public static void main(String[] args) {
        
        double d = 54.54;
        
        BigDecimal b1 = new BigDecimal(d);
        BigDecimal b2 = new BigDecimal(String.valueOf(d));
        
        System.out.println("Init. by double: " + b1);
        System.out.println("Init. by String: " + b2);
        
    }
    
}
