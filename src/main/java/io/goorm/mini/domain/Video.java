package io.goorm.mini.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Video {

    private Long videoSeq;

    private String video;
    private String videoThumnail;

    private int publishYn;
    private String deleteYn;

    private Long memberSeq;
    private String regDate;

}
