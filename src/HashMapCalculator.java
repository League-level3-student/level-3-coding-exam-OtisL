import java.util.HashMap;

public class HashMapCalculator {
	int commonKeyValuePairs(HashMap<String, String> one, HashMap<String, String> two) {
		int numberOfPairs=0;
		for(String key : one.keySet()) {
			if(two.get(key)!=null) {
				numberOfPairs++;
			}
		}
		return numberOfPairs;
	}
}
