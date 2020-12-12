public class ExpressionsMatter {
    public static int expressionsMatter(int a, int b, int c) {
        int first = a * b * c;
        int second = a * b + c;
        int third = a * (b + c);
        int fourth = a + b + c;
        int fifth = (a + b) * c;
        int sixth = a + (b * c);

        int max = first;
        if (second > max)
            max = second;
        if (third > max)
            max = third;
        if (fourth > max)
            max = fourth;
        if (fifth > max)
            max = fifth;
        if (sixth > max)
            max = sixth;

        return max;
    }
}
