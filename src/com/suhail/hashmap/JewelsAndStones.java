package com.suhail.hashmap;

import java.util.HashMap;

public class JewelsAndStones {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels,stones));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> jewel_count = new HashMap<>();
        int sum=0;

        for(int idx = 0; idx < jewels.length(); idx++){
            jewel_count.put(jewels.charAt(idx),0);
        }

        for(int idx = 0; idx < stones.length(); idx++){
            if(jewel_count.containsKey(stones.charAt(idx))){
                int count = jewel_count.get(stones.charAt(idx));
                jewel_count.replace(stones.charAt(idx),count,++count);
            }
        }
//        System.out.println(jewel_count);

        for(int item:jewel_count.values()){
            sum+=item;
        }
        return sum;
    }
}
