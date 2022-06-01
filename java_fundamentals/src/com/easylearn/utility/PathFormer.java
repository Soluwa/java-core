package com.easylearn.utility;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.MessageFormat;

/**
 * Contains method for constructing resources local path
 */
public class PathFormer {
	public String constructPath(String folder_fileName) {
		Path currentRelativePath = Paths.get("");
		String currentWorkingDirectory = currentRelativePath.toAbsolutePath().toString();
		return MessageFormat.format("{0}{1}",currentWorkingDirectory, folder_fileName);
	}
}
