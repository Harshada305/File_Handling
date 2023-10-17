package FileHandling;

import java.io.File;

public class FileTest {
   public FileTest() {
   }

   public static void main(String[] args) {
      File f = new File("info.txt");
      System.out.println(f.exists());
      System.out.println("CanRead:" + f.canRead());
      System.out.println("Length: " + f.length());
      if (!f.exists()) {
         f.mkdir();
      }

   }
}