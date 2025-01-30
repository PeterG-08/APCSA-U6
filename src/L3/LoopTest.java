package L3;

public class LoopTest
{
    public static void main(String[] args)
    {
        int[ ] values = {6, 2, 1, 7, 12, 5};

        // triple each element in the array
        for (int i = 0; i < values.length; i++)
        {
            values[i] *= 3;
        }

        // TEST!!!  Print out array to see if they changed
        System.out.println("Array after the loop: ");

        for (int val : values)
        {
            System.out.print(val + " ");
        }
    }
}
