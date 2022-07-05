package pratice.service.Dao;

import pratice.dto.BoardDto;

import java.sql.SQLException;

public class BoardDao extends Dao{

    public BoardDao() {
        super();
    }
    public static BoardDao boardDao = new BoardDao();

    public static BoardDao getDebateDao() {
        return boardDao;
    }

    public boolean write(BoardDto boardDto) {
        String sql = "INSERT INTO board(btitle,bcontent,bwriter) values (?,?,?)";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1, boardDto.getBtitle());
            ps.setString(2, boardDto.getBcontent());
            ps.setString(3, boardDto.getBwriter());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("글쓰기  에러  경로: dao.IBoardDao @@@  "+e);
        }

        return false;
    }






}
