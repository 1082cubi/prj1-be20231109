package com.example.prj1be20231109.servise;

import com.example.prj1be20231109.domain.Board;
import com.example.prj1be20231109.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper mapper;

    public boolean save(Board board) {
        return mapper.insert(board)==1;
    }

    public boolean validate(Board board) {
        if (board == null) {
            return false;
        }
        if (board.getContent() == null || board.getcontent().isBlank()) {
            return false;
        } if (board.getTitle() == null || board.getcontent().isBlank()) {
            return false;
        } if (board.getWriter() == null || board.getcontent().isBlank()) {
            return false;
        }
    }
}
