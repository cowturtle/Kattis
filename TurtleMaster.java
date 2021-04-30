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

class TurtleMaster {
    
    static final int BOARD_LENGTH = 8;

    public static void main(String[] args) {

        class Turtle {
            int x, y;
            int facing; // 0 1 2 3, east, south, west, north
            boolean bug;

            Turtle() {
                this.x = 7;
                this.y = 0;
                this.facing = 0;
                this.bug = false;
            }

            void turn(char c) {
                if (c == 'L') {
                    this.facing += 3;
                } else {
                    this.facing += 1;
                }
                this.facing %= 4;
            }

            void forward(char[][] board) {
                int[] arr = getForward();
                int nx = arr[0], ny = arr[1];
                if (0 <= nx && nx < BOARD_LENGTH && 0 <= ny && ny < BOARD_LENGTH) {
                    this.x = nx;
                    this.y = ny;
                    if (board[this.x][this.y] == 'C' || board[this.x][this.y] == 'I') {
                        this.bug = true;
                    } 
                } else {
                    this.bug = true;
                }                
            }

            void fire(char[][] board) {
                int[] arr = getForward();
                int nx = arr[0], ny = arr[1];
                if (0 <= nx && nx < BOARD_LENGTH && 0 <= ny && ny < BOARD_LENGTH && board[nx][ny] == 'I') {
                    board[nx][ny] = '.';            
                } else {
                    this.bug = true;
                }
            }

            private int[] getForward() {
                int nx = this.x, ny = this.y;
                if (this.facing == 0) {
                    ny++;
                } else if (this.facing == 1) {
                    nx++;
                } else if (this.facing == 2) {
                    ny--;
                } else if (this.facing == 3) {
                    nx--;
                }
                return new int[] {nx, ny};
            }

            void move(char[][] board, char action) {
                if (action == 'L' || action == 'R') {
                    turn(action);
                } else if (action == 'F') {
                    forward(board);
                } else if (action == 'X') {
                    fire(board);
                }
            }
            
        }

        Scanner sc = new Scanner(System.in);
        char[][] board = new char[BOARD_LENGTH][BOARD_LENGTH];
        for (int i = 0; i < BOARD_LENGTH; i++)
            board[i] = sc.nextLine().toCharArray();
        char[] instructions = sc.nextLine().toCharArray();
        Turtle turtle = new Turtle();
        for (char c : instructions) {
            // System.out.println(turtle.x + " " + turtle.y);
            turtle.move(board, c);
            if (turtle.bug) break;
        }
        System.out.println(!turtle.bug && board[turtle.x][turtle.y] == 'D' ? "Diamond!" : "Bug!");
        sc.close();
    }
    
}

// ///////////////////////////////////////////////////////////////////////////////

class TwoZeroFourEight {

    static final int BOARD_LENGTH = 4;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[BOARD_LENGTH][BOARD_LENGTH];
        readBoard(sc, board);
        move(sc, board);
        print(board);
        sc.close();
    }

    static void move(Scanner sc, int[][] board) {
        // 0 left
        // 1 up
        // 2 right
        // 3 down
        int m = Integer.parseInt(sc.nextLine());
        if (m == 0) {
            left(board);    
        } else if (m == 1) {
            up(board);
        } else if (m == 2) {
            right(board);
        } else if (m == 3) {
            down(board);
        } 
    }

    static void left(int[][] board) {
        for (int r = 0; r < BOARD_LENGTH; r++) {
            for (int c = 0; c < BOARD_LENGTH; c++) {
                if (board[r][c] != 0) {
                    for (int i = c + 1; i < BOARD_LENGTH; i++) 
                        if (board[r][c] == board[r][i]) {
                            board[r][c] += board[r][i];
                            board[r][i] = 0;
                            break;
                        } else if (board[r][i] != 0) {
                            break;
                        }
                }
            }
        }
        for (int r = 0; r < BOARD_LENGTH; r++) {
            for (int c = 0; c < BOARD_LENGTH; c++) {
                if (board[r][c] == 0) {
                    for (int i = c + 1; i < BOARD_LENGTH; i++) 
                        if (board[r][i] != 0) {
                            board[r][c] = board[r][i];
                            board[r][i] = 0;
                            break;
                        }
                }
            }
        }
    }

    static void up(int[][] board) {
        for (int c = 0; c < BOARD_LENGTH; c++) {
            for (int r = 0; r < BOARD_LENGTH; r++) {
                if (board[r][c] != 0) {
                    for (int i = r + 1; i < BOARD_LENGTH; i++) 
                        if (board[r][c] == board[i][c]) {
                            board[r][c] += board[i][c];
                            board[i][c] = 0;
                            break;
                        } else if (board[i][c] != 0) {
                            break;
                        }
                }
            }
        }
        for (int c = 0; c < BOARD_LENGTH; c++) {
            for (int r = 0; r < BOARD_LENGTH; r++) {
                if (board[r][c] == 0) {
                    for (int i = r + 1; i < BOARD_LENGTH; i++) 
                        if (board[i][c] != 0) {
                            board[r][c] = board[i][c];
                            board[i][c] = 0;
                            break;
                        }
                }
            }
        }
    }

    static void right(int[][] board) {
        for (int r = 0; r < BOARD_LENGTH; r++) {
            for (int c = BOARD_LENGTH - 1; c >= 0; c--) {
                if (board[r][c] != 0) {
                    for (int i = c - 1; i >= 0; i--) 
                        if (board[r][c] == board[r][i]) {
                            board[r][c] += board[r][i];
                            board[r][i] = 0;
                            break;
                        } else if (board[r][i] != 0) {
                            break;
                        }
                }
            }
        }
        for (int r = 0; r < BOARD_LENGTH; r++) {
            for (int c = BOARD_LENGTH - 1; c >= 0; c--) {
                if (board[r][c] == 0) {
                    for (int i = c - 1; i >= 0; i--)
                        if (board[r][i] != 0) {
                            board[r][c] = board[r][i];
                            board[r][i] = 0;
                            break;
                        }
                }
            }
        }
    }

    static void down(int[][] board) {
        for (int c = 0; c < BOARD_LENGTH; c++) {
            for (int r = BOARD_LENGTH - 1; r >= 0; r--) {
                if (board[r][c] != 0) {
                    for (int i = r - 1; i >= 0; i--) 
                        if (board[r][c] == board[i][c]) {
                            board[r][c] += board[i][c];
                            board[i][c] = 0;
                            break;
                        } else if (board[i][c] != 0) {
                            break;
                        }
                }
            }
        }
        for (int c = 0; c < BOARD_LENGTH; c++) {
            for (int r = BOARD_LENGTH - 1; r >= 0; r--) {
                if (board[r][c] == 0) {
                    for (int i = r - 1; i >= 0; i--) 
                        if (board[i][c] != 0) {
                            board[r][c] = board[i][c];
                            board[i][c] = 0;
                            break;
                        }
                }
            }
        }
    }

    static void print(int[][] board) {
        for (int i = 0; i < BOARD_LENGTH; i++)
            System.out.println(Arrays.toString(board[i]).replaceAll("[\\[\\],]", ""));
    }

    static void readBoard(Scanner sc, int[][] board) {
        for (int i = 0; i < BOARD_LENGTH; i++) 
            board[i] = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }

}
