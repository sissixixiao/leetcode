class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        //Create a hashmap. key is a number (the offset compared to its first char), 
        //value is a list of strings which have the same offset.
        //For each string, convert it to char array 
        //Then subtract its first character for every character
        //eg. "abc" -> "0,1,2,"        "am"->"0,12,"
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strings) {
            String key = "";
            char first = str.charAt(0);
            for(char c : str.toCharArray())
                key += (c - first < 0 ? c - first + 26 : c - first) + ",";
            if(!map.containsKey(key))
                map.put(key, new ArrayList<String>());
            map.get(key).add(str);
        }
        for (String key : map.keySet()) Collections.sort(map.get(key));
        return new ArrayList<List<String>>(map.values());
    }
}