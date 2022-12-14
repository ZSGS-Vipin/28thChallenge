import java.util.HashMap;

public class IntegerOccurence {
    public static void main(String[] args) {
        int[] array = {1,7,4,3,4,8,7};
        int len = array.length;
        int occurence = 2;
        occurenceFun(len,array,occurence);
    }

    public static void occurenceFun(int len, int[] array, int occurence)
    {
        int count = 0;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int index = 0; index < len;index++)
        {
            if(!hashMap.containsKey(array[index]))
            {
                hashMap.put(array[index],1);
            }
            else
            {
                hashMap.put(array[index],hashMap.getOrDefault(array[index],0)+1);
                if(hashMap.get(array[index])==occurence)
                {
                    System.out.println(array[index]);
                }
            }
        }

    }
}
