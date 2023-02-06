import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ShortLister{
    public ArrayList<String> getWord(){
        ArrayList<String> wordList = new ArrayList<>();
        JFileChooser chooser = new JFileChooser();
        Scanner inFile;
        String line;
        Path Filename;
        Path target = new File(System.getProperty("user.dir")).toPath();
        target = target.resolve("src");
            chooser.setCurrentDirectory(target.toFile());
            try
        {
            if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
            {
                target = chooser.getSelectedFile().toPath();

                inFile = new Scanner(target);
                int i = 5;
                Filename = target.getName(i);
                while(inFile.hasNextLine()) {
                    line = inFile.nextLine();
                    List<String> formater = Arrays.asList(line.split(" "));
                    for (Object o : formater) {
                        wordList.add(String.valueOf(o));
                    }

                }

                inFile.close();
            }
            else
            {
                System.out.println("You did not choose a file. Quitting.");
                System.exit(0);
            }
        }
            catch (
        FileNotFoundException e)
        {
            System.out.println("File Not Found Error");
            e.printStackTrace();
        }
            catch (
        IOException e)
        {
            System.out.println("IOException Error");
            e.printStackTrace();
        }
            System.out.println("Original Word List: "+wordList);
            return wordList;
    }
}
