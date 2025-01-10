package L1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] heights = new int[3];

        heights[0] = 78;
        heights[1] = 72;
        heights[2] = 69;

        String[] names = new String[] {
                "Abby",
                "David",
                "Charlie",
                "Lauren"
        };

        names[1] = "Charlie";
        names[2] = "David";

        for (String name : names) {
            System.out.println(name);
        }

        double[] array1 = new double[] {
                7.5,
                10.0
        };

        double[] array2 = new double[] {
                8.2,
                14.8
        };

        double[] array3 = new double[] {
                array1[0] + array2[0],
                array1[1] * array2[1]
        };

        for (double num : array3) {
            System.out.println(num);
        }
    }
}