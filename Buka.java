import java.math.BigDecimal;

class Buka
{
    public static void main(String[] args)
    {
        Kattio sc = new Kattio(System.in);

        BigDecimal a = new BigDecimal(sc.getWord());
        BigDecimal total;

        if (sc.getWord().charAt(0) == '+')
        {
            total = a.add(new BigDecimal(sc.getWord()));
        }
        else
        {   
            total = a.multiply(new BigDecimal(sc.getWord()));
        }

        System.out.println(total);

        sc.close();
    }
}