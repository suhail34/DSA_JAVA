package com.suhail.backtracking;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board,0));
    }

    static int queens(boolean[][] board, int row) {
        if(row==board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;

        for(int col=0; col < board.length; col++){
            if(isSafe(board,row,col)){
                board[row][col]=true;
                count+=queens(board, row+1);
                board[row][col]=false;
            }
        }
        return count;
    }

    static boolean isSafe(boolean[][] board, int row, int col) {
        for (int idx=0; idx<row; idx++){
            if(board[idx][col]){
                return false;
            }
        }

        int maxLeft = Math.min(row,col);
        for (int idx=1; idx<=maxLeft; idx++){
            if(board[row-idx][col-idx]){
                return false;
            }
        }

        int maxRight = Math.min(row, board.length - col - 1);
        for (int idx = 1; idx<=maxRight; idx++){
            if (board[row-idx][col+idx]){
                return false;
            }
        }
        return true;
    }

    static void display(boolean[][] board){
        for (boolean[] row : board){
            for (boolean element : row){
                if(element){
                    System.out.print("Q ");
                }else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

}