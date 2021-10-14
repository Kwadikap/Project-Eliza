//link : https://www.youtube.com/watch?v=qQXghIBRhhA&feature=youtu.be
import java.util.Scanner;
public class ProjectEliza {

public static void runEliza() {
		
		Scanner scnr = new Scanner(System.in);
		String runAgain = "";
		String response = "";
		
		System.out.println("Hello, my name is Eliza. What is your name?");
		String name = scnr.next();
		scnr.nextLine();
		System.out.print("Hello, " + name + ". Tell me what is on your mind today in 1 sentence.\n");
		String onMind = scnr.nextLine();
		
		String [] first = onMind.split(" ", 2);
		String firstWord = first[0];
		
		String [] last = onMind.split(" ");
		String lastWord = last[last.length-1];
		
		PromptBank x = new PromptBank();
		x.populateStatementsArray(firstWord, lastWord);
		System.out.println(x.getRandomStatementTrunk());
		response = scnr.nextLine();
		
		if("EXIT".equalsIgnoreCase(response)) {
			System.out.println("Do you want to run the session again?");
			runAgain = scnr.next();
		}
		
		if("YES".equalsIgnoreCase(runAgain))
			RunEliza.runEliza();
		else if("NO".equalsIgnoreCase(runAgain))
			System.out.println("Goodbye, until next time");
	
		
		
		
		
		while(!"EXIT".equalsIgnoreCase(response)){
			
			first = response.split(" ", 2);
			firstWord = first[0];
			
			last = response.split(" ");
			lastWord = last[last.length-1];
			
			if(response.charAt(response.length()-1) == '?') {
			lastWord = lastWord.replace('?', ' ');
			x.populateQuestionsArray(firstWord, lastWord);
			System.out.println(x.getRandomQuestionsTrunk());
			}
			else if(response.charAt(response.length()-1) == '!') {
			lastWord = lastWord.replace('!', ' ');
			x.populateStatementsArray(firstWord, lastWord);
			System.out.println("WOW! Dramatic! " + x.getRandomStatementTrunk());
			}
			else {
			x.populateStatementsArray(firstWord, lastWord);
			System.out.println(x.getRandomStatementTrunk());
			}
			response = scnr.nextLine();
			
			if("EXIT".equalsIgnoreCase(response)) {
				System.out.println("Do you want to run the session again?");
				runAgain = scnr.next();
			}
			if("YES".equalsIgnoreCase(runAgain))
				RunEliza.runEliza();
			else if("NO".equalsIgnoreCase(runAgain))
				System.out.println("Goodbye, until next time");
			}
		}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		String runAgain = "";
		String response = "";
		
		System.out.println("Hello, my name is Eliza. What is your name?");
		String name = scnr.next();
		scnr.nextLine();
		System.out.print("Hello, " + name + ". Tell me what is on your mind today in 1 sentence.\n");
		String onMind = scnr.nextLine();
		
		String [] first = onMind.split(" ", 2);
		String firstWord = first[0];
		
		String [] last = onMind.split(" ");
		String lastWord = last[last.length-1];
		
		PromptBank x = new PromptBank();
		x.populateStatementsArray(firstWord, lastWord);
		System.out.println(x.getRandomStatementTrunk());
		response = scnr.nextLine();
		
		if("EXIT".equalsIgnoreCase(response)) {
			System.out.println("Do you want to run the session again?");
			runAgain = scnr.next();
		}
		
		if("YES".equalsIgnoreCase(runAgain))
			RunEliza.runEliza();
		else if("NO".equalsIgnoreCase(runAgain))
			System.out.println("Goodbye, until next time");
			
	
		
		
		
		
		while(!"EXIT".equalsIgnoreCase(response)){
			
			first = response.split(" ", 2);
			firstWord = first[0];
			
			last = response.split(" ");
			lastWord = last[last.length-1];
			
			if(response.charAt(response.length()-1) == '?') {
			lastWord = lastWord.replace('?', ' ');
			x.populateQuestionsArray(firstWord, lastWord);
			System.out.println(x.getRandomQuestionsTrunk());
			}
			else if(response.charAt(response.length()-1) == '!') {
			lastWord = lastWord.replace('!', ' ');
			x.populateStatementsArray(firstWord, lastWord);
			System.out.println("WOW! Dramatic! " + x.getRandomStatementTrunk());
			}
			else {
			x.populateStatementsArray(firstWord, lastWord);
			System.out.println(x.getRandomStatementTrunk());
			}
			response = scnr.nextLine();
			
			if("EXIT".equalsIgnoreCase(response)) {
				System.out.println("Do you want to run the session again?");
				runAgain = scnr.next();
			}
				if("YES".equalsIgnoreCase(runAgain))
					RunEliza.runEliza();
				else if("NO".equalsIgnoreCase(runAgain))
					System.out.println("Goodbye, until next time");
					
			}
		}
	}
	



