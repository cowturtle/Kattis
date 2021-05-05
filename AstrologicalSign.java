import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.Map;
import java.util.HashMap;

class AstrologicalSign
{
    public static void main(String[] args)
    {        
        Kattio sc = new Kattio(System.in);

        int n = sc.getInt();

        while (n-- > 0)
            System.out.println(getSign(sc.getInt(), sc.getWord()));

        sc.close();
    }

    public static String getSign(int day, String month)
    {
        switch(month) 
        {
            case "Jan":
                return day < 21 ? "Capricorn" : "Aquarius";
            case "Feb":
                return day < 20 ? "Aquarius" : "Pisces";
            case "Mar":
                return day < 21 ? "Pisces" : "Aries";
            case "Apr":
                return day < 21 ? "Aries" : "Taurus";
            case "May":
                return day < 21 ? "Taurus" : "Gemini";
            case "Jun":
                return day < 22 ? "Gemini" : "Cancer";
            case "Jul":
                return day < 23 ? "Cancer" : "Leo";
            case "Aug":
                return day < 23 ? "Leo" : "Virgo";
            case "Sep":
                return day < 22 ? "Virgo" : "Libra";
            case "Oct":
                return day < 23 ? "Libra" : "Scorpio";
            case "Nov":
                return day < 23 ? "Scorpio" : "Sagittarius";
            case "Dec":
                return day < 22 ? "Sagittarius" : "Capricorn";
            default:
                return "?";
        }
    }
}