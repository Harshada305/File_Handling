package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileDemo {
   public WriteFileDemo() {
   }

   public static void main(String[] args) {
      try {
         FileWriter fileWriter = new FileWriter("mydata.txt");
         fileWriter.write("Some Imp data is Here..");
         fileWriter.close();
      } catch (IOException var2) {
         var2.printStackTrace();
      }

   }
}