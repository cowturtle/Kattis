import java.util.*;
import java.util.Map.Entry;
import java.util.regex.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;
import java.text.*;

/*
 * @author Theodoric Keith Lim
 */

class OpenSource {
    
    static final Comparator<Entry<String, Set<String>>> comp = new Comparator<>() {
            @Override
            public int compare(Entry<String, Set<String>> e1, Entry<String, Set<String>> e2) {
                if (e1.getValue().size() == e2.getValue().size()) {
                    return e1.getKey().compareTo(e2.getKey());
                }
                return e2.getValue().size() - e1.getValue().size();
            }
        };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        HashMap<String, Set<String>> projectList = new HashMap<>();
        HashMap<String, Integer> studentCount = new HashMap<>();
        
        String currProject = "";
        Set<String> currSet = null;
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            if (s.equals("0")) {
                break;
            } else if (s.equals("1")) {
                studentsToProject(projectList, studentCount, currProject, currSet);
                removeGreedyStudents(projectList, studentCount);
                writeToOut(projectList, sb);
                currProject = "";
                currSet = null;
                projectList.clear();
                studentCount.clear();
            } else if (isProject(s)) {
                if (currSet != null) 
                    studentsToProject(projectList, studentCount, currProject, currSet);
                currSet = new HashSet<>();
                currProject = s;
            } else {
                currSet.add(s);
            }
        }   
        System.out.print(sb.toString());
        sc.close();
    }
    
    static void studentsToProject(HashMap<String, Set<String>> projectList, HashMap<String, Integer> studentCount, String currProject, Set<String> currSet) {
        projectList.put(currProject, currSet);
                    for (String student : currSet) 
                        studentCount.put(student, (studentCount.containsKey(student) ? studentCount.get(student) : 0) + 1);
    }

    static void writeToOut(HashMap<String, Set<String>> projectList, StringBuilder sb) {
        ArrayList<Entry<String, Set<String>>> al = new ArrayList<>(projectList.entrySet());
        Collections.sort(al, comp);
        for (Entry<String, Set<String>> e : al) 
            sb.append(e.getKey()).append(" ").append(e.getValue().size()).append("\n");
    }   

    static void removeGreedyStudents(HashMap<String, Set<String>> projectList, HashMap<String, Integer> studentCount) {
        for (Entry<String, Set<String>> project : projectList.entrySet()) {
            Set<String> set = project.getValue();
            for (Entry<String, Integer> student : studentCount.entrySet()) 
                if (set.contains(student.getKey()) && student.getValue() > 1)
                    set.remove(student.getKey());                    
        }
    }

    static boolean isProject(String s) {
        for (char c : s.toCharArray()) 
            if ((65 > c || c > 90) && c != 32) return false;
        return true;
    }

}
