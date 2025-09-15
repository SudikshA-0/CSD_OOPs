package Exception;

import java.io.FileInputStream;

public class Exception1 {
    public static void main(String[] args) {
try{
        FileInputStream fs = new FileInputStream("C:/Users/Admin/Documents/OOps_cllg");}
catch(Exception e){
    System.out.println(e);
        }
        System.out.println("helo");
        System.out.println("hi");
        System.out.println("hyfiwyeh");
        System.out.println("shy bye");
        System.out.println("go go");
        System.out.println("what what");
        System.out.println("11111");
        String CSD = null;
        System.out.println(CSD.length());
        try{
            System.out.println(200/0);
        } catch (Exception  e) {
            //System.out.println(e.getMessage());
           // System.out.println(e.toString());
           e.printStackTrace();



        }
        System.out.println("BBye!!");
    }
}
//obj created by main method (exception,description, stack trace) , then jvm  pass it to default exception handler