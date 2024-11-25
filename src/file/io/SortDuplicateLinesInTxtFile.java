package file.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortDuplicateLinesInTxtFile {

	public static void main(String[] args) {
		String inputFile = "C:\\Users\\SHARPGURUS\\Downloads\\input.txt";
		String outputFile = "C:\\Users\\SHARPGURUS\\Downloads\\output.txt";
		try {
			List<String> lines = readLineFromFile(inputFile);
			List<String> uniquwLines = sortUniqueLines(lines);
			writeLinesToFile(outputFile, uniquwLines);
			System.out.println("Remove duplicates successfully : " + outputFile);
		} catch (Exception e) {
			System.err.println("Error reading or writing files: " + e.getMessage());
		}
	}

	private static List<String> readLineFromFile(String file) throws IOException {
		List<String> lines = new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = reader.readLine()) != null) {
				lines.add(line);
			}
		} catch (Exception e) {
			throw new FileNotFoundException();
		}
		return lines;
	}

	private static List<String> sortUniqueLines(List<String> lines) {
		Set<String> set = new TreeSet<>();
		set.addAll(lines);
		return new ArrayList<>(set);
	}

	private static void writeLinesToFile(String fileName, List<String> line) throws IOException {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
			for (String lines : line) {
				writer.write(lines);
				writer.newLine();
			}
		}
	}
}
