package pratice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import pratice.dto.BoardDto;
import pratice.service.BoardService;
import pratice.service.Dao.BoardDao;



@RestController
public class BoardController {

    @Autowired
    BoardService service;

    BoardDao boardDao = new BoardDao();

    @PostMapping("/day01/board/write")
    public boolean boardwrite(BoardDto boardDto) {
        return service.boardwrite(boardDto);
    }


    @PostMapping("/day01/board/write2")
    public boolean boardwrite2(BoardDto boardDto) {
        return boardDao.write(boardDto);
    }
}
