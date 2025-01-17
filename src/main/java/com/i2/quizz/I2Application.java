package com.i2.quizz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.i2.quizz.services.EtudiantServices;
import com.i2.quizz.services.ProfesseurServices;
import com.i2.quizz.services.QuizzAttemptServices;
import com.i2.quizz.services.QuizzServices;

@SpringBootApplication
public class I2Application implements CommandLineRunner {
	
	@Autowired
	ProfesseurServices pSer;
	@Autowired
	EtudiantServices eSer;
	@Autowired
	QuizzServices qSer;
	@Autowired
	QuizzAttemptServices qaSer;


	public static void main(String[] args) {
		SpringApplication.run(I2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		/*Professeur prof = new Professeur();
		prof.setUsername("ben aouicha");
		prof.setPassword("123456");
		Etudiant etud = new Etudiant();
		etud.setUsername("aymen");
		etud.setPassword("123456");
		eSer.SaveEtudiant(etud);

		Quizz quizz = new Quizz(null, "siwar", 60, "asvddgfr", false, prof, null);
		pSer.enregistrerProfesseur(prof);
		pSer.createQuizz(prof, quizz);

		Question question = new Question();
		Choice choice = new Choice(null, "YARN + HDFS", true,question);
		Choice choice2 = new Choice(null, "KAFKA + HDFS", false,question);
		List<Choice> ls = new ArrayList<>();
		ls.add(choice);ls.add(choice2);
		question.setQuizz(quizz);
		question.setChoices(ls);
		question.setText("c'est quoi hadoop");

		Question question2 = new Question();
		Choice choice0 = new Choice(null, "in memory", true,question2);
		Choice choice20 = new Choice(null, "in disk", false,question2);
		Choice choice201 = new Choice(null, "in fss", false,question2);
		List<Choice> ls0 = new ArrayList<>();
		ls0.add(choice0);ls0.add(choice20);ls0.add(choice201);
		question2.setQuizz(quizz);
		question2.setChoices(ls0);
		question2.setText("c'est quoi spark");

		qSer.ajouterQuestion(quizz, question2);
		qSer.ajouterQuestion(quizz, question);
		
		QuizzAttempt qa =eSer.rejoindreQuizz(etud, "asvddgfr");
		qaSer.setAnswer(qa, question2, ls0.subList(0, 1));
		
		System.out.println("***************"+eSer.consulterScore(etud, quizz)+"******************");
	*/
	}

}
