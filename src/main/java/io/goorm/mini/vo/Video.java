package io.goorm.mini.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Video {

    private Long VideoSeq;
    private String Video;
    private String VideoThumnail;
    private Long MemberSeq;
    private String RegDate;

    private int publishYn;
    private String deleteYn;
}
