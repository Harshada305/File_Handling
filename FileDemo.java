package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {
   public FileDemo() {
   }

   public static void main(String[] args) throws IOException {
      File myfile = new File("new.txt");

      try {
         myfile.createNewFile();
         System.out.println("File Craeted Succesfully...");
         FileWriter fileWriter = new FileWriter("new.txt");
         fileWriter.write("Some Imp data is Here..");
         Scanner sc = new Scanner(myfile);

         while(sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
         }

         sc.close();
      } catch (FileNotFoundException var5) {
         var5.printStackTrace();
      }

   }
}
