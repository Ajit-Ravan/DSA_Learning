package Step_01_HackerrankQuestions;

public class Snippet {
	List<Integer> missingNumbers = findMissingNumbers(arr, brr);
	
	        // Printing the missing numbers
	        System.out.println("Missing Numbers: " + missingNumbers);
	    }
	
	    public static List<Integer> findMissingNumbers(List<Integer> arr, List<Integer> brr) {
	        // Create frequency maps for both arrays
	        Map<Integer, Integer> frequencyA = new HashMap<>();
	        Map<Integer, Integer> frequencyB = new HashMap<>();
	
	        // Populate frequency map for array 'arr'
	        for (int value : arr) {
	            frequencyA.put(value, frequencyA.getOrDefault(value, 0) + 1);
	        }
	
	        // Populate frequency map for array 'brr'
	        for (int value : brr) {
	            frequencyB.put(value, frequencyB.getOrDefault(value, 0) + 1);
	        }
	
	        List<Integer> missingNumbers = new ArrayList<>();
	
	        // Compare the frequency maps to find missing numbers
	        for (int element : frequencyB.keySet()) {
	            int freqInA = frequencyA.getOrDefault(element, 0);
	            int freqInB = frequencyB.get(element);
	
	            if (freqInA < freqInB) {
	                for (int i = 0; i < freqInB - freqInA; i++) {
	                    missingNumbers.add(element);
	                }
	            }
	        }
	
	        // Sort the missing numbers list
	        Collections.sort(missingNumbers);
	
	        return missingNumbers;
}

