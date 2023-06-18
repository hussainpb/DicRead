package dictreader;

import java.io.File;

public class FileExistenceChecker {
	public static boolean doesFileExist(String filePath) {
		File file = new File(filePath);
		return file.exists();
	}

}
