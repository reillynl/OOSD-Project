import java.io.*;

/**
 * WordClue's constructor takes in the file that is to be read from and returns
 * a list of strings, answers and clues.
 * 
 * @author Noah Reilly
 */
public class WordClue2 {
	private String Filename;

// WordClue takes the file that you wish to import from
	public WordClue2(String name) {
// Creates the file
		Filename = name;
	}
//OpenFIle() that returns the array of strings of the text file
	public String[] OpenFile() throws IOException{
		FileReader fr = new FileReader(Filename);
		BufferedReader textReader = new BufferedReader(fr);
		
		int numLines = readLines();
		String[] textData = new String[numLines];
		
		for (int i=0; i<numLines; i++) {
			textData[i] = textReader.readLine();
		}
		textReader.close();
		return textData;
	}

//Returns the number of lines from the text file
	int readLines() throws IOException{
		FileReader fr2 = new FileReader(Filename);
		BufferedReader bf = new BufferedReader(fr2);
		String aLine;
		int numberofLines = 0;
		while((aLine = bf.readLine()) != null) {
			numberofLines++;
		}
		bf.close();
		return numberofLines;
	}

//Calls OpenFile, and then iterates over every other string
//and returns the array of strings that contains only the clues
	public String[] getClue() {
		try {
			WordClue2 Words = new WordClue2(Filename);
			String[] Text = Words.OpenFile();
			int len = Text.length/2;
			String[] Clues = new String[len];
			int i =0;
			
			for(int w=0; w < Text.length; w=w+2) {
				Clues[i] = Text[w];
				i++;
			}
			return Clues;
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		String[] Empty = null;
		return Empty;
	}

//Calls OpenFile, and then iterates over every other string
//and returns the array of strings that contains only the answers
	public String[] getAnswer() {
		try {
			WordClue2 Words = new WordClue2(Filename);
			String[] Text = Words.OpenFile();
			int len = Text.length/2;
			String[] Ans = new String[len];
			int i =0;
			
			for(int w=1; w < Text.length; w=w+2) {
				Ans[i] = Text[w];
				i++;
			}
			return Ans;
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		String[] Empty = null;
		return Empty;
	}
}
		