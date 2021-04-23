
// ///////////////////////////////////////////////////////////////////////////////
// // UNSOLVED
// // duplicate edges. how to handle?

// class FlowerTrails {
    
//     public static void main(String[] args) {
//         Kattio sc = new Kattio(System.in);
//         int p = sc.getInt(), t = sc.getInt();
//         FEdge[] fedges = new FEdge[t];
//         for (int i = 0; i < t; i++)
//             fedges[i] = new FEdge(sc.getInt(), sc.getInt(), sc.getInt());
//         Arrays.sort(fedges);       
//         FGraph g = new FGraph(fedges, p);
//         g.dijkstraShortestDistance();
//         System.out.println(g.getShortestDistance());
//         g.prepareSecond();
//         g.dijkstraShortestDistance();
//         System.out.println(g.getShortestDistance());
//         sc.close();
//     }
    
// }

// class FEdge implements Comparable<FEdge> {
//     private int start;
//     private int end;
//     private int weight;

//     public FEdge(int start, int end, int weight) {
//         this.start = start;
//         this.end = end;
//         this.weight = weight;
//     }

//     public int getStart() {
//         return this.start;
//     }

//     public int getEnd() {
//         return this.end;
//     }

//     public int getWeight() {
//         return this.weight;
//     }

//     public int getNeighbour(int n) {
//         if (this.start == n) {
//             return this.end;
//         } else if (this.end == n) {
//             return this.start;
//         }
//         return -1;
//     }

//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj) {
//             return true;
//         } else if (obj instanceof FEdge) {
//             FEdge e = (FEdge) obj;
//             return e.getStart() == this.getStart() && e.getEnd() == this.getEnd();
//         }
//         return false;
//     }

//     public boolean trueEquals(Object obj) {
//         if (this == obj) {
//             return true;
//         } else if (obj instanceof FEdge) {
//             FEdge e = (FEdge) obj;
//             return e.getStart() == this.getStart() 
//                     && e.getEnd() == this.getEnd()
//                     && e.getWeight() == this.getWeight();
//         }
//         return false;
//     }

//     @Override
//     public int compareTo(FEdge e) {
//         if (this.start == e.start) return this.end - e.end;
//         return this.start - e.start;
//     }

//     @Override
//     public String toString() {
//         return this.start + " " + this.end + " " + this.weight;
//     }
   
// }

// class FNode {

//     private int distanceFromRoot = Integer.MAX_VALUE;
//     private boolean visited = false;
//     private ArrayList<FEdge> fedges = new ArrayList<>();

//     public int getDistanceFromRoot() {
//         return this.distanceFromRoot;
//     }

//     public void setDistanceFromRoot(int distanceFromRoot) {
//         this.distanceFromRoot = distanceFromRoot;
//     }

//     public boolean isVisited() {
//         return this.visited;
//     }

//     public void setVisited(boolean visited) {
//         this.visited = visited;
//     }

//     public ArrayList<FEdge> getEdges() {
//         return this.fedges;
//     }

//     public void getEdges(ArrayList<FEdge> fedges) {
//         this.fedges = fedges;
//     }

// }

// class FGraph {
//     private FEdge[] fedges;
//     private FNode[] fnodes;

//     public FGraph(FEdge[] fedges, int points) {
//         this.fedges = filterEdges(fedges);
//         this.fnodes = createNodes(points);
//         addEdgesToNodes();
//     }

//     private void addEdgesToNodes() {
//         for (int i = 0; i < this.fedges.length; i++) {
//             this.fnodes[this.fedges[i].getStart()].getEdges().add(this.fedges[i]);
//             this.fnodes[this.fedges[i].getEnd()].getEdges().add(this.fedges[i]);
//         }
//     }

//     private FNode[] createNodes(int points) {
//         FNode[] fnodes = new FNode[points];
//         for (int i = 0; i < points; i++)
//             fnodes[i] = new FNode();
//         return fnodes;
//     }

//     public void dijkstraShortestDistance() {
//         // Root 0 distance from root
//         this.fnodes[0].setDistanceFromRoot(0);
//         int next = 0;
//         for (int i = 0; i < this.fnodes.length; i++) {
//             ArrayList<FEdge> currEdges = this.fnodes[next].getEdges();
//             for (int j = 0; j < currEdges.size(); j++) {
//                 int neighbour = currEdges.get(j).getNeighbour(next);
//                 if (!this.fnodes[neighbour].isVisited()) {
//                     int tmp = this.fnodes[next].getDistanceFromRoot();
//                     tmp += currEdges.get(j).getWeight();
//                     if (tmp < this.fnodes[neighbour].getDistanceFromRoot()) {
//                         this.fnodes[neighbour].setDistanceFromRoot(tmp);
//                     }
//                 }
//             }
//             this.fnodes[next].setVisited(true);
//             next = getNodeShortestFromTarget();
//         }        
//     }

//     private int getNodeShortestFromTarget() {
//         int shortInd = 0;
//         int shortDist = Integer.MAX_VALUE;
//         for (int i = 0; i < this.fnodes.length; i++) {
//             int curr = this.fnodes[i].getDistanceFromRoot();
//             if (!this.fnodes[i].isVisited() && curr < shortDist) {
//                 shortInd = i;
//                 shortDist = curr;
//             }
//         }
//         return shortInd;
//     }

//     public int getShortestDistance() {
//         return this.fnodes[this.fnodes.length - 1].getDistanceFromRoot();
//     }

//     public void prepareSecond() {
//         FEdge first = this.fedges[0];
//         int i = 1;
//         for (; i < this.fedges.length; i++)
//             if (!this.fedges[i].equals(first)) break;
//         this.fedges = Arrays.copyOfRange(this.fedges, i, this.fedges.length);
//         shortenNodes();
//         addEdgesToNodes();
//     }

//     private void shortenNodes() {
//         int n = 0;
//         for (FEdge e : this.fedges) {
//             n = Math.max(n, e.getStart());
//             n = Math.max(n, e.getEnd());
//         }
//         n++;
//         this.fnodes = new FNode[n];
//         for (int i = 0; i < n; i++) 
//             this.fnodes[i] = new FNode();
//     }

// }

// ///////////////////////////////////////////////////////////////////////////////
// // UNSOLVED
// class Dreamer {
    
//     public static void main(String[] args) {
//         Kattio sc = new Kattio(System.in);
//         SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
//         Date birth = new GregorianCalendar(1999, Calendar.DECEMBER, 31).getTime();
//         sdf.setLenient(false);
//         StringBuilder sb = new StringBuilder();
//         int n = sc.getInt();
//         while (n-- > 0) {
//             String s = sc.getWord() + sc.getWord() + sc.getWord();
//             ArrayList<String> permutes = permutation(s);         
//             ArrayList<Date> valids = new ArrayList<>();         
//             for (String x : permutes) {
//                 try {
//                     Date date = sdf.parse(x); 
//                     if (date.after(birth)) {
//                         valids.add(date);
//                     }
//                 } catch (ParseException e) { 
//                     continue;
//                 }
//             }   
//             sb.append(valids.size());
//             if (valids.size() > 0) {
//                 sb.append(" ");
//                 Calendar d = Calendar.getInstance();
//                 d.setTime(Collections.min(valids));
//                 int day = d.get(Calendar.DAY_OF_MONTH);
//                 int month = d.get(Calendar.MONTH) + 1;
//                 int year = d.get(Calendar.YEAR);
//                 sb.append(day / 10 == 0 ? 0 + "" + day : day);
//                 sb.append(" ");
//                 sb.append(month / 10 == 0 ? 0 + "" + month : month);
//                 sb.append(" ");
//                 sb.append(year);
//             }
//             sb.append("\n");
//         }
//         System.out.println(sb.toString().trim());
//         sc.close();
//     }

//     static ArrayList<String> permutation(String s) {
//         if (s.length() == 0) {
//             ArrayList<String> emp = new ArrayList<>(); 
//             emp.add(""); 
//             return emp; 
//         }

//         char c = s.charAt(0);
//         String rest = s.substring(1);
//         ArrayList<String> prevs = permutation(rest);
//         ArrayList<String> out = new ArrayList<>();
//         for (String f : prevs) {
//             for (int i = 0; i <= f.length(); i++) {
//                 String g = f.substring(0, i) + c + f.substring(i);
//                 if (!out.contains(g))
//                     out.add(g);
//             }
//         } 
//         return out;
//     }
    
// }

// ///////////////////////////////////////////////////////////////////////////////
// // UNSOLVED
// class BabyNames {
    
//     public static void main(String[] args) {
//         Kattio sc = new Kattio(System.in);
//         StringBuilder sb = new StringBuilder();
//         HashMap<String, Integer> names = new HashMap<>();
//         while (true) {
//             int command = sc.getInt();
//             if (command == 0) {
//                 break;
//             } else if (command == 1) {
//                 names.put(sc.getWord(), sc.getInt());
//             } else if (command == 2) {
//                 names.remove(sc.getWord());
//             } else if (command == 3) {
//                 String start = sc.getWord();
//                 String end = sc.getWord();
//                 List<String> prefixRange = generateStrings(start, end);
//                 int gender = sc.getInt();
//                 int count = 0;
//                 Iterator i = names.entrySet().iterator();
//                 while (i.hasNext()) {
//                     Object o = i.next();
//                     @SuppressWarnings("unchecked")
//                     Entry<String, Integer> e = (Entry<String, Integer>) o;
//                     if (prefix(prefixRange, e.getKey()) && (gender == 0 || e.getValue() == gender)) count++;
//                 }                
//                 sb.append(count).append("\n");
//             }
//         }
//         System.out.println(sb.toString().trim());
//         sc.close();
//     }

//     static boolean prefix(List<String> prefixRange, String target) {
//         for (String s : prefixRange)
//             if (target.startsWith(s)) return true;
//         return false;
//     }

//     static List<String> generatePossibleStringsSame(char[] start, char[] end) {
//         List<String> gen = new ArrayList<>();
//         int len = start.length;
//         char[] curr = Arrays.copyOf(start, len);
//         gen.add(new String(curr));
//         while (!(new String(end).equals(new String(curr)))) {
//             curr[len - 1] += 1;
//             int i = len - 1;
//             while (curr[i] > end[i]) {
//                 curr[i] = start[i];
//                 i--;
//                 curr[i]++;
//             }
//             gen.add(new String(curr));
//         }
//         return gen;
//     }

//     static List<String> generateStrings(String start, String end) {
//         List<String> gen = new ArrayList<>();

//         char[] startArr = start.toCharArray(), endArr = end.toCharArray();

//         if (startArr.length == endArr.length) {
//             gen.addAll(generatePossibleStringsSame(startArr, endArr));
//         } else {
//             // Generate First
//             char[] tmpEndArr = new char[startArr.length];
//             Arrays.fill(tmpEndArr, 'Z');
//             gen.addAll(generatePossibleStringsSame(startArr, tmpEndArr));
//             // Generate inbetweens
//             for (int i = startArr.length + 1; i < endArr.length; i++) {
//                 char[] tmpStartArr = new char[i];
//                 tmpEndArr = new char[i];
//                 Arrays.fill(tmpStartArr ,'A');
//                 Arrays.fill(tmpEndArr ,'Z');
//                 gen.addAll(generatePossibleStringsSame(tmpStartArr, tmpEndArr));
//             }
//             // Generate Last
//             char[] tmpStartArr = new char[endArr.length];
//             Arrays.fill(tmpStartArr, 'A');
//             gen.addAll(generatePossibleStringsSame(tmpStartArr, endArr));
//         }
//         // System.out.println(Arrays.toString(gen.toArray()));
//         gen.remove(gen.size() - 1);
//         return gen;
//     }
    
// }

// ///////////////////////////////////////////////////////////////////////////////
// // UNSOLVED
// class TriTiling {
    
//     public static void main(String[] args) {
//         new TriTiling();
//     }

//     TriTiling() {
//         answer();
//     }

//     void answer() { 
//         Kattio sc = new Kattio(System.in);
//         StringBuilder sb = new StringBuilder();
//         // 3 x 2 > need 3 tiles | 3
//         // 3 x 4 > need 6 tiles | 11
//         // 3 x 6 > need 9 tiles
//         // 3 x 8 > need 12 tiles | 153
//         // 3 x 10 > need 15 tiles 
//         // 3 x 12 > need 18 tiles | 2131
//         // 3n / 2
//         int n = -1;
//         while ((n = sc.getInt()) != -1)
//             sb.append(foo(n)).append("\n");
//         System.out.println(sb.toString());
//         sc.close();
//     }

//     int foo(int n) {
//         return 1;
//     }
    
// }

// // UNSOLVED
// class ABProblem {
//     ABProblem() {
//         answer();
//     }

//     static int count = 0;

//     void answer() {
//         int[] arr = readInput();        
//         int r = 3;
//         int n = arr.length;
//         if (n == 3) {
//             countThree(arr);
//         } else {
//             combination(arr, r, n);
//         }
//         System.out.println(ABProblem.count);
//     }

//     int[] readInput() {
//         Scanner sc = new Scanner(System.in);
//         int[] arr = new int[sc.nextInt()];
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }
//         sc.close();
//         Arrays.sort(arr);
//         return arr;
//     }

//     void countThree(int[] data) {
//         if (data[0] + data[1] == data[2]) {
//             ABProblem.count += 2;
//         }
//         if (data[0] + data[2] == data[1]) {
//             ABProblem.count += 2;
//         }
//         if (data[1] + data[2] == data[0]) {
//             ABProblem.count += 2;
//         }
//     }

//     void combination(int[] arr, int r, int n) {
//         int[] data = new int[r];
//         combinationHelper(arr, data, 0, n - 1, 0, r);
//     }

//     void combinationHelper(int arr[], int data[],
//         int start, int end, int index, int r) {

//             if (index == r) {
//                 if (data[0] + data[1] == data[2]) {
//                     ABProblem.count += 2;
//                 } 
//                 if (data[0] + data[2] == data[1]) {
//                     ABProblem.count += 2;
//                 }
//                 if (data[1] + data[2] == data[0]) {
//                     ABProblem.count += 2;
//                 }
//                 return;
//             }

//             for (int i = start; i <= end && (end - 1 + 1) >= r - index; i++) {
//                 data[index] = arr[i];
//                 combinationHelper(arr, data, i + 1, end, index + 1, r);
//             }

//     }
// }

///////////////////////////////////////////////////////////////////////////////
// TIME LIMIT EXCEED
// class Sim {
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = Integer.parseInt(sc.nextLine());
//         while (n-- > 0) {
//             char[] input = sc.nextLine()
//                                 .replaceAll("[\\]]+", "]")
//                                 .replaceAll("[\\[]+", "[")
//                                 .replaceAll("^[<]+", "")
//                                 .replaceAll("\\[+<+", "")
//                                 .toCharArray();
//             StringBuilder sb = new StringBuilder();
//             int cursor = 0;
//             // System.out.println(new String(input));
//             for (char c : input) {
//                 // System.out.println(sb.toString());
//                 if (c == '[') {
//                     cursor = 0;
//                 } else if (c == ']') {
//                     cursor = sb.length();
//                 } else if (c == '<') {
//                     if (cursor > 0) {
//                         sb.deleteCharAt(--cursor);
//                     }
//                 } else {
//                     sb.insert(cursor++, c);
//                 }           
//                 if (cursor < 0) cursor = 0;
//             }
//             System.out.println(sb.toString());
//         }        
//         sc.close();
//     }
    
// }

// ///////////////////////////////////////////////////////////////////////////////

// class DistributingBallotBoxes {
// // UNSOLVED, it works but time limit exceeded
//     public static void main(String[] args) {
//         Kattio sc = new Kattio(System.in);
//         StringBuilder sb = new StringBuilder();
//         int n = -1, b = -1;
//         while ((n = sc.getInt()) != -1 && (b = sc.getInt()) != -1) {

//         }
//         System.out.print(sb.toString());
//         sc.close();
//         // Comparator<int[]> comp = new Comparator<>() {
//         //     @Override
//         //     public int compare(int[] arr1, int[] arr2) {
//         //         return (int) Math.ceil(arr2[0] / ((double) arr2[1])) - (int) Math.ceil(arr1[0] / ((double) arr1[1]));
//         //     }
//         // };
//         // Kattio sc = new Kattio(System.in);
//         // StringBuilder sb = new StringBuilder();
//         // int n = -1, b = -1;
//         // while ((n = sc.getInt()) != -1 && (b = sc.getInt()) != -1) {
//         //     Queue<int[]> cities= new PriorityQueue<>(comp);
//         //     b -= n;
//         //     while (n-- > 0) 
//         //         cities.offer(new int[] {sc.getInt(), 1});
//         //     while (b-- > 0) {
//         //         int[] c = cities.peek();
//         //         cities.remove();
//         //         c[1]++;
//         //         cities.offer(c);
//         //     }
//         //     int[] max = cities.peek();
//         //     sb.append((int) Math.ceil(max[0] / ((double) max[1]))).append("\n");
//         // }
//         // System.out.print(sb.toString());
//         // sc.close();
//     }
    
// }

///////////////////////////////////////////////////////////////////////////////

// class ls {

//     public static void main(String[] args) {
//         Kattio sc = new Kattio(System.in);
//         StringBuilder sb = new StringBuilder();
//         char[] arr = sc.getWord().toCharArray();

//         ArrayDeque<Character> pattern = new ArrayDeque<>();
//         for (char c : arr)
//             pattern.offerLast(c);
//         int n = sc.getInt();
//         String s = "";
//         while (n-- > 0) 
//             if (foo(pattern, s = sc.getWord())) sb.append(s).append("\n");
//         System.out.print(sb.toString());
//         sc.close();
//     }

//     static boolean foo(ArrayDeque<Character> original, String s) {
//         ArrayDeque<Character> pattern = new ArrayDeque<>(original);
//         ArrayDeque<Character> query = new ArrayDeque<>();
//         for (char c : s.toCharArray())
//             query.offerLast(c);

//         while (pattern.peekFirst() == query.peekFirst()) {
//             pattern.pollFirst();
//             query.pollFirst();
//         }
//         while (pattern.peekLast() == query.peekLast()) {
//             pattern.pollLast();
//             query.pollLast();
//         }

//         if (pattern.isEmpty() && query.isEmpty()) return true;
//         if (pattern.isEmpty()) return false;
//         if (query.isEmpty()) return pattern.contains('*');

//         while (pattern.contains('*'))
//             pattern.remove('*');

//         String patternStr = "", queryStr = "";
//         for (Character c : pattern)
//             patternStr += c;
//         for (Character c : query)
//             queryStr += c;
//         int start = 0;
//         for (char c : patternStr.toCharArray()) {
//             if (start >= queryStr.length()) return false;
//             int loc = queryStr.indexOf(c, start);
//             if (loc == -1) return false;
//             start = loc;
//         }
//         return true;
//         // String patternStr = "", queryStr = "";
//         // for (Character c : pattern)
//         //     patternStr += c;
//         // for (Character c : query)
//         //     queryStr += c;
//         // patternStr = patternStr.replace(".", "\\.").replace("*","[a-z.]{0,99}");
//         // Pattern p = Pattern.compile(patternStr);
//         // Matcher m = p.matcher(queryStr);
//         // return m.matches();
//     }
    
// }

///////////////////////////////////////////////////////////////////////////////

// class Teque {

//     public static void main(String[] args) throws IOException {
//         // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         // PrintWriter out = new PrintWriter(System.out);
//         // int n = Integer.parseInt(br.readLine());
//         // // ArrayDeque<Integer> front = new ArrayDeque<>();
//         // // ArrayDeque<Integer> back = new ArrayDeque<>();
//         // while (n-- > 0) {
//         //     String[] arr = br.readLine().split(" ");
//         //     int opt = arr[0].length();
//             // int x = Integer.parseInt(arr[1]);
//             // get = 3
//             // push_back = 9
//             // push_front = 10
//             // push_middle = 11
//             // int fsize = front.size(), bsize = back.size();
//             // if (opt == 3) {
//                 // int loop = x - fsize + 1;
//                 // if (loop < 0) {
//                 //     while (loop++ < 0)
//                 //         back.offerFirst(front.pollLast());
//                 // } else if (loop > 0) {
//                 //     while (loop-- > 0)
//                 //         front.offerLast(back.pollFirst());
//                 // } 
//                 // out.println(front.getLast());
//             // } else if (opt == 9) {
//                 // back.offerLast(x);
//             // } else if (opt == 10) {
//                 // front.offerFirst(x);
//             // } else if (opt == 11) {
//                 // int mid = (fsize + bsize + 1) / 2;
//                 // int loop = mid - fsize; 
//                 // if (loop < 0) {
//                 //     while (loop++ < 0)
//                 //         back.offerFirst(front.pollLast());
//                 // } else if (loop > 0) {
//                 //     while (loop-- > 0)
//                 //         front.offerLast(back.pollFirst());
//                 // }   
//                 // front.offerLast(x); 
//         //     }
//         // }

//         Kattio sc = new Kattio(System.in);
//         PrintWriter out = new PrintWriter(System.out);
//         int n = sc.getInt();
//         ArrayList<Integer> list = new ArrayList<>(n);
//         while (n-- > 0) {
//             // get = 3
//             // push_back = 9
//             // push_front = 10
//             // push_middle = 11
//             int opt = sc.getWord().length(), x = sc.getInt();
//             if (opt == 3) {
//                 out.println(list.get(x));
//             } else if (opt == 9) {
//                 list.add(x);
//             } else if (opt == 10) {
//                 list.add(0, x);
//             } else if (opt == 11) {
//                 list.add((list.size() + 1) / 2, x);
//             }            
//         }
//         out.close();
//         sc.close();
//         // br.close();
//     }

// }