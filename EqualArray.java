import java.util.HashMap;

public class EqualArray {
    public static void main(String[] args) {
        int[] array = {1,2,1,3,2};
        int[] array2 = {2,3,1,2,1};
        System.out.println(equalOrNot(array,array2));
    }
        static boolean equalOrNot(int[] array, int[] array2)
        {
            HashMap<Integer,Integer> hashMap = new HashMap<>();
            for(int num1 : array)
            {
                if(!hashMap.containsKey(num1))
                {
                    hashMap.put(num1,1);
                }
                else {
                    hashMap.put(num1,hashMap.getOrDefault(num1,0)+1);
                }
            }
            for(int num2 : array2)
            {
                if(!hashMap.containsKey(num2))
                    return false;
                else
                {
                    hashMap.put(num2,hashMap.getOrDefault(num2,0)-1);
                }
            }
            for(int check : hashMap.keySet())
            {
                if(hashMap.get(check)!=0)
                {
                    return false;

                }
            }
            System.out.println("equal");
            return true;
        }
}
