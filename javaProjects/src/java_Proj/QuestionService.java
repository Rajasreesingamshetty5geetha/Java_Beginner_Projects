package java_Proj;

import java.util.ArrayList;
import java.util.Scanner;

public class QuestionService {
	ArrayList<Questions> questions  = new ArrayList<Questions>();
	int count = 0;
	 public QuestionService()
	 {
		 questions.add(new Questions(1, "Which of the following is NOT a part of the Java Collection Framework?", "a.Map", "b.Queue", "c.Array", "d.Set", "c"));
		 questions.add(new Questions(2, "import java.util.*;\r\n"
		 		+ "public class Test {\r\n"
		 		+ "    public static void main(String[] args) {\r\n"
		 		+ "        List<String> list = new ArrayList<>();\r\n"
		 		+ "        list.add(\"A\"); list.add(\"B\"); list.add(\"C\");\r\n"
		 		+ "        Collections.reverse(list);\r\n"
		 		+ "        System.out.println(list);\r\n"
		 		+ "    }\r\n"
		 		+ "}\r\n"
		 		+ "", "a.[A,B,C]", "b.[C,B,A]", "c.Compilation Error", "d.Runtime Error", "b"));
		 questions.add(new Questions(3, "Which interface extends Collection but does NOT allow duplicate elements?", "a.List", "b.Queue", "c.Set", "d.Map", "c"));
		 questions.add(new Questions(4, "What will happen if you try to add a null key in a HashMap?", "a.Throws NullPointerException", "b.Allowed only if the value is non-null", "c.Allowed,but only once", "d.Allowed multiple times", "c"));
		 questions.add(new Questions(5,"Which of the following is true about LinkedHashSet?","a.It allows duplicate elements","b.It maintains insertion order","c.It sorts elements in ascending order","d.It does not use hashing","b"));
	}
	
	void displayQuestions()
	{
		Scanner sc = new Scanner(System.in);
		for(Questions q:questions)
		{
			System.out.print(q.getId()+ " ");
			System.out.println(q.getQuestions());
			System.out.println(q.getOpt1());
			System.out.println(q.getOpt2());
			System.out.println(q.getOpt3());
			System.out.println(q.getOpt4());
			System.out.println();
			answers(q,sc);
			System.out.println();
			
		}
		if(count ==questions.size())
		{
			System.out.println("All answers are correct 🥳!!!");
		}
		else
		{
			System.out.println("Better Luck next time 🤞");
		}
		System.out.println("Your Total Correct Answers: "+ count);
		sc.close();
		
	}

	 int answers(Questions q,Scanner sc) {
		
		System.out.print("Enter your answer: ");
		String ans = sc.next();
		if(ans.equalsIgnoreCase(q.getAns()))
		{
			count++;
		}
		return count;
		
	}
}
