import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = { 1, 4, 5, 2, 34, 36, 5, 4, 23, 45, 6, 8, 56, 34, 37 };
        TreeSet<Integer> res = getNums(numbers);
        System.out.println(res); // [34, 36, 37, 45, 56]
    }

    public static TreeSet<Integer> getNums(Integer[] nums) {
        List<Integer> listOfNums = Arrays.asList(nums);
        TreeSet<Integer> treeSet = new TreeSet<Integer>(listOfNums);
        return (TreeSet<Integer>) treeSet.tailSet(25);
    }
}