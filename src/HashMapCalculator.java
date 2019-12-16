import java.util.HashMap;

public class HashMapCalculator {
	int commonKeyValuePairs(HashMap<String, String> one, HashMap<String, String> two) {
		int numberOfPairs=0;
		for(String key : one.keySet()) {
			if(two.containsKey(key)) {
				if(one.get(key).equals(two.get(key))) {
					numberOfPairs++;
				}
			}
		}
		return numberOfPairs;
	}
}
