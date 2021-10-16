package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

    public static boolean compareTwoLists(ArrayList<String> list, ArrayList<String> list2, ArrayList<String> list3) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list.get(i).equals(list2.get(j)) == true) {
                    list3.add(list.get(i));
                }
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {

        //Task_10
        List<Box> results = new ArrayList<Box>();
        FileInputStream fis = new FileInputStream("C:\\Users\\ольга\\IdeaProjects\\hw5\\src\\com\\company\\Files\\OUTPUT.txt-9task");
        ObjectInputStream ois = new ObjectInputStream(fis);

        try {
            results = (List<Box>) ois.readObject();
        } catch (OptionalDataException e) {
            if (!e.eof)
                throw e;
        } finally {
            ois.close();
        }

        for (int i = 0; i < results.size(); i++) {
            Box box = results.get(i);
            Box box2 = results.get(i + 1);
            if (box.getVolume(box) > box2.getVolume(box2)) {
               box2 = box;
               box = box2;
            }
        }

        System.out.println(results);

        Box box = new Box();
        FileOutputStream fout = new FileOutputStream("C:\\Users\\ольга\\IdeaProjects\\hw5\\src\\com\\company\\Files\\OUTPUT.txt-9task");
        ObjectOutputStream oos = new ObjectOutputStream(fout);
        oos.writeObject(results.get(4).getVolume(box));
        oos.close();


        //Task_9
        /*List<Box> list = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            Box box = new Box((int) (Math.random() * 100),
                              (int) (Math.random() * 100),
                              (int) (Math.random() * 100));
            list.add(box);
        }


        FileOutputStream fout = new FileOutputStream("C:\\Users\\ольга\\IdeaProjects\\hw5\\src\\com\\company\\Files\\OUTPUT.txt-9task");
        ObjectOutputStream oos = new ObjectOutputStream(fout);
        oos.writeObject(list);
        oos.close();*/


        //Task_8
      /* BufferedReader bufReader1 = new BufferedReader(new FileReader("C:\\Users\\ольга\\IdeaProjects\\hw5\\src\\com\\company\\Files\\INPUT_1.txt-8task"));
        BufferedReader bufReader2 = new BufferedReader(new FileReader("C:\\Users\\ольга\\IdeaProjects\\hw5\\src\\com\\company\\Files\\INPUT_2.txt-8task"));

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        String line = bufReader1.readLine();

        while (line != null) {
            list1.add(line);
            line = bufReader1.readLine();
        }

        bufReader1.close();

        String line2 = bufReader2.readLine();

        while (line2 != null) {
            list2.add(line2);
            line2 = bufReader2.readLine();
        }

        bufReader2.close();

        ArrayList<String> list3 = new ArrayList<>();
        compareTwoLists(list1, list2, list3);

        FileWriter writer = new FileWriter("C:\\Users\\ольга\\IdeaProjects\\hw5\\src\\com\\company\\Files\\OUTPUT.txt-8task");

        for(String str: list3) {
            writer.write(str + System.lineSeparator());
        }

        writer.close(); */


        //Task_7
      /*  BufferedReader bufReader = new BufferedReader(new FileReader("C:\\\\Users\\\\ольга\\\\IdeaProjects\\\\hw5\\\\src\\\\com\\\\company\\\\Files\\\\INPUT.txt-7task"));
        ArrayList<String> list = new ArrayList<>();
        String line = bufReader.readLine();

        while (line != null) {
            list.add(line);
            line = bufReader.readLine();
        }

        bufReader.close();
        Collections.reverse(list);

        FileWriter writer = new FileWriter("C:\\Users\\ольга\\IdeaProjects\\hw5\\src\\com\\company\\Files\\OUTPUT.txt-7task");

        for(String str: list) {
            writer.write(str + System.lineSeparator());
        }

        writer.close(); */




        //  Task_4
      /* int number;
        SortedSet sortedSet = new TreeSet();
        Pattern pattern1 = Pattern.compile("stop");
        Pattern pattern2 = Pattern.compile("status");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, input the numbers: ");

        while (true) {
            if (scanner.hasNext(pattern1)) {
                break;
            } else if (scanner.hasNext(pattern2)) {
                System.out.println(sortedSet);
                break;
            } else if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                sortedSet.add(number);
            } else {
                System.out.println("Input the correct data.");
                scanner.next();
            }
        } */


        //Task_3
     /* int number = 0;
        int countNumbers = 0;
        double average;
        Pattern pattern1 = Pattern.compile("stop");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, input the numbers: ");

        while (true) {
            if (scanner.hasNext(pattern1)) {
                average = (double) number / countNumbers;
                System.out.println(average);
                break;
            } else if (scanner.hasNextInt()) {
                number += scanner.nextInt();
                countNumbers++;
            } else {
                System.out.println("Input the correct data.");
                scanner.next();
            }
        } */


        //Task_2
     /* int[][] array1 = new int[3][3];
        int[][] array2 = new int[3][3];
        int[][] arrayResult = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the elements of the first and the second matrix: ");

        try {
            if (!scanner.hasNextInt()) {
                System.out.println("Please, input a number.");
                scanner.next();
            }

            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array1[i].length; j++) {
                    array1[i][j] = scanner.nextInt();
                }
            }

            for (int i = 0; i < array2.length; i++) {
                for (int j = 0; j < array2[i].length; j++) {
                    array2[i][j] = scanner.nextInt();
                }
            }

        } catch (NumberFormatException e) {
            System.out.println("Try to input correct data.");
        }

        for (int i = 0; i < arrayResult.length; i++) {
            for (int j = 0; j < arrayResult[i].length; j++) {
                arrayResult[i][j] = array1[i][j] * array2[i][j];
            }
        }

        System.out.println("Result matrix is: " + Arrays.deepToString(arrayResult));*/


        // Task_1
        /* String str;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, input a string.");
        str = scanner.nextLine();
        System.out.println("You input a string: " + str); */

    }

}
