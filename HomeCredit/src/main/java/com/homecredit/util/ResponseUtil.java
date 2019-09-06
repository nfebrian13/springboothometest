package com.homecredit.util;

import com.homecredit.dto.response.ErrorResponseDto;
import com.homecredit.dto.response.SuccessResponseDto;

/**
 * @author Nana Febriana
 */

public class ResponseUtil {

	public static SuccessResponseDto<Object> success() {
		return new SuccessResponseDto<Object>();
	}

	public static ErrorResponseDto error() {
		return new ErrorResponseDto();
	}
}