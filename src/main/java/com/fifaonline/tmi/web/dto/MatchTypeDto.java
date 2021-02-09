package com.fifaonline.tmi.web.dto;

import com.fifaonline.tmi.domain.MatchType;
import lombok.Getter;

@Getter
public class MatchTypeDto {
    private int matchtype;
    private String desc;

    public MatchType toEntity() {
        return MatchType.builder()
                .matchType(matchtype)
                .desc(desc).build();
    }
}
