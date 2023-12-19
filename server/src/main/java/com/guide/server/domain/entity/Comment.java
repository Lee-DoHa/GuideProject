package com.guide.server.domain.entity;

import javax.persistence.*;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Long id;

    private String content;

    /**
     * TODO 댓글 구성
     * 회원 1:N 댓글
     * 장소 1:N 댓글
     * 본문이 있으면 될거같고,
     * 본문 + 사진까지?
     * 사진은 한장? 여러장?
     * 여러장일 경우에, 댓글 1:N 사진
     */

}
