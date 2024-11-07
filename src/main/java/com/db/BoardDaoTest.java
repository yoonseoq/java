package com.db;

public class BoardDaoTest {
    public static void main(String[] args) {
        BoardDao dao = new BoardDao();
        //insert(dao);
        delete(dao);

    }
    private static void delete(BoardDao dao){

        int result = dao.delBoard(10);
        System.out.println("시마이?");
    }
    private static void insert(BoardDao dao){
        Board board = new Board();
        board.setTitle("올해 연말 가요제 내가 볼 무대는 거의 없네");
        board.setContents("유튜브고 뭐고 뭐 없다");
        board.setWriter("MS07B");

        int result = dao.insBoard(board);
        System.out.println("result"+ result);
    }
}
