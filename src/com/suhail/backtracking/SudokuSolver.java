package com.suhail.backtracking;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = { { 8, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 3, 6, 0, 0, 0, 0, 0 },
                { 0, 7, 0, 0, 9, 0, 2, 0, 0 },
                { 0, 5, 0, 0, 0, 7, 0, 0, 0 },
                { 0, 0, 0, 0, 4, 5, 7, 0, 0 },
                { 0, 0, 0, 1, 0, 0, 0, 3, 0 },
                { 0, 0, 1, 0, 0, 0, 0, 6, 8 },
                { 0, 0, 8, 5, 0, 0, 0, 1, 0 },
                { 0, 9, 0, 0, 0, 0, 4, 0, 0 } };

        if(solve(board)){
            display(board);
        }else {
            System.out.println("Cannot Solve");
        }
    }

    static boolean solve(int[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = true;

        for (int rowIdx=0; rowIdx<n; rowIdx++){
            for (int colIdx=0; colIdx<n; colIdx++){
                if(board[rowIdx][colIdx]==0){
                    row=rowIdx;
                    col=colIdx;
                    emptyLeft=false;
                    break;
                }
            }
            if(!emptyLeft){
                break;
            }
        }

        if(emptyLeft){
            return true;
        }

        for (int num=1; num<=9;num++){
            if(isSafe(board,row,col,num)){
                board[row][col]=num;
                if(solve(board)){
                    return true;
                }else {
                    board[row][col]=0;
                }
            }
        }
        return false;
    }

    static void display(int[][] board){
        for(int[] row:board){
            for (int col:row){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(int[][] board, int row, int col, int number){
        for(int idx = 0; idx < board.length; idx++){
            if(board[row][idx]==number){
                return false;
            }
        }

        for (int[] colnums:board){
            if(colnums[col]==number){
                return false;
            }
        }

        int sqrt = (int)(Math.sqrt(board.length));
        int rowStart = row - row%sqrt;
        int colStart = col - col%sqrt;

        for (int rowBlock=rowStart;rowBlock<rowStart+sqrt;rowBlock++){
            for (int colBlock=colStart;colBlock<colStart+sqrt;colBlock++){
                if(board[rowStart][colBlock]==number){
                    return false;
                }
            }
        }
        return true;
    }

}
