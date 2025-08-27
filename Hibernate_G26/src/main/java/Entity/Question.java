package Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Question {
	
	@Id
	private int Qid;
	private String question;
	@OneToOne
	private Answer answer;
	
	public Question() {}
	
	public Question(int qid, String question, Answer answer) {
		super();
		Qid = qid;
		this.question = question;
		this.answer = answer;
	}

	public int getQid() {
		return Qid;
	}

	public void setQid(int qid) {
		Qid = qid;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	
	
}
