import java.util.ArrayList;

public class VoteProcessor {
	String calculateElectionWinner(ArrayList<String> votes) {
		int votesForPope = 0;
		int votesForEdward = 0;
		for(int i=0; i<votes.size(); i++) {
			String e = votes.get(i);
			e=e.toLowerCase();
			votes.set(i, e);
		}
		for(int i=0; i<votes.size(); i++) {
			if(votes.get(i).equals("pope francis")) {
				votesForPope++;
			}else if(votes.get(i).equals("edward snowden")){
				votesForEdward++;
			}
		}
		System.out.println(votesForPope+" "+votesForEdward);
		if(votesForPope>votesForEdward) {
			return "pope francis";
		}else if(votesForPope==votesForEdward){
			return "TIE";
		}else if(votesForPope<votesForEdward){
			return "edward snowden";
		}else {
			return null;
		}
	}
}
