import java.util.TreeMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;

class CourseScheduling
{
    class Student 
    {
        private String firstName;
        private String lastName;

        public Student(String firstName, String lastName)
        {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        @Override
        public int hashCode()
        {
            return 17 * (this.firstName.hashCode() + this.lastName.hashCode()) / 3;
        }

        @Override
        public boolean equals(Object obj)
        {
            if (this == obj)
            {
                return true;
            }
            else if (obj instanceof Student)
            {
                Student s = (Student) obj;
                return s.firstName.equals(this.firstName) && s.lastName.equals(this.lastName);
            }
            return false;
        }
    }

    public void run()
    {
        Kattio sc = new Kattio(System.in);
        
        int n = sc.getInt();
        Map<String, Set<Student>> tmap = new TreeMap<>();

        Student s;
        String c;
        while (n-- > 0)
        {
            s = new Student(sc.getWord(), sc.getWord());
            c = sc.getWord();

            if (tmap.containsKey(c))
            {
                tmap.get(c).add(s);
            }
            else
            {
                Set<Student> set = new HashSet<>();
                set.add(s);
                tmap.put(c, set);
            }
        }

        for (Map.Entry<String, Set<Student>> e : tmap.entrySet())
        {
            sc.printf("%s %d\n", e.getKey(), e.getValue().size());
        }

        sc.close();
    }
    public static void main(String[] args)
    {
        new CourseScheduling().run();
    }
}
