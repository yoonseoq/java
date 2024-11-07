package com.db;

import java.sql.Connection;
import java.sql.PreparedStatement;

//dara access object
public class BoardDao {

    public int insBoard(Board board){
        int result=0;
        String sql=" INSERT INTO board "+
                " SET title = ? "+
                "  ,contents = ?"+
                " ,writer = ? ";
        try (Connection conn = MyConnection.getConn()
            ; PreparedStatement ps = conn.prepareStatement(sql)){
            // ?부분에 값 채우기
            ps.setString(1,board.getTitle());
            ps.setString(2, board.getContents());
            ps.setString(3, board.getWriter());

            result = ps.executeUpdate();//쿼리실행
        } catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    // 삭제

    public int delBoard(int boardId){
        int result=0;
        String sql=" DELETE FROM board "+
                " WHERE board_id = ? "; // 스페이스바도 중요
        try (Connection conn=MyConnection.getConn()
        ; PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1,boardId);
            // 왜 안됐ㄴ,ㄵ; 물음표가 하나밖에 없었어서 인덱스가 2부터이면 말도안돼서 에러가 터짐
            result=ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
// 수정은 내일로