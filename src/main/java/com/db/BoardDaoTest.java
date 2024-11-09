package com.db;

import java.util.Arrays;
import java.util.List;

public class BoardDaoTest {
    public static void main(String[] args) {
        BoardDao dao = new BoardDao();
        Board board = null;
        if (args.length > 0) {
            board = new Board();
            board.setTitle(args[0]);
            board.setContents(args[1]);
            board.setWriter(args[2]); //여기선 세팅

            if (args.length==4){
                board.setBoardId(Integer.parseInt(args[3]));
            }
        }
        //insert(dao, board);
        //delete(dao);
        //selectOne(dao, 6);
        //update(dao,board);
        //updateDynamic(dao,board);
        selectAll(dao);
    }
    /*private static void selectOne(BoardDao dao, int boardId) {
        Board board = dao.selBoardOne(boardId);
        System.out.println(board);
    }

     */
    private static void delete(BoardDao dao) {

        int result = dao.delBoard(12);
        System.out.println("result" + result);
    }
    private static void insert(BoardDao dao, Board board) {

        int result = dao.insBoard(board);
        System.out.println("result" + result);
    }
    private static void update(BoardDao dao, Board board) {

        int result = dao.upBoard(board);
        System.out.println("result" + result);
    }
    private static void updateDynamic(BoardDao dao, Board board){
        int result = dao.updBoardDynamic(board);
        System.out.println("result:" + result);
    }
    private static void selectAll(BoardDao dao){
        List<Board> list = dao.selBoardList();
        System.out.println(list);
    }

    }

