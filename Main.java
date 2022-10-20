package inpoutstream;

import java.io.File;
import java.io.IOException;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.InputStream;
//import java.io.OutputStream;

public class Main {

	public static void main(String[] args) {

		File folderIn = new File("D:\\kavo\\");

		File folderOut = new File("D:\\kavo2\\");

		// Тут ввести расширение файлов, которые нужно скопировать
		String ext = "doc";

		try {
			FileService.copyAllFiles(folderIn, folderOut, ext);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
