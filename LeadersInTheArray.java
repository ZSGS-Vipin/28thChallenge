import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class LeadersInTheArray {
    public static void main(String[] args) {
        int len = 6;
        int[] array = {16,17,4,3,5,2};
        leaderArray(array,len);
    }
    public static void leader(int[] array, int len)
    {
        Set<Integer> list = new HashSet<>();
        int max = 0;
        int markIndex;
        for(int index = 0; index < array.length-1;index++)
        {
            int currNum = array[index];
              for(int inner = index+1; inner< array.length;inner++)
              {
                  if(currNum<array[inner])
                  {
                      max = array[inner];
                      markIndex=index;
                      if(max>array[markIndex])
                      list.add(max);
                  }
              }
        }
        list.add(array[len-1]);
        System.out.println(list);
    }
    static void leaderArray(int[] array, int len)
    {
        int max = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = array.length-1;i>=0;i--)
        {
            if(i==array.length-1)
            {
                stack.push(array[i]);
            }
            if(!stack.isEmpty()&&stack.peek()<array[i])
            {
                stack.push(array[i]);
            }
        }
        System.out.println(stack);
    }
}

