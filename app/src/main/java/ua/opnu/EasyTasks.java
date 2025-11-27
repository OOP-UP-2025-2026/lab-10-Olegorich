package ua.opnu;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class EasyTasks {

    public static void main(String[] args) {
        // Для виконання лабораторної роботи необхідно написати вміст методів згідно умовам завдання,
        // після чого протестувати метод за допомогою тестів, які знаходяться в папці
        // src\test\TaskTest.java
    }

    public List<Integer> doubling(List<Integer> nums) {
        return nums.stream()
                .map(n -> n * 2)
                .toList();
    }

    public List<Integer> square(List<Integer> nums) {
        return nums.stream()
                .map(n -> n * n)
                .toList();
    }

    public List<String> moreY(List<String> strings) {
        return strings.stream()
                .map(string -> "y" + string + "y")
                .toList();
    }

    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n >= 0)
                .toList();
    }

    public List<Integer> no9(List<Integer> nums) {
        return nums.stream()
                .filter(n -> !(n % 10 == 9))
                .toList();
    }

    public List<String> noZ(List<String> strings) {
        return strings.stream()
                .filter(s -> {
                    char[] letters = s.toCharArray();

                    for (char letter : letters)
                        if (Objects.equals(letter, 'z'))
                            return false;

                    return true;
                })
                .toList();
    }

    public List<String> refinedStrings(List<String> strings) {
        return strings.stream()
                .distinct()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .toList();
    }

    public List<String> flatten(List<String> strings) {
        return strings.stream()
                .flatMap(str -> Arrays.stream(str.split(" ")))
                .toList();
    }

}