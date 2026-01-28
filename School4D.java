public class School4D {
    public static void main(String[] args) {

        // [class][student][exam][subject]
        int[][][][] marks = {
            {   // Class 1
                {   // Student 1
                    {85, 90, 88},   // Exam 1
                    {87, 92, 89}    // Exam 2
                },
                {   // Student 2
                    {78, 82, 80},
                    {80, 85, 83}
                }
            },
            {   // Class 2
                {   // Student 1
                    {92, 95, 93},
                    {94, 97, 96}
                },
                {   // Student 2
                    {70, 75, 72},
                    {73, 78, 76}
                }
            }
        };

        // Display data
        for (int c = 0; c < marks.length; c++) {
            System.out.println("Class " + (c + 1));
            for (int s = 0; s < marks[c].length; s++) {
                System.out.println(" Student " + (s + 1));
                for (int e = 0; e < marks[c][s].length; e++) {
                    System.out.print("  Exam " + (e + 1) + ": ");
                    for (int sub = 0; sub < marks[c][s][e].length; sub++) {
                        System.out.print(marks[c][s][e][sub] + " ");
                    }
                    System.out.println();
                }
            }
            System.out.println();
        }
    }
}
