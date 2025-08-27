package Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Answer {
	@Id
	private int Aid;
	private String answer;
	@OneToOne
	private Question question;

	public Answer() {}
	public Answer(int aid, String answer, Question question) {
		super();
		Aid = aid;
		this.answer = answer;
		this.question = question;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Answer(int aid, String answer) {
		super();
		Aid = aid;
		this.answer = answer;
	}
	
	public int getAid() {
		return Aid;
	}


	public void setAid(int aid) {
		Aid = aid;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

}
