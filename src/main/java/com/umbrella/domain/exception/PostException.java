package com.umbrella.domain.exception;

import com.umbrella.exception.BaseException;
import com.umbrella.exception.BaseExceptionType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PostException extends BaseException {
    private BaseExceptionType baseExceptionType;

}
