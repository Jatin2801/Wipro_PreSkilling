package File_hand;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Fh {
    public static void main(String[] args) throws IOException {

        // Writing and creating file
        
        // File file = new File("file.txt");
        // FileWriter fw = new FileWriter(file,true);
        // fw.write("My name is Jatin");
        // fw.flush();
        // fw.close();


        // BufferedWriter
        // File fi = new File("file.txt");
        //     FileWriter fw = new FileWriter(fi, true); // 'true' means append mode
        //     BufferedWriter bw = new BufferedWriter(fw);
        //     bw.write("My name is Jatin");
        //     bw.newLine();
        //     bw.write("I am from MP");
        //     bw.flush();
        //     bw.close();


        // reading from file
        // File file = new File("file.txt");
        // FileReader fr = new FileReader(file);

        // int myChar = -1;
        // while ((myChar = fr.read()) != -1) {
        //     System.out.print((char)myChar);
        // }
        // System.out.println();
        // fr.close();


        // Moving the file
        // Path source = fi.toPath();
        // Path targetDir = Paths.get("src");
        // Path target = targetDir.resolve("file.txt");
        // Files.move(source, target);
        // System.out.println("File moved successfully to: " + target.toAbsolutePath());


        // Rename
        // File file = new File("src/file.txt");
        // Path source = file.toPath();
        // Path target = source.resolveSibling("renamed.txt");
        // Files.move(source, target);


        // Copy 
        File file = new File("src/renamed.txt");
        Path source = file.toPath();
        Path target = Paths.get("src/file_copy.txt"); // name and place to copy
        Files.copy(source, target,StandardCopyOption.REPLACE_EXISTING); // replace if already present

    }
}