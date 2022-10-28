package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AnagramString {
    public static void main(String[] args) {
      String input = "abba";
        System.out.println(anagram(input));
    }
    public static void subsequence(String input)
    {
        HashMap<String, Integer> hs = new HashMap<>();
    }
//    static void subseq(String processed, String unprocessedInput ,HashMap<String,Integer> hashMap)
//    {
//        if(unprocessedInput.isEmpty())
//        {
//          if(!hashMap.containsKey(processed))
//          {
//              hashMap.put(processed,1);
//          }
//          else
//          {
//              hashMap.put(processed, hashMap.getOrDefault(processed,0)+1);
//              sorting(hashMap);
//          }
////            System.out.println(processed);
//            return;
//        }
//        char ch = unprocessedInput.charAt(0);
//        subseq(processed+ch,unprocessedInput.substring(1),hashMap);
//        subseq(processed,unprocessedInput.substring(1),hashMap);
  //  }

//    static String sorting(String input)
//    {
//        char[] array = input.toCharArray();
//        Arrays.sort(array);
//        return Arrays.toString(array);
//    }
public  static int anagram(String str){
    int n = str.length();
    List<String> list = new ArrayList<>();
    for (int index = 0; index < n; index++)
        for (int inner = index + 1; inner <= n; inner++) {
            String temp = str.substring(index, inner);
            char[] array = temp.toCharArray();
            Arrays.sort(array);
            list.add((Arrays.toString(array)));
        }
    return count(list);
}
    static int count(List<String>list)
    {
        HashMap<String,Integer> hashMap = new HashMap<>();
        int count = 0;
        for(String check : list)
        {
            if(!list.contains(check))
            {
                hashMap.put(check,1);
            }
            else
            {
                hashMap.put(check,hashMap.getOrDefault(check,0)+1);
            }
        }
        for(String key : hashMap.keySet())
        {
            if(hashMap.get(key)>1)
            {
                count++;
            }
        }
        return count;
    }

}
