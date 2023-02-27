package ArrayListAssgn1;
import java.util.ArrayList;
import java.util.List;
public class Tester {
	  public static List<Participant> generateListOfFinalists(Participant[] finalists) {
	        List<Participant> finalistsList = new ArrayList<>();
	        for (Participant finalist : finalists) {
	            if (finalist.getParticipantScore() >= 90) {
	                finalistsList.add(finalist);
	            }
	        }
	        return finalistsList;
	    }

	    public static List<Participant> getFinalistsByTalent(List<Participant> finalists, String talent) {
	        List<Participant> finalistsByTalentList = new ArrayList<>();
	        for (Participant finalist : finalists) {
	            if (finalist.getParticipantTalent().equals(talent)) {
	                finalistsByTalentList.add(finalist);
	            }
	        }
	        return finalistsByTalentList;
	    }

	    public static void main(String[] args) {
	        Participant finalist1 = new Participant("Hazel", "Singing", 91.2);
	        Participant finalist2 = new Participant("Ben", "Instrumental", 95.7);
	        Participant finalist3 = new Participant("John", "Singing", 94.5);
	        Participant finalist4 = new Participant("Bravo", "Singing", 97.6);

	        Participant[] finalists = { finalist1, finalist2, finalist3, finalist4 };

	        List<Participant> finalistsList = generateListOfFinalists(finalists);

	        System.out.println("Finalists");
	        for (Participant finalist : finalistsList)
	            System.out.println(finalist);

	        String talent = "Singing";
	        System.out.println("Finalists in " + talent + " category");

	        List<Participant> finalistsCategoryList = getFinalistsByTalent(finalistsList, talent);
	        for (Participant finalist : finalistsCategoryList)
	            System.out.println(finalist);
	    }
}
