class VaccineEfficacy
{
    public void run()
    {
        Kattio sc = new Kattio(System.in);

        int n = sc.getInt();

        int controlTotal = 0;
        int vaccinatedTotal = 0;

        int[] control = new int[4];
        int[] vaccinated = new int[4];

        String s;
        int i;

        for (int j = 0; j < n; j++)
        {
            s = sc.getWord();
            if (s.charAt(0) == 'N')
            {
                controlTotal++;
                for (i = 1; i < 4; i++)
                {
                    if (s.charAt(i) == 'Y')
                    {
                        control[i]++;
                    }
                }
            }
            else
            {
                vaccinatedTotal++;
                for (i = 1; i < 4; i++)
                {
                    if (s.charAt(i) == 'Y')
                    {
                        vaccinated[i]++;
                    }
                }
            }
        }

        double ct = (double) controlTotal;
        double vt = (double) vaccinatedTotal;
        double controlPercentage, vaccinatedPercentage, efficacy;

        for (i = 1; i < 4; i++)
        {
            controlPercentage = control[i] / ct;
            vaccinatedPercentage = vaccinated[i] / vt;

            if (vaccinatedPercentage < controlPercentage)
            {
                efficacy = (controlPercentage - vaccinatedPercentage) / controlPercentage;
                sc.printf("%.6f\n", efficacy * 100);
            }   
            else
            {
                sc.println("Not Effective");
            }
        }

        sc.close();
    }

    public static void main(String[] args)
    {
        new VaccineEfficacy().run();
    }
}