package com.athuacheng.circulardepend.algorithm;

public class HuiNumber {
    public static void main(String[] args) {
        out(25);
    }

    public static void out(int val) {
        int sqrt = (int) Math.sqrt(val);
        int count = sqrt*sqrt;
        Go.Node go = new Go().go;
        int[][] out = new int[sqrt][sqrt];
        int x = 0;
        int y = 0;
        int o = count;
        for (int i = count; i > 0; i--) {
            out[x][y] = o;
            x+=go.x;
            y+=go.y;
            if (x == sqrt || y == sqrt || x<0 || y < 0 ||out[x][y] !=0){
                x -= go.x;
                y -= go.y;
                go = go.next;
                x+=go.x;
                y+=go.y;
            }
            o --;
        }
        int leng = String.valueOf(val).length();
        for (int i = 0 ;i<sqrt;i++){
            for (int j = 0; j < sqrt; j++) {
                System.out.print(String.format("%0"+leng+"d", out[i][j]) +"\t\t");
            }
            System.out.println();
            System.out.println();
        }
    }
}

class Go {
    Node go;

    class Node {
        Node next;
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public Go() {
        Node just = new Node(1, 0);
        Node lower = new Node(0, 1);
        Node back = new Node(-1, 0);
        Node upper = new Node(0, -1);
        just.next = lower;
        lower.next = back;
        back.next = upper;
        upper.next = just;
        go = just;
    }
}
