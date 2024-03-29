package apiexam.other;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class JsoupExam {
	public static void main(String[] args) {
		String url = "https://sum.su.or.kr:8888/bible/today";
		
		try {
			Document document = Jsoup.connect(url).get();	
			
			Element bibleText = document.getElementById("bible_text");
			Element date = document.getElementById("dailybible_info");
			
			Elements num = document.select(".num");
			Elements info = document.select(".info");
			
			System.out.println("제목: " + bibleText.text());
			System.out.println("날짜: " + date.text());
			
			for(int i=0; i<num.size(); i++) {
				System.out.println(num.get(i).text() + ". " +  info.get(i).text());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
