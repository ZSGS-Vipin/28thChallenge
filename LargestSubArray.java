public class LargestSubArray {
    public static void main(String[] args) {
        int[] array = {10,2,3,-2,-3,0,1}; //10,2,3,-2,-3,0,1        15,-2,2,-8,1,7,10,23
        largestSubArray(array);
    }
    public static void largestSubArray(int[] array)
    {
        int max = 0;
        for(int index = 0; index < array.length-1;index++)
        {
            int currNum = array[index];
            for(int inner = index+1;inner< array.length;inner++)
            {
                currNum+= array[inner];
                if(currNum==0)
                {
                    if(max<(inner-index))
                    {
                        max = inner;
                    }

                }
            }
        }
        System.out.println(max);
    }
}
