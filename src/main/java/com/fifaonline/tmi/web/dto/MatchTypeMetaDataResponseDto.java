package com.fifaonline.tmi.web.dto;

import com.fifaonline.tmi.domain.MatchType;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MatchTypeMetaDataResponseDto {
    private String matchtype;
    private String desc;

    public MatchType toEntity() {
        return MatchType.builder()
                .matchType(matchtype)
                .desc(desc).build();
    }
}
