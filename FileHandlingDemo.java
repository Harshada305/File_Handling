package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileHandlingDemo {
   public FileHandlingDemo() {
   }

   public static void main(String[] args) {
      File myFile = new File("mydata.txt");

      try {
         myFile.createNewFile();
         System.out.println("File Craeted Succesfully...");
      } catch (IOException var3) {
         var3.printStackTrace();
      }

   }
}
