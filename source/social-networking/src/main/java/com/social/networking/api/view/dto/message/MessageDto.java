package com.social.networking.api.view.dto.message;

import com.social.networking.api.view.dto.InfoAdminDto;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class MessageDto extends InfoAdminDto {
    @ApiModelProperty(name = "conversationId")
    private Long conversationId;
    @ApiModelProperty(name = "senderId")
    private Long senderId;
    @ApiModelProperty(name = "content")
    private String content;
}
