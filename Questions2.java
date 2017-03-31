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
        
         questions.add("Refer to the following code segment:\n" +
                "\n" +
                "\n" +
                "\n" +
                "int n = < some positive integer >;\n" +
                "\n" +
                "for (int i = n; i > 0; i -= 2)\n" +
                "\n" +
                "{\n" +
                "\n" +
                "process(i);\n" +
                "\n" +
                "}\n" +
                "\n" +
                "\n" +
                "\n" +
                "In terms of n, how many times will process(i) be executed?"); // 9
        a.add("n if n is even and n + 1 if n is odd"); // 9
        b.add("2n if n is even and 2n -1 if n is odd"); // 9
        c.add("n/2 if n is even and 1 +  if n/2 is odd"); // 9
        d.add("2n if n is even and 2n  +1 if n is odd"); // 9
        e.add("n/2 if n is even and 1 -  if n/2 is odd"); // 9
        correct.add("C"); // 9
        questions.add("A square matrix is declared as\n" +
                "\n" +
                "\n" +
                "\n" +
                "int[][] mat = new int[SIZE][SIZE];\n" +
                "\n" +
                "\n" +
                "\n" +
                "where SIZE is an appropriate integer constant. Consider the following method:\n" +
                "\n" +
                "\n" +
                "\n" +
                "public static void sum(int[][] mat)\n" +
                "\n" +
                "{\n" +
                "\n" +
                "int total = 0;\n" +
                "\n" +
                "for (int r = 0; r < mat.length; r++)\n" +
                "\n" +
                "for (int c = 0; c <= r; c++)\n" +
                "\n" +
                "total += mat[r][c];\n" +
                "\n" +
                "return total;\n" +
                "\n" +
                "}\n" +
                "\n" +
                "\n" +
                "\n" +
                "If mat is initialized to be\n\n" +
                "\n" +
                "If mat is initialized to be\n" +
                "\n" +
                "2  6  3\n" +
                "\n" +
                "4  5  1\n" +
                "\n" +
                "7  1  2\n\n" +
                "\n" +
                "what value will be returned by a call to sum(mat)?"); // 10
        a.add("9"); // 10
        b.add("15"); // 10
        c.add("18"); // 10
        d.add("21"); // 10
        e.add("14"); // 10
        correct.add("D"); // 10
        
        
    questions.add( "11) \n"+
            "4 5 6 2 1\n"+
            "\n"+
            "Which of the following statements will cause an error?");//11

            a.add(" list.add(5); "); // 11
            b.add("list.add( 2, 4); "); // 11
            c.add("Integer int0b = list.get(5); "); // 11
            d.add("Object ob = list.add( 5 ,7); "); // 11
            e.add(" Integer x = list.set( 3, 0); "); // 11
            correct.add("C"); //11





            questions.add (" 12)Refer to method insert below:\n"+
            "\n"+
            "/** Precondition:  List list is an ArrayList that contains\n"+
            " *               Integer values sorted in decreasing order.\n"+
            " *  Postcondition: Element inserted in its correct position in list.\n"+
            " */\n"+
            "public void insert(List<Integer> list, Integer element)\n"+
            "{\n"+
            "\tint index = 0;\n"+
            "\twhile (element.compareTo(list.get(index)) < 0)\n"+
            "\t\tindex++;\n"+
            "\tlist.add(index, element);\n"+
            "}\n"+
            "\n"+
            "Suppose that the element to be inserted has value −8. For which list will the method work as intended?\n"+
            "\n"+
            "I) 8 4 0 −4\n"+
            "\n"+
            " II) −2 −4 −6 −9\n"+
            "\n"+
            "III)   −1 −2 −4 −6\n ");//12

            a.add("I only "); // 12
            b.add(" II only "); // 12
            c.add("III only "); // 12
            d.add("II and III only  "); // 12
            e.add("I, II, and III "); // 12
            correct.add("B"); //12

        questions.add ("13) Refer to the following declarations:\n"+
            "\n"+
            "String[] birds = {\"robin\", \"parrot\", \"bluejay\"};\n"+
            "List<String> birdList = new ArrayList<String>();\n"+
            "\n"+
            "Which of the following correctly assigns the elements of the birds array to birdList? The final ordering need not be the same as in the birds array.\n"+
            "\n"+
            "I) for (String b: birds)\n"+
            "\t birdList.add(b);\n"+
            "\n"+
            " II) for (String b: birdList)\n"+
            "\t birds.add(b);\n"+
            "\n"+
            "III) for (int i = birds.length - 1; i >= 0; i--)\n"+
            "\t birdList.add(i, birds[i]);\n");
            a.add("I only ")//13
            b.add("II only ")//13
            c.add(" III only ")//13
            d.add("II and III only ")//13
            e.add("I, II, and III ")//13
            correct.add("A"); // 13

            questions.add("14)The elements of array arr are to be sorted in increasing order. Which represents the first step of a mergesort algorithm? "); // 14
            a.add(" Fine the smallest in arr and swap it into arr[0] ")//14
            b.add(" compare arr [0] with arr[1] ")//14
            c.add("compare arr[0] with te middle element of arr, arr[mid] ")//14
            d.add(" compare the first and last element ")//14
            e.add(" Break the array into roughly two equal halves ")//14
            correct.add("E");//14


            questions.add( "15) Consider the following recursive method:\n"+
            "\n"+
            "/** Precondition:  n >= 0 */\n"+
            "public static void printMystery(int n)\n"+
            "{\n"+
            "\tif(n >= 0 && n < 10)\n"+
            "\t\tSystem.out.print(n);\n"+
            "\telse\n"+
            "\t{\n"+
            "\t\tprintMystery(n / 10);\n"+
            "\t\tSystem.out.print(\" \");\n"+
            "\t\tSystem.out.print((n % 10) / 2);\n"+
            "\t}\n"+
            "}\n"+
            "\n"+
            "What will be output by the following method call?\n"+
            "\n"+
            "printMystery(987);")

            a.add("9 4 3 "); // 15
            b.add("3 4 9 "); // 15
            c.add("7 4 2  "); // 15
            d.add("4 4 3 "); // 15
            e.add("9 5 6 "); // 15
            correct.add("A"); //15

        questions.add("16)\n"+
            "A programmer plans to write a program that simulates a small card game (no more than four players). Each player will have a hand of ten cards, where each card has a suit and a value. The game will involve either adding cards to a hand, or discarding cards. The first player to have zero cards left in his hand is the winner. In the simulation, as the game is in progress, each player's hand is displayed on the screen.\n"+
            "\n"+
            "The programmer plans to have a short driver class whose main method has just two statements:\n"+
            "\n"+
            "Game g = new Game();\n"+
            "g.playCards();\n"+
            "\n"+
            "The Game class will have several objects: a Display, a Deck, a Card, and a PlayerGroup. The PlayerGroup will have a list of Players, and each Player will have a Hand of Cards.\n"+
            "\n"+
            "The relationship between the Player and Hand classes is an example of\n");//16

           a.add("Inheritance "); //16
            b.add("top-down design "); //16
            c.add("information hiding "); //16
            d.add("independent classes  "); //16
            e.add("composition "); //16
           correct.add("E"); //16


        questions.add("17)\n"+
            "\tConsider the problem of writing a game in which a user thinks of an integer from 1 to 1000 inclusive and the computer tries to guess that number. Each time the computer makes a guess, the user makes one of three responses:\n"+
            "\n"+
            "\"lower\" (i.e., the number is lower than the computer's guess)\n"+
            "\"higher\" (i.e., the number is higher than the computer's guess)\n"+
            "\"you got it in < however many > tries!\"\n"+
            "\n"+
            "Suppose the game is programmed so that the computer uses a binary search strategy for making its guesses. What is the maximum number of guesses the computer could make before guessing the user's number?\n");//17
             a.add(" 10 "); //17
            b.add("189 "); //17
            c.add("100 "); //17
            d.add("14 "); //17
            e.add("201 "); //17
            correct.add("A");//17
            
            questions.add("Suppose the characters 0, 1, ... , 8, 9, A, B, C, D, E, F are used to represent a" +
                " hexadecimal (base-16) number. Here A = 10, B = 11,..., F = 15. Which of the following hexadecimal " +
                "numbers represents the base-10 integer 93?"); // 18
        a.add("52"); // 18
        b.add("D3"); // 18
        c.add("5D"); // 18
        d.add("F3"); // 18
        e.add("7C3"); // 18
        correct.add("C"); // 18
        questions.add("Suppose a and b are boolean variables. The expression\n" +
                "\n" +
                "\n" +
                "\n" +
                "!a && !b\n" +
                "\n" +
                "\n" +
                "\n" +
                "will evaluate to false whenever\n" +
                "\n" +
                "\n" +
                "\n" +
                "I) a and b are both false.\n" +
                "\n" +
                "\n" +
                "\n" +
                " II) a is false and b is true.\n" +
                "\n" +
                "\n" +
                "\n" +
                " II) a is true and b is false.\n" +
                "\n"); // 19
        a.add("I only"); // 19
        b.add("II only"); // 19
        c.add("III only"); // 19
        d.add("II and III only"); // 19
        e.add("I, II, and III"); // 19
        correct.add("D"); // 19
        questions.add("Which is a false statement about static methods?"); // 20
        a.add("A static method can use a static variable in its implementation code"); // 20
        b.add("If a class is such that it doesn't make sense to ever create an object of the class"); // 20
        c.add("All methods in a driver class that has a man method should be static"); // 20
        d.add("A static method cannot be invoked by an object of a class") // 20
        e.add("Accessor methods in an object class may be static, depending on the value that’s being accessed"); // 20
        correct.add("E"); // 20
    }
       }
