package kr.ac.kopo.board.dto;

import lombok.*;

import java.time.LocalDateTime;


//@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ReplyDTO {
    private Long rno;
    private String text;
    private String replyer;
    private Long bno;
    private LocalDateTime regDate, modDate;
}
