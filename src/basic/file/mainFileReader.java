package basic.file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class mainFileReader {

    public static List<contentViewable> loadFiles () {
        List<contentViewable> contentViewables = new ArrayList<>();
        String foderInput = "C:\\Users\\Seppy\\Downloads";
        File f = new File(foderInput);
        for (File file : f.listFiles()) {
            if (file.getName().contains(".pdf")) {
                Pdf pdf = new Pdf(file);
                contentViewables.add(pdf);
            }
//            else {
//                System.out.println("khong cung loai voi cac file can mo");
//            }
        }
        return contentViewables;
    }

    public static void main(String[] args) throws IOException {
        String url = "C:\\Users\\Seppy\\Desktop\\file\\text.txt";
        File f = new File(url);

        BufferedReader fileReader = new BufferedReader(new FileReader(f));

        String line = fileReader.readLine();

        while (line != null) {
            System.out.println(line);
            line = fileReader.readLine();
        }

        FileWriter fileWritter = new FileWriter(url, true);

        fileWritter.write("dat\nahihi");
        fileWritter.flush();

        BufferedReader fileReader1 = new BufferedReader(new FileReader(f));
        line = fileReader1.readLine();
        while (line != null) {
            System.out.println(line);
            line = fileReader1.readLine();
        }

    }
}
