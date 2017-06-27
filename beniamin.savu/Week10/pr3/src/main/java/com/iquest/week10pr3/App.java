package com.iquest.week10pr3;


public class App {

	public static void main(String[] args){
        Encoder encoder = new Encoder();
        encoder.convertLatinToUtf("src/resources/MyFileLatin", "src/resources/MyFileLatinConverted.txt");
		encoder.convertUtfToLatin("src/resources/MyFileUTF", "src/resources/MyFileUTFConverted.txt");
	}
}
