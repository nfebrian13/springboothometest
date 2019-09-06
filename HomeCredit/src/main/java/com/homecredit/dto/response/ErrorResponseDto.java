package com.homecredit.dto.response;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author Nana Febriana
 */

@JsonPropertyOrder({ "code", "status", "message" })
public class ErrorResponseDto extends AbstractResponseDto {

}