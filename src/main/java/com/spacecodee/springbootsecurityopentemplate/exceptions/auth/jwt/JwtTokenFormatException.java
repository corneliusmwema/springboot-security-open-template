package com.spacecodee.springbootsecurityopentemplate.exceptions.auth.jwt;

import com.spacecodee.springbootsecurityopentemplate.exceptions.base.BaseException;

public class JwtTokenFormatException extends BaseException {

    public JwtTokenFormatException(String messageKey, String locale, Object... parameters) {
        super(messageKey, locale, parameters);
    }

}
