package itmo.java.labs.Lab11Classes;

import java.io.File;
import java.io.FilenameFilter;

public class MyFile implements FilenameFilter {

    private String keyName;

    public MyFile(String keyName) {
        this.keyName = keyName.toLowerCase();
    }

    @Override
    public boolean accept(File dir, String name) {
        if (keyName.charAt(0) == '*') {
            String ext = keyName.substring(1);
            return name.toLowerCase().endsWith(ext);
        } else {
            return name.toLowerCase().contains(keyName);
        }
    }
}
