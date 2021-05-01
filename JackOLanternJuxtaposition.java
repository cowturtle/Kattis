class JackOLanternJuxtaposition 
{
    public static void main(String[] args)
    {
        System.out.println(
            java.util.Arrays.stream(
                new java.util.Scanner(System.in)
                        .nextLine()
                        .split("\\s"))
                        .mapToInt(Integer::parseInt)                                    
                        .reduce(1, (x, y) -> x * y));        
    }
}