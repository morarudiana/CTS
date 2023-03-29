import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class CandidateCode {

	public static void main(String[] args) throws IOException {
	    // Reading input in the field input
	    BufferedReader inputBuffer = new BufferedReader(new InputStreamReader(System.in));
	    String input = inputBuffer.lines().reduce("", (acc, line) -> acc + line + "\n");

	    // Split input into lines and normalize file paths
	    List<String> lines = Arrays.asList(input.split("\n"));
	    Set<String> filesToRemove = new HashSet<>();
	    List<String> filesRemoved = new ArrayList<>();
	    for (int i = 0; i < lines.size(); i++) {
	        String line = lines.get(i);
	        if (line.startsWith("remove ")) {
	            String pathToRemove = normalizePath(line.substring(7));
	            filesRemoved.addAll(markForRemoval(filesToRemove, pathToRemove));
	        } else if (line.startsWith("restore ")) {
	            String pathToRestore = normalizePath(line.substring(8));
	            unmarkForRemoval(pathToRestore, filesToRemove);
	        } else {
	            filesToRemove.add(normalizePath(line));
	        }
	    }
	    for (String file : filesRemoved) {
	        System.out.println(file);
	    }

	    // This is a debug message
	    System.err.println(input);
	}

	private static List<String> markForRemoval(Set<String> filePaths, String dirToRemove) {
	    List<String> filesToRemove = new ArrayList<>();
	    List<String> keysToRemove = new ArrayList<>();
	    for (String filePath : filePaths) {
	        if (filePath.startsWith(dirToRemove)) {
	            filesToRemove.add(filePath);
	            keysToRemove.add(filePath);
	        }
	    }
	    for (String keyToRemove : keysToRemove) {
	        filePaths.remove(keyToRemove);
	    }
	    return filesToRemove;
	}

	private static void unmarkForRemoval(String path, Set<String> filesToRemove) {
	    Set<String> filesToRemoveCopy = new HashSet<>(filesToRemove);
	    for (String file : filesToRemoveCopy) {
	        if (file.startsWith(path)) {
	            // file is contained in the directory to be restored
	            filesToRemove.remove(file);
	        }
	    }
	}

	private static String normalizePath(String path) {
	    // Replace all separators with the system separator
	    path = path.replaceAll("[/\\\\]+", "/");
	    path = path.replaceAll("/", "/");
	    path = path.replaceAll("\\\\", "/");
	    // Remove redundant separators at the end
	    path = path.replaceAll("/+$", "");
	    return path;
	}

}
