//Type casting different variables based on requirements.
//Types of variables: 

/*
1. int : Takes only integer values.
2. float: Takes decimal values.
3. double: Takes large decimal values.
4. long: Takes very long integer values.
5. short: Short integer values.
6. byte: Takes values from -128 to +127;
*/

public class Application {
    public static void main(String[] args) {
 
        byte byteValue = 20;
        short shortValue = 55;
        int intValue = 888;
        long longValue = 23355;
         
        float floatValue = 8834.8f;
        float floatValue2 = (float)99.3;
        double doubleValue = 32.4;
         
        System.out.println(Byte.MIN_VALUE); //Maximum value of Byte is 127
        System.out.println(Byte.MAX_VALUE); //Minimum value of Byte is -128
         
        intValue = (int)longValue; // Casting a value of type long to an integer value.
         
        System.out.println(intValue);
         
        doubleValue = intValue; //You can assign an int to a double but not the other way round.
        System.out.println(doubleValue);
         
        intValue = (int)floatValue;
        System.out.println(intValue);
     
        // The following won't work as we expect it to!!
        // The max. value of a byte is 127. So, 128 is too big for a byte.
        
        byteValue = (byte)128;
        System.out.println(byteValue);
    }
}
