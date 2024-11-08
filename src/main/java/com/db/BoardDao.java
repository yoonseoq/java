package com.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//dara access object
public class BoardDao {

    public int insBoard(Board board) {
        int result = 0;
        String sql = " INSERT INTO board " +
                " SET title = ? " +
                "  ,contents = ?" +
                " ,writer = ? ";
        try (Connection conn = MyConnection.getConn()
             ; PreparedStatement ps = conn.prepareStatement(sql)) {
            // ?부분에 값 채우기
            ps.setString(1, board.getTitle());
            ps.setString(2, board.getContents());
            ps.setString(3, board.getWriter());

            result = ps.executeUpdate();//쿼리실행
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    public List<Board> selBoardList(){
        // 보드주소값 하나주만  하나만나옴 . 배열이나 리스트 사용하자
     // 전수는 데이터 전부를 다 주면 된다. 파라미터는 없다.
        List<Board> list= new ArrayList<>();
        String sql = "select board_id , title  , contents ,  writer , created_at " +
                " from board" +
                " order by board_id desc  "; // 물음표가없어서 직빵으로 해결함
        try (Connection conn = MyConnection.getConn()
             ; PreparedStatement ps = conn.prepareStatement(sql)
             ; ResultSet rs= ps.executeQuery()) {
            //튜플선택 우ㅣ해사ㅓ 넥스트메소드 고름
            while(rs.next()){

                Board board = new Board();
                list.add(board); //리스트에 미리 담아놓기
                board.setBoardId(rs.getInt("board_id"));
                // 보드아이디의 컬럼을 정수화시켜서 보드의 멤버필드에 넣음
               // String title = rs.getString("title");
               // 이렇게 스프링 해도 되지만 안해도 딱히 ㄱㅊ
                board.setTitle(rs.getString("title"));
                board.setWriter(rs.getString("writer"));
                board.setCreatedAt(rs.getString("created_at"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
/*
    public List<Board> selBoardOne(){

        String sql = "select board_id , title  , contents ,  writer , created_at " +
                " from board" +
                " where board_id = ? ";
        ResultSet rs = null;
        try (Connection conn = MyConnection.getConn()
             ; PreparedStatement ps = conn.prepareStatement(sql))
              {
                  ps.setInt(1,boardId);
            //튜플선택 우ㅣ해사ㅓ 넥스트메소드 고름
            while(rs.next()){

                Board board = new Board();
                list.add(board); //리스트에 미리 담아놓기
                board.setBoardId(rs.getInt("board_id"));
                // 보드아이디의 컬럼을 정수화시켜서 보드의 멤버필드에 넣음
               // String title = rs.getString("title");
               // 이렇게 스프링 해도 되지만 안해도 딱히 ㄱㅊ
                board.setTitle(rs.getString("title"));
                board.setWriter(rs.getString("writer"));
                board.setCreatedAt(rs.getString("created_at"));
                return  board;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
                 if (rs != null){
                     try {rs.close();} catch (Exception e) {
                         throw new RuntimeException(e);
                     }
                 }
        }
        return list;
    }


 */




    // 삭제

    public int upBoard(Board board) {
        int result = 0;
        String sql = " UPDATE BOARD " +
                " SET TITLE = ? , CONTENTS = ? , WRITER = ? " +
                " WHERE BOARD_ID = ? ";
        try (Connection conn = MyConnection.getConn()
             ; PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, board.getTitle());
            ps.setString(2, board.getContents());
            ps.setString(3, board.getWriter());
            ps.setInt(4, board.getBoardId());

            result = ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public int delBoard(int boardId) {
        int result = 0;
        String sql = " DELETE FROM board " +
                " WHERE board_id = ? ";
        try (Connection conn = MyConnection.getConn()
             ; PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, boardId);
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public int updBoardDynamic(Board board) {
        int result = 0;
        StringBuilder sb = new StringBuilder();
        if (board.getTitle() != null && !board.getTitle().equals("")) {
            sb.append(String.format(", title = '%s' ", board.getTitle()));
        }
        if (board.getTitle() != null && !board.getContents().equals("")) {
            sb.append(String.format(", contents = '%s' ", board.getContents()));
        }
        if (board.getTitle() != null && !board.getWriter().equals("")) {
            sb.append(String.format(", writer ='%s' ", board.getWriter()));
        }
        String sql = String.format(" update board set %s where board_id = %d"
                , sb.deleteCharAt(0), board.getBoardId());
        System.out.println(sql);
        try(Connection conn = MyConnection.getConn()
            ; PreparedStatement ps = conn.prepareStatement(sql)){
            result= ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
// 수정은 내일로