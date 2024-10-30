package com.mywork.problemsovling;


import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;


public class FilesCopy {

    public static void main(String[] args) {
        try {
            File srcDir = new File("/Users/hidayath/test1/");
            File[] srcFiles = srcDir.listFiles();
            if (srcFiles != null) {
                for (File file : srcFiles) {
                    System.out.println("src file name:" + file.getName());
                    File destPath = new File("/Users/hidayath/test2/" + file.getName());
                    Files.copy(file.toPath(), destPath.toPath(), StandardCopyOption.REPLACE_EXISTING);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception while copying files :" + e.getMessage());
        }

    }
}
