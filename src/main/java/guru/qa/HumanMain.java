package guru.qa;

import java.util.*;

import static java.util.Arrays.asList;

public class HumanMain {

    public static void main(String[] args) {
        String[] hobbies = new String[3];
        hobbies[0] = "Футбол";
        hobbies[1] = "Java";
        hobbies[2] = "Гражданская оборона";

        String[] hobbiesAnother = new String[] {
            "Футбол", "Java", "Гражданская оборона"
        };
        int length = hobbiesAnother.length;
        asList(hobbiesAnother).contains("Java");

        // Демонстрация 3-х мерного массива
        int[][][] intArray = new int[][][] {
                new int[][] {
                        new int[] {1, 2, 3}
                },
                new int[][] {
                        new int[] {10, 20, 30}
                }
        };


        List<String> hobbiesList = new ArrayList<>();
        hobbiesList.add("Футбол");
        hobbiesList.add("Java");
        hobbiesList.add("Гражданская оборона");

        List<String> hobbiesListAnother = List.of(
            "Футбол", "Java", "Гражданская оборона"
        );


        Set<String > hobbiesSet = new HashSet<>();
        hobbiesSet.add("Футбол");
        hobbiesSet.add("Java");
        hobbiesSet.add("Гражданская оборона");

        Set<String> hobbiesSetAnother = Set.of(
            "Футбол", "Java", "Гражданская оборона"
        );

        Human dima = new Human("Дима", 33, hobbies);
        Human dima1 = new Human("Дима", 33, hobbies);
        boolean equals = dima.equals(dima1);
        System.out.println("Equals: " + equals);
        System.out.println("HashCode_1: " + dima.hashCode());
        System.out.println("HashCode_2: " + dima1.hashCode());


        Map<String, Human> humans = new HashMap<>();
        humans.put("1234545", dima);
        humans.put("1234555", dima1);


        System.out.println("\nОбычный цикл:");
        for(int i = 0; i < hobbies.length; i++) {
            System.out.println(hobbies[i]);
        }

        System.out.println("\nЦикл перебора элементов с String[]:");
        for(String hobby: hobbies) {
            System.out.println(hobby);
        }

        System.out.println("\nЦикл перебора элементов с List<String>:");
        for(String hobby: hobbiesList) {
            System.out.println(hobby);
        }

        boolean arrayContainJava = false;
        int index = 0;
        while(!arrayContainJava && (index < hobbies.length)) {
            if(hobbies[index].equals("Java")) {
                arrayContainJava = true;

//                continue; // перейдет к следующей итерации, не доделав текущую
//                break;    // выход из цикла
//                return;   // выход из метода
            }
            index++;
        }

        do {
            if(hobbies[index].equals("Java")) {
                arrayContainJava = true;
            }
            index++;
        } while(!arrayContainJava && (index < hobbies.length));
    }
}
