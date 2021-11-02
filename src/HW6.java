import java.util.*;
import java.util.stream.Collectors;

import java.util.ArrayList;

import static java.util.Comparator.comparing;

public class HW6 {


    public static void main(String[] args) {
        System.out.println("first=" + first());
        System.out.println("second=" + second());
        System.out.println("third=" + third());
        System.out.println("forts=" + forts());
        System.out.println("fifths=" + fifths());
        System.out.println("six=" + six());
        System.out.println("sevenths=" + sevenths());
        System.out.println("eights=" + eights());
        System.out.println("nine=" + nine());
        System.out.println("ten=" + ten());
        System.out.println("eleven=" + eleven());
        System.out.println("twelve=" + twelve());
        System.out.println("first checking of regular expression - " + checkRegularExp1());
        System.out.println("second checking of regular expression - " + checkRegularExp2());
        System.out.println("third checking of regular expression - " + checkRegularExp3());
    }

    public static ArrayList<Integer> first() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(9);
        list1.add(2);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(11);
        list1.add(17);
        list1.add(22);
        list1.add(19);
        list1.add(1);
        list1.add(7);
        list1.add(10);
        list1.add(15);
        list1.add(100);

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) % 2 == 0) {
                result.add(list1.get(i));
            }
        }

        return result;
    }

    public static int second() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(9);
        list1.add(2);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(11);
        list1.add(17);
        list1.add(22);
        list1.add(19);
        list1.add(1);
        list1.add(7);
        list1.add(10);
        list1.add(15);
        list1.add(100);

        int temp = 0;
        for (int j = 0; j < list1.size(); j++) {
            if (list1.get(j) % 2 != 0) {
                temp = temp + 1;
            }
        }
        return temp;
    }

    public static ArrayList<Integer> third() {
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(8);
        list2.add(9);
        list2.add(12);
        list2.add(2);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(10);

        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int k = 0; k < list2.size() / 2; k++) {
            result.add(list2.get(k));
        }
        return result;


        //3.2
        //list2.stream().limit(5).forEach(System.out::print);
        //System.out.println();
    }

    public static ArrayList<Integer> forts() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(9);
        list1.add(2);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(11);
        list1.add(17);
        list1.add(22);
        list1.add(19);
        list1.add(1);
        list1.add(7);
        list1.add(10);
        list1.add(15);
        list1.add(100);

        Collections.sort(list1);

        ArrayList<Integer> result = list1;
        return result;

    }

    public static ArrayList<Integer> fifths() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(9);
        list1.add(2);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(11);
        list1.add(17);
        list1.add(22);
        list1.add(19);
        list1.add(1);
        list1.add(7);
        list1.add(10);
        list1.add(15);
        list1.add(100);

        list1.sort((a, b) -> Double.compare(b, a));
        ArrayList<Integer> result = list1;
        return result;


    }

    public static List<Integer> six() {
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(2);
        list3.add(2);
        list3.add(3);
        list3.add(5);
        list3.add(5);
        list3.add(6);
        list3.add(8);
        list3.add(8);
        list3.add(10);
        list3.add(10);
        List<Integer> result = list3.stream().distinct().collect(Collectors.toList());
        return result;

    }

    public static List<String> sevenths() {

        List<Integer> list4 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 13);
        List<String> stringsFromINT = list4.stream().map(Object::toString)
                .collect(Collectors.toList());
        stringsFromINT.stream().findAny().orElse("1");
        return stringsFromINT;
    }

    public static int eights() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(81);
        list.add(1);
        list.add(102);
        list.add(0);
        list.add(60);
        list.add(70);
        list.add(8);
        list.add(9);
        list.add(10);

        int result = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > 30) {
                result = list.get(i);
                break;
            }
        }
        return result;
    }

    public static String nine() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(22);
        list.add(39);
        list.add(51);
        list.add(15);
        list.add(26);
        list.add(38);
        list.add(83);
        list.add(0);
        list.add(120);

        Integer max = list.stream().max(Comparator.naturalOrder()).get();
        Integer min = list.stream().min(Comparator.naturalOrder()).get();

        String result = "maximum = " + max + "minimum = " + min;
        return result;

    }

    public static String ten() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(9);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(11);
        list.add(17);
        list.add(22);
        list.add(19);
        list.add(1);
        list.add(7);
        list.add(10);
        list.add(15);
        list.add(100);

        int p = list.stream().mapToInt((s) -> Integer.parseInt(String.valueOf(s))).sum();
        OptionalDouble d = list.stream().mapToInt((s) -> Integer.parseInt(String.valueOf(s))).average();

        String result = "sum = " + p + "midle value = " + d;
        return result;

    }

    public static ArrayList<String> eleven() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Hi");
        list.add("Hello!");
        list.add("Privet");
        list.add("Hello");
        list.add("Chao");
        list.add("Salut!");
        list = (ArrayList) list.stream().distinct().collect(Collectors.toList());

        for (int i = 0; i < list.size(); i++) {
            String newValue = list.get(i).toUpperCase(Locale.ROOT);
            list.set(i, newValue);
        }
        return list;

    }

    public static ArrayList<String> twelve() {
        Person a = new Person("Petrov", 30);
        Person b = new Person("Ivanov", 10);
        Person c = new Person("Sidorov", 55);
        Person d = new Person("Vasiliyev", 90);
        List<Person> persons = new ArrayList<>();
        persons.add(a);
        persons.add(b);
        persons.add(c);
        persons.add(d);

        ArrayList<String> result = new ArrayList<>();

        for (Person person : persons) {
            if (person.age >= 30) {
                result.add(person.getSurname());
            }
        }
        return result;
    }

    public static boolean checkRegularExp1() {
        String text1 = "ahb acb aeb aeeb adcb axeb";
        boolean result1 = text1.matches("a.*b");
        return result1;
    }

    public static boolean checkRegularExp2() {
        String text2 = "aa aba abba abbba abca abea";
        boolean result2 = text2.equals("ab.*a+");
        return result2;
    }

    public static List<String> checkRegularExp3() {

        String text3 = "+ *q+ *qq+ *qqq+ *qqq qqq+";

        List<String> splitedString = new ArrayList<>(Arrays.asList(text3.split("\\s")));
        List<String> result = splitedString.stream().filter(e -> e.matches("^\\*q{0,3}\\+")).collect(Collectors.toList());

        return result;
    }

}
