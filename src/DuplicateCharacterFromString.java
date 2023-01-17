import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacterFromString {
	
	public static void main(String[] args) {

		String s = "harshal sonawane";
		char[] ch = s.toCharArray();
		
		

//		-------------------------- non repeatintg charcter from string ---------------------------------

		Set<Character> set = new HashSet<>();

		for (char c : ch) {
			set.add(c);
		}

//		System.out.println(set);

//      ----------------------------- repeating and non repeating character from string -----------------------------------

		Map<Character, Integer> map = new HashMap<>();
		for (char c : ch) {
			int count = 1;
			if (map.get(c) == null && c!=' ') {
				map.put(c, count);
			} else {
				count++;
				map.put(c, count);
			}
		}

		Set<Character> set1 = map.keySet();
		System.out.print("Repeated Character : ");
		for (char c : set1) {
			if (map.get(c) > 1) {
				System.out.print(c + "  ");
			}
		}
		
		System.out.println();
		System.out.print("Non Repeated Character : ");
		for (char c : set1) {
			if (map.get(c) == 1) {
				System.out.print(c + "  ");
			}
		}
		System.out.println();
		Set<Character> sets = new  HashSet<>();
		set.clear();
		for(char c : ch) {
			if(!sets.add(c)) {
				set.add(c);
			}
		}
		System.out.println(set);
//System.out.println(sets);
	}
	
	

}
