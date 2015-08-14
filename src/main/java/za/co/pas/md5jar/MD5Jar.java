/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.pas.md5jar;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author Andre Labuschagne
 */
public class MD5Jar {
    public static final String VER = "0.0.0"; 
    
    public static void main(String[] args) {
        if(args.length == 0) {
            StaticOut.PrintUsage();
            System.exit(-1);
        }
        try(FileInputStream fis = new FileInputStream(new File(args[0]));){
            String md5 = DigestUtils.md5Hex(fis);
            
            StaticOut.PrintStart();
            System.out.println("\tMD5:  " + md5.toUpperCase());
            
        } catch(IOException e) {
            System.err.println(e.getMessage());
        }
    }
    
}
