package itmo.java.labs;

import itmo.java.labs.Lab11Classes.MyFile;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab11 {
    //
    //Exercise 1
    //
    public static void ex1() {
        File file = new File("src/itmo/java/labs/Lab11/Data/TextFile.txt");
        if (file.exists()) {
            List<String> stringList = fileToList(file);
            for (String i :
                    stringList) {
                System.out.println(i);
            }
        } else {
            System.out.println("Файл не найден.");
        }
    }

    public static List<String> fileToList(File file) {
        List<String> stringList = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                stringList.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        return stringList;
    }

    //
    //Exercise 2
    //
    public static void ex2() {
        String filePath = "src/itmo/java/labs/Lab11/Data/TextFile.txt";
        File file = new File(filePath);
        if (file.exists()) {
            addStringInFile(file, "!!!!Новая строка!!!!");
            try {
                System.out.println(readFile(filePath));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Файл не найден.");
        }
    }

    public static void addStringInFile(File file, String string) {
        try (FileWriter printWriter = new FileWriter(file, true)) {
            printWriter.write("\n" + string);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String readFile(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    //
    //Exercise 3
    //
    public static void ex3() {
        File file1 = new File("src/itmo/java/labs/Lab11/Data/TextFile.txt");
        File file2 = new File("src/itmo/java/labs/Lab11/Data/TextFile2.txt");
        addStringsInFile(file1, file2);
        try {
            System.out.println(readFile(file1.getPath()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addStringsInFile(File mainFile, File addedFile) {
        List<String> stringList = fileToList(addedFile);
        for (String i :
                stringList) {
            addStringInFile(mainFile, i);
        }
    }

    //
    //Exercise 4
    //
    public static void ex4() {
        String filePath = "src/itmo/java/labs/Lab11/Data/111.png";
        String newFilePath = "src/itmo/java/labs/Lab11/Data/222.png";
        boolean flag = false;
        int i = 1;
        while (!flag) {
            flag = copyFileTo(filePath, newFilePath);
            newFilePath = newFilePath.replace("222", "222 (" + i + ")");
        }
    }

    public static boolean copyFileTo(String filePath, String newFilePath) {
        File newFile = new File(newFilePath);
        try {
            boolean createdNew = newFile.createNewFile();
            if (createdNew) {
                System.out.println("file created.");
            } else {
                System.out.println("file already exists.");
                return false;
            }
        } catch (IOException e) {
            System.out.println("Cannot create the file: " + newFile.getPath());
            return false;
        }

        try {
            InputStream inputStream = new FileInputStream(filePath);
            OutputStream outputStream = null;
            outputStream = new FileOutputStream(newFilePath);
            byte[] data = new byte[inputStream.available()];
            while (inputStream.available() > 0) {
                int count = inputStream.read(data);
                outputStream.write(data, 0, count);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Cannot find the file: " + filePath);
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    //
    //Exercise 5
    //
    public static void ex5() {
        try {
            String dir = "src/itmo/java/labs/Lab11/Data";
            String keyName = "file";
            File[] listFiles = filesInFolder(dir, keyName);
            if (listFiles != null) {
                for (File f : listFiles) {
                    System.out.println("file: " + f.getName());
                }
            } else {
                System.out.println("Not found");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static File[] filesInFolder(String folderPath, String findString) {
        File file = new File(folderPath);
        //File
        File[] listFiles = file.listFiles(new MyFile(findString));
        if (listFiles == null) {
            System.out.println(folderPath + "no such file" + findString);
            return null;
        } else {
            return listFiles;
        }
    }

    //
    //Exercise 6
    //
    public static void ex6() {
        try {
            String dir = "src/itmo/java/labs/Lab11/Data";
            String findString = "ADFSFS";
            List<File> resultList = findStringInFiles(dir, findString);
            for (File f : resultList) {
                System.out.println("file: " + f.getName());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static List<File> findStringInFiles(String folderPath, String findString) {
        String keyName = "*.txt";
        File[] listFiles = filesInFolder(folderPath, keyName);
        List<File> returnList = new ArrayList<>();
        if (listFiles.length != 0) {
            for (File f : listFiles) {
                if (findStringInFile(f, findString)) {
                    returnList.add(f);
                }
            }
        } else {
            System.out.println("Text files not found");
        }
        return returnList;
    }

    public static boolean findStringInFile(File file, String string) {
        boolean flag = false;
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                if (scanner.nextLine().toLowerCase().contains(string.toLowerCase())) {
                    flag = true;
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return flag;
    }
}
