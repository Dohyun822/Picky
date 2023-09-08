package com.picky.business.log.domain.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="log_search")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
//검색했을 때, 찍는 로그
public class LogSearch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String keyword;
    private LocalDate createdAt;
}
