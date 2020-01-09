package pl.codegym.task.task13.task1319;

import java.io.*;

/* 
Zapisywanie do pliku z konsoli
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // tutaj wpisz swój kod


       	try (
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       			FileWriter writer = new FileWriter(reader.readLine());
       			BufferedWriter bw = new BufferedWriter(writer)){
				String content;
       			do {
					content=reader.readLine();
					bw.write(content+"\n");
					writer.close();
       		}while(!content.equals("exit"));

		 } catch (IOException e) {}
		//

    }
}
