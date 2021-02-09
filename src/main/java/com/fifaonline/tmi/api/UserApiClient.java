package com.fifaonline.tmi.api;

import com.fifaonline.tmi.config.ApiKey;
import com.fifaonline.tmi.web.dto.MatchTypeDto;
import com.fifaonline.tmi.web.dto.UserApiResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.inject.Inject;

@RequiredArgsConstructor
@Service
public class UserApiClient {

    private final RestTemplate restTemplate;

    @Inject
    private ApiKey apiKey;

    private final String UserInfoUrl = "https://api.nexon.co.kr/fifaonline4/v1.0/users?nickname={nickname}";

    public UserApiResponseDto requestUserInfo(String nickname) {
        final HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Authorization", apiKey.getKey());
        final HttpEntity<String> entity = new HttpEntity<>(httpHeaders);

        return restTemplate.exchange(UserInfoUrl, HttpMethod.GET, entity, UserApiResponseDto.class, nickname).getBody();
    }

    public MatchTypeDto[] requestMatchTypeMetaDate() {
        MatchTypeDto[] matchTypeDtoArray = null;

        try {
            ResponseEntity<MatchTypeDto[]> responseEntity =
                    restTemplate.getForEntity("https://static.api.nexon.co.kr/fifaonline4/latest/matchtype.json", MatchTypeDto[].class);
            matchTypeDtoArray = responseEntity.getBody();
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return matchTypeDtoArray;
    }
}