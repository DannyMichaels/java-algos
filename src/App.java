import java.util.*;

public class App {
  public static void main(String[] args) throws Exception {
    StringAlgos stringAlgos = new StringAlgos();
    System.out.println(stringAlgos.reverseWordsInString("reverse me!"));

    ArrayAlgos arrayAlgos = new ArrayAlgos();

    List<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(2, 1, 2, 2, 2, 3, 4, 2));
    System.out.println(arrayAlgos.moveElementToEnd(arrayList, 2));
  }
}

class StringAlgos {
  public String reverseWordsInString(String string) {
	 ArrayList<String> words = new ArrayList<>();
	 int startOfWord = 0;
		
		for (int idx = 0; idx < string.length(); idx++) {
			char character = string.charAt(idx);
			
			if (character == ' ') {
				words.add(string.substring(startOfWord, idx));
				startOfWord = idx;
			} else if (string.charAt(startOfWord) == ' ') {
  			words.add(" ");
				startOfWord = idx;
			}
		}
		
			words.add(string.substring(startOfWord));
			
			Collections.reverse(words);
      String result = String.join("", words);
			return String.join("", words);
	}
}


class ArrayAlgos {
  public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
    // Write your code here.
		int i = 0;
		int j = array.size() - 1;
		while (i < j) {
			while (i < j && array.get(j) == toMove) j--;
      if (array.get(i) == toMove) swap(i, j, array); // can also do Collections.swap(array, i, j)
			i++;
		}
	  return array;
 }


	public static void swap(int i, int j, List<Integer> array) {
		int temp = array.get(j);
		array.set(j, array.get(i));
		array.set(i, temp);
	}
}