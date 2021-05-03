package basic.file;

import java.io.File;

public class Pdf extends fileContent implements contentViewable{

    public Pdf(File files) {
        super(files);
    }

    @Override
    public String getContent () {
        return "this is pdf file : " + file.getName();
    }
}
