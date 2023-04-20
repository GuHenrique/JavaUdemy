import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};

        String path = "/home/gustavo/Desktop/out.txt";


        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){ //o true não deixa que o arquivo seja sobrescrito;
            for (String line: lines){
                bw.write(line);
                bw.newLine();
            }

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}