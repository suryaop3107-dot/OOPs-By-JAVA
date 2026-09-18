import java.util.*;

public class casestudy10 {

    // Students in BOTH
    public static Set<Integer> commonStudents(
            Set<Integer> javaStudents,
            Set<Integer> pythonStudents) {

        Set<Integer> result = new HashSet<>(javaStudents);
        result.retainAll(pythonStudents);
        return result;
    }

    // Students in EITHER
    public static Set<Integer> allStudents(
            Set<Integer> javaStudents,
            Set<Integer> pythonStudents) {

        Set<Integer> result = new HashSet<>(javaStudents);
        result.addAll(pythonStudents);
        return result;
    }

    // Students ONLY in Java
    public static Set<Integer> onlyJava(
            Set<Integer> javaStudents,
            Set<Integer> pythonStudents) {

        Set<Integer> result = new HashSet<>(javaStudents);
        result.removeAll(pythonStudents);
        return result;
    }

    // Students in NEITHER
    public static Set<Integer> neitherStudents(
            Set<Integer> allStudents,
            Set<Integer> javaStudents,
            Set<Integer> pythonStudents) {

        Set<Integer> result = new HashSet<>(allStudents);
        result.removeAll(javaStudents);
        result.removeAll(pythonStudents);
        return result;
    }

    public static void main(String[] args) {

        Set<Integer> allStudents =
                new HashSet<>(
                    Arrays.asList(101, 102, 103, 104, 105, 106, 107, 108));

        Set<Integer> javaStudents =
                new HashSet<>(
                    Arrays.asList(101, 102, 103, 104));

        Set<Integer> pythonStudents =
                new HashSet<>(
                    Arrays.asList(103, 104, 105, 106));

        System.out.println("Both: "
                + commonStudents(javaStudents, pythonStudents));

        System.out.println("Either: "
                + allStudents(javaStudents, pythonStudents));

        System.out.println("Only Java: "
                + onlyJava(javaStudents, pythonStudents));

        System.out.println("Neither: "
                + neitherStudents(allStudents, javaStudents, pythonStudents));
    }
}