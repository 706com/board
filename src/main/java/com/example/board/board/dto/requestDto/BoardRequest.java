package com.example.board.board.dto.requestDto;

import com.example.board.member.domain.Member;
import lombok.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BoardRequest {

    private Long boardId;

    private String title;

    private String content;

    @Builder
    BoardRequest(Long boardId, String title, String content){
        this.boardId = boardId;
        this.title = title;
        this.content = content;
    }
}
