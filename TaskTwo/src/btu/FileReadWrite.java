package btu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class FileReadWrite {
    public static void WriteInFile(String fileName, List<Double> numbers){
        try {
            FileWriter wr = new FileWriter(fileName);
            for (int i = 0; i < numbers.size(); i++){
                wr.write(Double.toString(numbers.get(i))+"\n");
            }
            wr.close();
        }catch (Exception e){
            System.out.println("Exception in file write");
        }

    }
    public static List<String> ReadFromFile(String fileName){
        BufferedReader reader;
        List<String> readFile = new ArrayList<String>();
        try{
            reader = new BufferedReader(new FileReader(fileName));
            String line = reader.readLine();
            while (line != null){
                readFile.add(line);
                line = reader.readLine();
            }
            reader.close();
            return readFile;

        }catch (Exception e){
            System.out.println("Error in " + e.getLocalizedMessage());
        }
        return readFile;
    }
}
