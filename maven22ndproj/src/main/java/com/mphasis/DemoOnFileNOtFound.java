package com.mphasis;

import java.io.File;
import java.io.FileNotFoundException;

public class DemoOnFileNOtFound implements AutoCloseable {

	public static void useFile(File f) throws FileNotFoundException {

		if (!f.exists())
			throw new FileNotFoundException();
	}

	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("demo.txt");
		useFile(f);
	}

	@Override
	public void close() throws Exception {
		System.out.println("file closed");

	}

}
