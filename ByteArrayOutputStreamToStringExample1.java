package IO1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;  

public class  ByteArrayOutputStreamToStringExample1 {  
    public static void main(String[] args) throws IOException {  
        byte bs []= { 65, 66, 67, 68, 69 };  
        ByteArrayOutputStream baos = new ByteArrayOutputStream();  
        baos.write(bs); 
       String str= baos.toString();
       System.out.println(str);
//        String str = baos.toString("Cp1047");  
//        System.out.println(str);  
//        str = baos.toString("UTF-8");  //Unicode Transformation Format
//        System.out.println(str);  
//    }  
        
}  }