package Day7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filee {
    public static void main(String[] args) {
        try(BufferedWriter wr = new BufferedWriter(new FileWriter("essay.txt"))){
            wr.write("First line"); wr.newLine();
            wr.write("Second line"); wr.newLine();
            wr.write("Third line"); wr.newLine();
            wr.write("Forth line"); wr.newLine();
        }catch(IOException e){
            System.out.println(e.getMessage());
            return;
        }

        int totalLines = 0;
        int totalWords = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("essay.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                totalLines++;
                String[] words = line.trim().split("\\s+");
                if (!line.isEmpty()) {
                    totalWords += words.length;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading from essay.txt: " + e.getMessage());
            return;
        }

         try (BufferedWriter writer = new BufferedWriter(new FileWriter("report.txt"))) {
            writer.write("Total number of lines: " + totalLines + "\n");
            writer.write("Total number of words: " + totalWords + "\n");
        } catch (IOException e) {
            System.out.println("Error writing to report.txt: " + e.getMessage());
            return;
        }

        System.out.println("Report generated successfully.");
    }
}
