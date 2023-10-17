package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileDemo {
   public ReadFileDemo() {
   }

   public static void main(String[] args) {
      File myfile = new File("mydata.txt");

      try {
         Scanner sc = new Scanner(myfile);

         while(sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
         }

         sc.close();
      } catch (FileNotFoundException var4) {
         var4.printStackTrace();
      }

   }
}
