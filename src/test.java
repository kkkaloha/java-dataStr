import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        String s = "hsadf     sdf  d";
        String strs[] = s.split("\\s+");
        System.out.println(strs[strs.length-1].length());
        System.out.println(strs.length);

    }
}


