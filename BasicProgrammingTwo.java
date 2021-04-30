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

class BasicProgrammingTwo {

  private int[] arr;
  private final int len;

  public BasicProgrammingTwo(int[] arr) {
    this.arr = arr;
    this.len = arr.length;
  }

  public String test(int t) {
    switch (t) {
      case 1:
        return one();
      case 2:
        return two();
      case 3:
        return three();
      case 4:
        return four();
      case 5:
        return five();
    }
    return "";
  }

  private String one() {
    mergeSort();
    int magicNo = 7777;
    for (int i = 0; i < this.len && arr[i] <= magicNo; i++) { 
      int search = binarySearch(this.arr, 0, this.len - 1, magicNo - arr[i]);
      if (search != -1 && arr[search] != arr[i]) return "Yes";
    }
    return "No";
  }

  private String two() {
    HashSet<Integer> set = new HashSet<>();
    for (int i : this.arr) {
      if (set.contains(i)) return "Contains duplicate";
      set.add(i);
    }
    return "Unique";
  }

  private String three() {
    HashMap<Integer, Integer> hmap = new HashMap<>();
    int query = this.len / 2;
    for (int i : this.arr) {
      hmap.put(i, (hmap.containsKey(i) ? hmap.get(i) : 0) + 1);
      if (hmap.get(i) > query) return "" + i;
    }
    return "-1";
  }

  private String four() {
    mergeSort();
    int half = this.len / 2;
    return this.len % 2 == 0 ? this.arr[half - 1] + " " + this.arr[half] : "" + this.arr[half];
  }

  private String five() {
    mergeSort();
    int lower = 100, upper = 999;
    StringBuilder sb = new StringBuilder();
    for (int i : this.arr) 
      if (i > upper) {
        break;
      } else if (i >= lower) {
        sb.append(i).append(" ");
      }
    return sb.toString();
  }

  private int binarySearch(int[] arr, int low, int high, int query) {
    if (low > high) return -1;
    int mid = low + ((high - low) / 2);
    if (arr[mid] == query) return mid;
    if (arr[mid] > query) return binarySearch(arr, low, mid - 1, query);
    return binarySearch(arr, mid + 1, high, query);
  }

  private void mergeSort() {
    mergeSortHelper(this.arr, 0, this.len - 1);
  }

  private void mergeSortHelper(int[] arr, int low, int high) {
    if (low < high) {
      int mid = (low + high) / 2;
      mergeSortHelper(arr, low, mid);
      mergeSortHelper(arr, mid + 1, high);
      merge(arr, low, mid, high);
    }
  }

  public void merge(int[] arr, int low, int mid, int high) {
    int n = high - low + 1;    
    int left = low, right = mid + 1, tmpIdx = 0;
    int[] tmp = new int[n];
    while (left <= mid && right <= high)
      tmp[tmpIdx++] = arr[left] < arr[right] ? arr[left++] : arr[right++];
    while (left <= mid)
      tmp[tmpIdx++] = arr[left++];
    while (right <= high)
      tmp[tmpIdx++] = arr[right++];
    for (int i = 0; i < n; i++)
      arr[i + low] = tmp[i];
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);
    String[] in = br.readLine().split(" ");
    int n = Integer.parseInt(in[0]);
    int t = Integer.parseInt(in[1]);
    int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    BasicProgrammingTwo bp = new BasicProgrammingTwo(arr);
    out.println(bp.test(t));
    out.close();
    br.close(); 
  }

}
