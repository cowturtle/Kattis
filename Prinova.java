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

class Prinova {

  private final int[] arr;
  private final int lower, upper;

  Prinova(int[] arr, int lower, int upper) {
    this.arr = arr;
    this.lower = isEven(lower) ? lower + 1: lower;
    this.upper = isEven(upper) ? upper - 1: upper;
  } 

  public int find() {
    sort();
    int max = abs(getNearest(this.lower) - this.lower);
    int identity = this.lower;

    int tmp = abs(getNearest(this.upper) - this.upper);
    if (tmp > max) {
      max = tmp;
      identity = this.upper;
    }

    int n = this.arr.length;
    for (int i = 0; i < n - 1; i++) {
      int mid = getMid(this.arr[i], this.arr[i + 1]);
      if (isEven(mid)) mid--;
      if (inRange(mid)) {
        int diff = abs(mid - this.arr[i]);
        if (diff > max) {
          max = diff;
          identity = mid;
        }
      }
      if (mid > this.upper) break;
    }

    return identity;
  }

  private int getMid(int a, int b) {
    return (a + b) / 2;
  }

  private int getNearest(int x) {
    int min = Integer.MAX_VALUE;
    int identity = 0;
    for (int i : this.arr)
      if (abs(i - x) < min) {
        identity = i;
        min = abs(i - x);
      }
    return identity;
  }

  private boolean inRange(int x) {
    return this.lower <= x && x <= this.upper;
  }

  private int abs(int x) {
    return x <= 0 ? 0 - x : x;
  }

  private boolean isEven(int x) {
    return (x & 1) == 0;
  }

  private void sort() {
    quickSort(0, this.arr.length - 1);
  }

  private void quickSort(int low, int high) {
    if (low < high) {
      int pivot = partition(low, high);
      quickSort(low, pivot - 1);
      quickSort(pivot + 1, high);
    }
  }

  private int partition(int low, int high) {
    int lessIndex = low;
    int greaterIndex = low + 1;
    while (greaterIndex <= high) {
      if (this.arr[greaterIndex] < this.arr[low]) {
        lessIndex++;
        int tmp = arr[greaterIndex];
        arr[greaterIndex] = arr[lessIndex];
        arr[lessIndex] = tmp;
      }
      greaterIndex++;
    }
    int tmp = arr[low];
    arr[low] = arr[lessIndex];
    arr[lessIndex] = tmp;
    return lessIndex;
  }

  public static void main(String[] args) {
    Kattio sc = new Kattio(System.in);
    PrintWriter out = new PrintWriter(System.out);
    int n = sc.getInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++)
      arr[i] = sc.getInt();
    int lower = sc.getInt();
    int upper = sc.getInt();
    Prinova p = new Prinova(arr, lower, upper);
    out.println(p.find());
    out.close();
    sc.close();
  }

}
