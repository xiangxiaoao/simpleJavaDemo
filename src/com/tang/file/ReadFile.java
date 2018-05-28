package com.tang.file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    private static List<String> fileList = new ArrayList<String>();

    public static void main(String[] args) {
        String path = "E:\\template";
        readFile(path);
        if (fileList != null && fileList.size() > 0) {
            for (String file : fileList) {
                System.out.println(file);
            }
        }
    }

    /**
     * 递归读取文件夹
     *
     * @param path
     */
    private static void readFile(String path) {
        File folder = new File(path);
        if (folder.exists()) {
            File[] files = folder.listFiles();
            if (files.length != 0) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        readFile(file.getAbsolutePath());
                    } else {
                        readFileDetail(file.getAbsolutePath());
                    }
                }
            } else {
                System.out.println("the folder is empty");
            }
        } else {
            System.out.println("the path is not exists");
        }
    }

    /**
     * 读取文件
     *
     * @param path
     */
    private static void readFileDetail(String path) {
        File file = new File(path);
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] tmp = line.split(" ");
                if (tmp != null && tmp.length > 0) {
                    for (String tmpStr : tmp) {
                        if (tmpStr.startsWith("V_") || tmpStr.startsWith("v_")) {
                            fileList.add(tmpStr);
                            writeFile(tmpStr);
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("the read of file occur exception:" + e.getMessage());
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println("close the BufferedReader occur exception:" + e.getMessage());
            }
        }
    }

    /**
     * 写文件
     * @param str
     */
    public static void writeFile(String str) {
        BufferedWriter writer = null;
        try {
            String inputPath = "E:\\input.txt";
            File file = new File(inputPath);
            if (!file.exists()) {
                file.createNewFile();
            }
            writer = new BufferedWriter(new FileWriter(file, true));
            writer.write(str + "\r\n");
            writer.flush();

        } catch (IOException e) {
            System.out.println("write a string to the file occur error:" + e.getMessage());
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                System.out.println("close the BufferedWriter occur exception:" + e.getMessage());
            }
        }
    }
}
