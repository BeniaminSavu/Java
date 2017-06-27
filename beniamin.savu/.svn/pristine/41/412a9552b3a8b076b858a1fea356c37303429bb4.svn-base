package com.iquest.week10pr2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class App {
	public static void main(String[] args) {
    	Archive archiver = new Archive();
    	archiver.addToArchive("src/resources/MyFile.zip", "src/resources/poza.png");
    	
    	File normalFile = new File("src/resources/poza.png");
    	File zipFile = new File("src/resources/MyFile.zip");
    	System.out.println(normalFile.length() + "   " + zipFile.length());
    	double compressedRatio = (double)normalFile.length()/zipFile.length();
    	System.out.println(compressedRatio);
    }
	
}
