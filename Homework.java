class Homework
{
    public static void main(String[] args)
    {
        int total = 0;
        String[] arr = new java.util.Scanner(System.in).nextLine().split(";");

        for (String s : arr)
        {
            if (s.contains("-"))
            {
                String[] tmp = s.split("-");
                {
                    total += Integer.parseInt(tmp[1]) - Integer.parseInt(tmp[0]) + 1;
                }
            }
            else
            {
                total++;
            }
        }

        System.out.println(total);
    }
}