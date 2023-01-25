class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Integer> identifiedChars = new HashMap<Character, Integer>(), identifiedChars2 = new HashMap<Character, Integer>();
        String string1 = "", string2 = "";

        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);

            if (identifiedChars.get(currChar) == null) {
                identifiedChars.put(currChar, identifiedChars.size());
            } 
            string1 += identifiedChars.get(currChar) + ",";
        }

        for (int i = 0; i < t.length(); i++) {
            char currChar = t.charAt(i);
            if (identifiedChars2.get(currChar) == null) {
                identifiedChars2.put(currChar, identifiedChars2.size());
            } 
            string2 += identifiedChars2.get(currChar) + ",";
        }

        if (string1.equals(string2)) {
            return true;
        }
        return false;
    }
}