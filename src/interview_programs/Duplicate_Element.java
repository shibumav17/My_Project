package interview_programs;

public class Duplicate_Element {

    public static void main(String[] args) {
        String arr [] = {"hero", "honda", "bajaj","tata","hero","tvs","maruti","bajaj"};
        boolean value = false;
        for (int i = 0; i<arr.length; i++) {
            for(int j = i+1; j<arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate Element is : " + arr[i]);
                    value = true;
                }
            }
        }
        if (value==false) {
            System.out.println("NO duplicate element found");
        }

    }
}
