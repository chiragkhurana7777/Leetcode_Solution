import java.util.*;

class Solution {

   public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> map = new HashMap<>();

        for(String i : strs){
            int[] freq= new int[26];

            for(int j=0;j<i.length();j++){
                freq[i.charAt(j)-'a']++;
            }
            StringBuilder st = new StringBuilder();

            for(int k=0;k<26;k++){
                st.append('#');
                st.append(freq[k]);
            }

            String strkey= st.toString();

            // if(!map.containsKey(strkey)){
            //     List<String> group = new ArrayList<>(); 
            //     group.add(i);
            //     map.put(strkey,group);
            // }
            // else{
            //     map.get(strkey).add(i);
            // }

            map.computeIfAbsent(strkey,key -> new ArrayList<>()).add(i);

        }
        return new ArrayList<>(map.values());

    }
}