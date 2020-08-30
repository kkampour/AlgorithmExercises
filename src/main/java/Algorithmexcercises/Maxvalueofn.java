package Algorithmexcercises;

public class Maxvalueofn {
    public static int findMaxValue()
    {
        int res = 2;
        long fact = 2;
        while (true)
        {
            // when fact crosses its size, it gives negative value

            if (fact < 0)
                break;
            res++;
            fact = fact * res;
        }
        return res - 1;
    }


    public static void main(String[] args)
    {
        System.out.println("Maximum value of"+
                " integer " +
                findMaxValue());
    }


}
