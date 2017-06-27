package com.iquest.week10pr2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;


/**
 * Compresses files
 * 
 * @author Beniamin
 *
 */
public class Archive {

	/**
	 * Read an arbitrary file and compresses it
	 * @param archiveName name of the archive that will be made
	 * @param fileToArchive name of the file that will be archived
	 */
	public void addToArchive(String archiveName, String fileToArchive){
		byte[] buffer = new byte[1024];
    	
    	try{
    		
    		FileOutputStream fos = new FileOutputStream(archiveName);
    		ZipOutputStream zos = new ZipOutputStream(fos);
    		ZipEntry ze= new ZipEntry(fileToArchive);
    		zos.putNextEntry(ze);
    		FileInputStream in = new FileInputStream(fileToArchive);
    		
    		int len;
    		while ((len = in.read(buffer)) > 0) {
    			zos.write(buffer, 0, len);
    		}
    		

    		in.close();
    		zos.closeEntry();
    		zos.close();

    	}catch(IOException ex){
    	   ex.printStackTrace();
    	}
	}
	
}
