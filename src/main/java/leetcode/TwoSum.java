package leetcode;

import java.util.Arrays;

class Element implements Comparable<Element> {

    int index, value;

    Element(int index, int value) {
        this.index = index;
        this.value = value;
    }

    public int compareTo(Element e) {
        return this.value - e.value;
    }
}

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        Element[] elements = new Element[nums.length];
        for (int i = 0; i < nums.length; i++) {
            elements[i] = (new Element(i, nums[i]));
        }

        Arrays.sort(elements);

        int indices[] = new int[2];
        int i = 0;
        int j = elements.length;
        while (elements[--j].value > target) ;

        while (i < j) {

            int sum = elements[i].value + elements[j].value;

            if (sum == target) {
                indices[0] = elements[i].index;
                indices[1] = elements[j].index;
                break;
            } else if (sum > target)
                j--;
            else
                i++;
        }
        return indices;
    }
}
