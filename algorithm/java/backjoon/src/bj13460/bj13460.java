package bj13460;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class findHole{
    int col = 0;
    int row = 0;
    int a = 0;
    int []blueBall = new int[2];
    int []redBall = new int[2];
    int []hole = new int[2];

    public void findLocation(char location, int i, int j){
        if(location == 'b') {
            blueBall[0] = i;
            blueBall[1] = j;
        }
        else if(location == 'r') {
            redBall[0] = i;
            redBall[1] = j;
        }
        else if(location == 'o') {
            hole[0] = i;
            hole[1] = j;
        }
    }

    public void goToHall(){}
}

public class bj13460 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int m = 0;
        String board;
        n = sc.nextInt();
        m = sc.nextInt();
        findHall fh = new findHall();
        ArrayList<Character> []arr = new ArrayList[n];
        for(int i = 0; i < n ; i++){
            board = sc.next();
            arr[i] = new ArrayList<Character>();
            for(int j = 0 ; j < m ; j++)
            {
                arr[i].add(board.charAt(j));
                if((charAt(j) == 'b')||(charAt(j) == 'r')||(charAt(j) == 'o')){
                    fh.findLocation(charAt(j),i,j);
                }
            }
        }


    }
}
