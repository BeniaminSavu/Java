package com.iquest.week10pr3;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	private Encoder encoder = new Encoder();
	
	@Test
	public void testLatinToUtfTranscode(){
		encoder.convertLatinToUtf("src/resources/MyFileLatin", "src/resources/MyFileLatinConverted.txt");
		String actual = encoder.getData("src/resources/MyFileLatinConverted.txt");
		
		assertThat(actual, is("Enunt de test"));
	}
	
	@Test
	public void testUtfToLatinTranscode(){
		encoder.convertUtfToLatin("src/resources/MyFileUTF", "src/resources/MyFileUTFConverted.txt");
		String actual = encoder.getData("src/resources/MyFileUTFConverted.txt");
		
		assertThat(actual, is(" a  b  "));
	}
}
