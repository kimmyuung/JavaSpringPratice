package pratice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pratice.domain.jpa.BoardEntity;
import pratice.domain.jpa.BoardRepository;
import pratice.dto.BoardDto;

@Service
public class BoardService {

    @Autowired
    BoardRepository boardRepository;
    public boolean boardwrite(BoardDto boardDto) {
        BoardEntity boardEntity = boardDto.toentity();
        boardRepository.save(boardEntity);
        return true;
    }
}
