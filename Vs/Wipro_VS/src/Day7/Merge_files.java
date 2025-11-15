package Day7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Merge_files {
    public static void main(String[] args) {
        try(
            BufferedReader reader1 = new BufferedReader(new FileReader("src/Day8/file1.txt"));
            BufferedReader reader2 = new BufferedReader(new FileReader("src/Day8/file2.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/Day8/merged.txt"));
        ){
         String line1, line2;
           
            while (true) {
            line1 = reader1.readLine();
            line2 = reader2.readLine();
                if (line1 == null && line2 == null) {
                break;
            }
              if (line1 != null) {
                    writer.write(line1);
                    writer.newLine();
                }

                if (line2 != null) {
                    writer.write(line2);
                    writer.newLine();
                }
            System.out.println("Merge Completed Successfully.");
            }

        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
