package recursion_task;

public class Recursion {

    private String regex = "(?i:[aeiouy]).*";

    public String recursionMethod(String s) {
        String result = "";
        if (s.isEmpty())
            return "";
        if (result.endsWith("*"))
            return "";
        else {
            char firstChar = s.charAt(0);
            String nextChar = recursionMethod(s.substring(1));

            if (firstChar == s.charAt(s.length() - 1) && nextChar.length() == 0)
                return firstChar + "";
            else if (s.matches(regex) == true) {
                if (firstChar == ' ')
                    return result = firstChar + nextChar;
                else if (firstChar != ' ' && nextChar.startsWith(" ") == false)
                    return result = firstChar + "*" + nextChar;
                else
                    return result = "*" + firstChar + nextChar;
            }
            else
                if (nextChar.matches(regex) && firstChar != ' ')
                    return result = firstChar +"*"+ nextChar;
                return result = firstChar + nextChar;
        }
    }
}