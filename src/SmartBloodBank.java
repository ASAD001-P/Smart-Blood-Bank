import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import javax.swing.SwingUtilities;
public class SmartBloodBank{
     private static final String sbbfile = "sbb.txt";
     public static void main(String[] args){ 
         createfile();
        SwingUtilities.invokeLater(new Runnable() {
     public void run() {
                new HomePage().setVisible(true);}});}

     
     
    private static void createfile() {
         File file = new File(sbbfile);

        try {
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("Blood bank file created successfully!");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the blood bank file: " + e.getMessage());
        }
    }
    
    
}
  
    
    
    
    
    
    
    
    
 
    
    
    
    
