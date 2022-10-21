package inpoutstream;

import java.io.File;
import java.io.IOException;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.InputStream;
//import java.io.OutputStream;

public class Main {

	public static void main(String[] args) {

		File folderIn = new File("D:\\folder1\\");

		File folderOut = new File("D:\\folder2\\");

		// Тут указать расширение файлов, которые нужно скопировать
		String ext = "doc";

		try {
			FileService.copyAllFiles(folderIn, folderOut, ext);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
