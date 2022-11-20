package com.suhail.backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class SimpleMazeProblem {
    public static void main(String[] args) {
//        System.out.println(countPath(3,3));
//        path("",3,3);
//        System.out.println(pathRet("",3,3));
//        pathDiagonal("",3,3);
//        System.out.println(pathDiagonalRet("",3,3));
        boolean[][] board ={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };

        int path[][] = new int[board.length][board[0].length];

        int step = 1;

        allPathPrint("",board,0,0, path, step);
    }

    public static int countPath(int row, int col){
        if(row==1 || col==1){
            return 1;
        }
        int left = countPath(row-1,col);
        int right = countPath(row, col-1);

        return left+right;
    }

    public static void path(String processed, int row, int col){
        if(row==1 && col==1){
            System.out.println(processed);
            return;
        }

        if(row>1){
            path(processed+'D', row-1, col);
        }
        if(col>1){
            path(processed+'R', row, col-1);
        }

    }

    public static ArrayList<String> pathRet(String processed, int row, int col){
        if(row==1 && col==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if(row>1){
            ans.addAll(pathRet(processed+'D', row-1, col));
        }
        if(col>1){
            ans.addAll(pathRet(processed+'R', row, col-1));
        }

        return ans;
    }

    public static void pathDiagonal(String processed, int row, int col){
        if(row==1 && col==1){
            System.out.println(processed);
            return;
        }

        if(row>1 && col>1){
            pathDiagonal("Diagonal ", row-1, col-1);
        }
        if(row>1){
            pathDiagonal(processed+"Down ", row-1, col);
        }
        if(col>1){
            pathDiagonal(processed+"Right ", row, col-1);
        }

    }

    public static ArrayList<String> pathDiagonalRet(String processed, int row, int col){
        if(row==1 && col==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if(row>1 && col>1){
            ans.addAll(pathDiagonalRet("Diagonal ", row-1, col-1));
        }
        if(row>1){
            ans.addAll(pathDiagonalRet(processed+"Down ", row-1, col));
        }
        if(col>1){
            ans.addAll(pathDiagonalRet(processed+"Right ", row, col-1));
        }

        return ans;
    }

    public static void pathRestrictions(String processed,boolean[][] board, int row, int col){
        if(row==board.length-1 && col==board[0].length-1){
            System.out.println(processed);
            return;
        }

        if(!board[row][col]){
            return;
        }

        if(row<board.length-1){
            pathRestrictions(processed+"Down ", board, row+1, col);
        }
        if(col<board[0].length-1){
            pathRestrictions(processed+"Right ", board, row, col+1);
        }
    }

    public static void allPath(String processed,boolean[][] board, int row, int col){
        if(row==board.length-1 && col==board[0].length-1){
            System.out.println(processed);
            return;
        }

        if(!board[row][col]){
            return;
        }

        board[row][col]=false;

        if(row<board.length-1){
            allPath(processed+"Down ", board, row+1, col);
        }
        if(col<board[0].length-1){
            allPath(processed+"Right ", board, row, col+1);
        }
        if(row>0){
            allPath(processed+"Up ",board,row - 1,col);
        }
        if(col>0){
            allPath(processed+"Left ",board,row, col - 1);
        }
        board[row][col]=true;
    }

    public static void allPathPrint(String processed,boolean[][] board, int row, int col, int[][] path, int step){
        if(row==board.length-1 && col==board[0].length-1){
            path[row][col]=step;
            for(int arr[]:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(processed);
            System.out.println();
            return;
        }

        if(!board[row][col]){
            return;
        }

        board[row][col]=false;
        path[row][col]=step;

        if(row<board.length-1){
            allPathPrint(processed+"Down ", board, row+1, col, path, step+1);
        }
        if(col<board[0].length-1){
            allPathPrint(processed+"Right ", board, row, col+1, path, step+1);
        }
        if(row>0){
            allPathPrint(processed+"Up ",board,row - 1,col, path, step+1);
        }
        if(col>0){
            allPathPrint(processed+"Left ",board,row, col - 1, path, step+1);
        }
        board[row][col]=true;
        path[row][col]=0;
    }

}
