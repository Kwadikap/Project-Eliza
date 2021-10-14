
import java.util.Random;
public class PromptBank {
	String [] questions;
	String [] statements;
	
	public PromptBank() {
		questions = new String[6];
		statements = new String[6];
	}
	public void populateStatementsArray(String BLANK1, String BLANK2){
		statements[0] = "Tell me more about " + BLANK1 + " and " + BLANK2;
		statements[1] = BLANK1 + " seems important to you, so does " + BLANK2 + " please tell me more.";
		statements[2] = BLANK1 + " and " + BLANK2 + " seem to be on your mind. Let's talk about it.";
		statements[3] = "Well " + BLANK1 + " and " + BLANK2 + " can be good or bad depending on how you look at them.";
		statements[4] = "Tell me what you feel when you think about " + BLANK1 + " and " + BLANK2;
		statements[5] = "Tell me more about how " + BLANK1 + " and " + BLANK2 + " has affected your life.";
	}
	public void populateQuestionsArray(String BLANK1, String BLANK2) {
		questions[0] = "Is there anything else about " + BLANK1 + " and " + BLANK2 + "?";
		questions[1] = "Does " + BLANK1 + " bother you? how about " + BLANK2 + "?";
		questions[2] = "Are " + BLANK1 + " and " + BLANK2 + " things you think about often?";
		questions[3] = "Have you ever seen a counselor about " + BLANK1 + " and " + BLANK2 + " before?";
		questions[4] = "What is the problem with " + BLANK1 + " and " + BLANK2 + "?";
		questions[5] = "Does it upset you to think about " + BLANK1 + " and " + BLANK2 + "?";
	}
	public String getRandomStatementTrunk() {
		Random rand = new Random();
		int random = rand.nextInt(5);
		if(random == 0) 
			return statements[0];
		
		else if(random == 1)
			return statements[1];
		
		else if(random == 2)
			return statements[0];
		
		else if(random == 3)
			return statements[3];
		else if(random == 4)
			return statements[4];
		else if(random == 5)
			return statements[5];
		else
			return "";
	}
	public String getRandomQuestionsTrunk() {
		Random rand = new Random();
		int random = rand.nextInt(5);
		if(random == 0) 
			return questions[0];
		
		else if(random == 1)
			return questions[1];
		
		else if(random == 2)
			return questions[0];
		
		else if(random ==3)
			return questions[3];
		
		else if(random == 4)
			return questions[4];
		
		else if(random == 5)
			return questions[5];
		else
			return "";
	}
	

}

