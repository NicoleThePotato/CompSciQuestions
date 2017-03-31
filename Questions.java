public class Questions {
    public static void main(String[] args) {
        questions.add("1) Consider the following" +
                "\n\n\tint var = 12;" +
                "\n\tvar = var % 7;" +
                "\n\tvar - -;" +
                "\n\tSystem.out.println(var);" +
                "\n\n\tWhat is printed as a result of executing the code segement?"); // 1

        a.add("0"); // 1
        b.add("1"); // 1
        c.add("2"); // 1
        d.add("4"); // 1
        e.add("5"); // 1
        correct.add("C"); // 1
        questions.add("2) Consider the following code segement" +
                "\n\n\tint count = 1;" +
                "\n\tint value = 31;" +
                "\n\twhile (value >= 10){" +
                "\n\t\tvalue = value - count;" +
                "\n\t}" +
                "\n\tSystem.out.println(value);" +
                "\n\n\tWhat is printed as a result of executing the code segement?"); // 2
        a.add("8"); // 2
        b.add("9"); // 2
        c.add("11"); // 2
        d.add("31"); // 2
        e.add("13"); // 2
        correct.add("B"); // 2
        questions.add("3) public class TestReport{" +
                "\n\tprivate double score;" +
                "\n\t//Constructor. Sets score to the specified value." +
                "\n\tpublic TextReport(double value){" +
                "\n\t\tscore = value;" +
                "\n\t}" +
                "\n\t//Prints grade and comment." +
                "\n\tpublic void printGrade(){" +
                "\n\t\tif(score >= 90.0){" +
                "\n\t\t\tSystem.out.println('A. Congratulation!');" +
                "\n\t\t}" +
                "\n\t\tif(score >= 80.0){" +
                "\n\t\t\tSystem.out.println('B. Good job.');" +
                "\n\t\t}" +
                "\n\t\tif (score >= 70.0){" +
                "\n\t\t\tSystem.out.println('C. Average Score.');" +
                "\n\t\t}" +
                "\n\t\tif (score >= 60.0){" +
                "\n\t\t\tSystem.out.println('D. Barely passing.');" +
                "\n\t\t}" +
                "\n\t\tif (score <= 50.0){" +
                "\n\t\t\tSystem.out.println('F. Failing score.');" +
                "\n\t\t}" +
                "\n\t}" +
                "\n\n\tConsider the following as a segement of a client program." +
                "\n\n\tdouble testScore = IO.readInput();  //read user input" +
                "\n\tTestReport t = new TestReport(testScore);" +
                "\n\tt.printGrade();" +
                "\n\n\tIf the user inputs 75.0, what will be the output?"); // 3
        a.add("D. Barely passing." +
                "\nF. Failing score."); // 3
        b.add("C. Average Score." +
                "\nD. Barely passing." +
                "\nF. Failing score."); // 3
        c.add("C. Average Score."); // 3
        d.add("Congratulations!" +
                "\nGood job" +
                "\nAverage score"); // 3
        e.add("An error will be output"); // 3
        correct.add("B"); // 3
        questions.add("Consider the following code segment \n" +
                "\n" +
                "\n" +
                "\n" +
                "public class PiggyBank\n" +
                "\n" +
                "{\n" +
                "\n" +
                "private double total;\n" +
                "\n" +
                "private boolean isFull;\n" +
                "\n" +
                "\n" +
                "\n" +
                "//Increase total by amt.\n" +
                "\n" +
                "public void incrementTotal(double amt)\n" +
                "\n" +
                "{ /* implementation of incrementTotal */ }\n" +
                "\n" +
                "\n" +
                "\n" +
                "//Change the value of isFull:\n" +
                "\n" +
                "//If its current value is true, change it to false.\n" +
                "\n" +
                "//If its current value is false, change it to true.\n" +
                "\n" +
                "public void changePiggyState()\n" +
                "\n" +
                "{ /* implementation of changePiggyState */ }\n" +
                "\n" +
                "//Constructors and other methods not shown.\n" +
                "\n" +
                "}" +
                "\n" +
                "\nAssuming that the PiggyBank class has an accessor method getTotal that returns total, which is a " +
                "correct /* implementation of incrementTotal */?"); // 4
        a.add("return total + amt;"); // 4
        b.add("return getTotal() + amt;"); // 4
        c.add("total +=  amt;"); // 4
        d.add("getTotal += amt;"); // 4
        e.add("total = amt;"); // 4
        correct.add("C"); // 4
        questions.add("A programmer needs to produce a random real value x in the range 20.0 ≤ x < 30.0." +
                " A statement that does this correctly is\n"); // 5
        a.add("double x = Math.random( 20, 30);"); // 5
        b.add("double x = Math.random(30) - 10;"); // 5
        c.add("double x = Math.random(20) +10;"); // 5
        d.add("double x = 10*Math.random( ) + 20;"); // 5
        e.add("double x = 20*Math.random  ( ) = 10;"); // 5
        correct.add("D"); // 5
        questions.add("Which best describes what the printSomething method below does?\n" +
                "\n" +
                "\n" +
                "\n" +
                "public void printSomething(String s)\n" +
                "\n" +
                "{\n" +
                "\n" +
                "if (s.length() > 0)\n" +
                "\n" +
                "{\n" +
                "\n" +
                "System.out.print(s.substring(0, 1));\n" +
                "\n" +
                "printSomething(s.substring(1));\n" +
                "\n" +
                "}\n" +
                "\n" +
                "}"); // 6
        a.add("It prints string s"); // 6
        b.add("It prints string s in reverse order"); // 6
        c.add("It only prints the first character of string s"); // 6
        d.add("It prints only the first two characters of string s"); // 6
        e.add("It prints only the last character of string s"); // 6
        correct.add("A"); // 6
        questions.add("Refer to the following method that finds the largest value in an array:\n" +
                "\n" +
                "\n" +
                "\n" +
                "/** Precondition:  arr is initialized with int values.\n" +
                "\n" +
                " *  Postcondition: Returns the largest value in arr.\n" +
                "\n" +
                " */\n" +
                "\n" +
                "public static int findMax(int[] arr)\n" +
                "\n" +
                "{\n" +
                "\n" +
                "int max = /* some value */;\n" +
                "\n" +
                "int index = 0;\n" +
                "\n" +
                "while (index < arr.length)\n" +
                "\n" +
                "{\n" +
                "\n" +
                "if (arr[index] > max)\n" +
                "\n" +
                "max = arr[index];\n" +
                "\n" +
                "index++;\n" +
                "\n" +
                "}\n" +
                "\n" +
                "return max;\n" +
                "\n" +
                "}\n" +
                "\n" +
                "\n" +
                "\n" +
                "Which replacement(s) for /* some value */ will always result in correct execution of the findMax " +
                "method?" +
                "\nI) Integer.MIN_VALUE" +
                "\n" +
                "II) Integer.MAX_VALUE\n" +
                "\n" +
                "III)  arr[0]"); // 7
        a.add("I only"); // 7
        b.add("II only"); // 7
        c.add("III only"); // 7
        d.add("I and III only"); // 7
        e.add("II and III only"); // 7
        correct.add("D"); // 7
        questions.add("An opera company has a large list of donor records, sorted alphabetically by name. Each" +
                " record contains the amount of money donated in the current year. Which of the following " +
                "represents the most efficient way to find the name of the top donor in the current year?"); // 8
        a.add("Insertion sort of the records"); // 8
        b.add("Selection sort of the records"); // 8
        c.add("Merge sort of the records"); // 8
    }
}
