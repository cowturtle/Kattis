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

class RightOfWay {

  private final char arrive;
  private final char leave;
  private final char other;

  public RightOfWay(char arrive, char leave, char other) {
    this.arrive = arrive;
    this.leave = leave;
    this.other = other;
  }

  public String run() {
    return conditionOne() || conditionTwo() ? "Yes" : "No";
  }

  private boolean conditionOne() {
    return passingStraight() && otherApproachingRight();
  }

  private boolean conditionTwo() {
    return turningLeft() && (otherApproachingRight() || otherOpposite()); 
  }

  private boolean passingStraight() {
    return (this.arrive == 'N' && this.leave == 'S') 
      || (this.arrive == 'S' && this.leave == 'N')
      || (this.arrive == 'W' && this.leave == 'E')
      || (this.arrive == 'E' && this.leave == 'W');
  }

  private boolean otherApproachingRight() {
    return (this.arrive == 'N' && this.other == 'W') 
      || (this.arrive == 'E' && this.other == 'N')
      || (this.arrive == 'S' && this.other == 'E')
      || (this.arrive == 'W' && this.other == 'S');
  }

  private boolean turningLeft() {
    return (this.arrive == 'N' && this.leave == 'E') 
      || (this.arrive == 'E' && this.leave == 'S')
      || (this.arrive == 'S' && this.leave == 'W')
      || (this.arrive == 'W' && this.leave == 'N');
  }

  private boolean otherOpposite() {
    return (this.arrive == 'N' && this.other == 'S') 
      || (this.arrive == 'S' && this.other == 'N')
      || (this.arrive == 'W' && this.other == 'E')
      || (this.arrive == 'E' && this.other == 'W');
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] tmp = sc.nextLine().split(" ");
    char arrive = tmp[0].charAt(0), leave = tmp[1].charAt(0), other = tmp[2].charAt(0);
    RightOfWay row = new RightOfWay(arrive, leave, other);
    System.out.println(row.run());
    sc.close();
  }

}
