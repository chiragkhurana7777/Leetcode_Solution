import java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for(int i=0;i<s.length();i++){

            char sch=s.charAt(i);
            char tch =t.charAt(i);

            // if(!map1.containsKey(sch) || !map2.containsKey(tch)){ 
            //     map1.put(sch,tch);
            //     map2.put(tch,sch);
            //     // map.put(tch,sch);
            
            // }
            // else if(map1.get(sch)!=tch || map2.get(tch)!=sch) return false;

            if(map1.containsKey(sch) && map1.get(sch)!=tch){
                return false;
            }
            
            if(map2.containsKey(tch) && map2.get(tch)!=sch){
                return false;
            }

            map1.put(sch,tch);
            map2.put(tch,sch);
            




        }

        return true;
    }
}

//optimal:

class Solution1 {
    public boolean isIsomorphic(String s, String t) {
        
        int[] arr1= new int[256];
        int[] arr2= new int[256];

        for(int i=0;i<s.length();i++){

            char sch=s.charAt(i);
            char tch=t.charAt(i);

            if(arr1[sch]!=arr2[tch])
                return false;

            arr1[sch]=i+1;
            arr2[tch]=i+1;
        }
        return true;

    }
}
