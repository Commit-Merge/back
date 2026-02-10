package com.app.candm.dto;

import com.app.candm.common.enumeration.Status;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode(of="id")
@NoArgsConstructor
public class TeamDTO {
    private Long id;
    private String teamTitle;
    private String teamUrl;
    private String teamContactEmail;
    private Status teamStatus;
    private String teamIntro;
    private Long memberId;
    private String createdDatetime;
    private String updatedDatetime;

}
