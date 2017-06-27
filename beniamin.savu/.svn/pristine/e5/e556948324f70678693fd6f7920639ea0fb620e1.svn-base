package com.iquest.week10pr2;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class AppTest {

	@Test
	public void testAddToArchive(){
		Archive archiver = new Archive();
    	archiver.addToArchive("src/resources/MyFile.zip", "src/resources/poza.png");
    	
    	File normalFile = new File("src/resources/poza.png");
    	File zipFile = new File("src/resources/MyFile.zip");
    	double actual = (double)normalFile.length()/zipFile.length();
    	
    	assertThat(actual, is(0.9999657780656223));
	}
	
	@Test
	public void testAddToArchiveWithInvalidFileName(){
		Archive archiver = new Archive();
    	archiver.addToArchive("MyFile.zip", "examene3.png");
    	
    	File normalFile = new File("examene3.png");
    	File zipFile = new File("MyFile.zip");
    	double actual = (double)normalFile.length()/zipFile.length();
    	
    	assertThat(actual, is(0.0));
	}
}

