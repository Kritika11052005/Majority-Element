import java.util.*;
public class LeetCode {
    public int majorityElement(int[] nums) {
        int val=0;
        int c=nums.length;
        //creating a hashmap with key:number and value:frequency.
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){//traversing through the array
            if(map.containsKey(nums[i])==true){//if the number(key) already exist in the hashmap update its value by adding +1 to the value pair(frequency). 
                map.put(nums[i],map.get(nums[i])+1);
                }
                else{//if the key(number) doesnt exist in the hashmap then create a new key:value pair in which the number gets the frequency :1 .
                    map.put(nums[i],1);
                }
                }
    
                for(int key : map.keySet()){//traversing into the hashmap
                    if(map.get(key)>c/2){//finding the key whose value is greater than c/2
                    return val=key ;  
                    }
                }
    return val;
    }
    
}
