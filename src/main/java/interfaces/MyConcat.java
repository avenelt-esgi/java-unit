package interfaces;

public class MyConcat implements Concatenate {

    @Override
    public String concat(String start, String end) {
        // non-optimized version
        return start + end;

        // optimized version
        /*
        StringBuilder result = new StringBuilder();
        result.append(start);
        result.append(end);
        return result.toString();
         */
    }
}
