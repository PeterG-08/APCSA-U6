package L2;

import java.util.Arrays;

public class ArrayRunner
{
    public static void main(String[] args)
    {
        int[] numArray =  {2, 6, 7, 12, 5};
        multAll(numArray, 2);
        printValues(numArray);
        System.out.println(Arrays.toString(numArray));
    }

    // Static helper methods
    public static void multAll(int[] values, int amt)
    {
        for (int i = 0; i < values.length; i++)
        {
            values[i] = values[i] * amt;
        }
    }

    public static void printValues(int[] values)
    {
        for (int i = 0; i < values.length; i++)
        {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }
}
