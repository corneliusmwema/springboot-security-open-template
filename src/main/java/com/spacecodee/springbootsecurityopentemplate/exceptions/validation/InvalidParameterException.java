package com.spacecodee.springbootsecurityopentemplate.exceptions.validation;

import com.spacecodee.springbootsecurityopentemplate.exceptions.base.BaseException;

public class InvalidParameterException extends BaseException {

    public InvalidParameterException(String messageKey, String locale) {
        super(messageKey, locale);
    }

    public InvalidParameterException(String messageKey, String locale, Object... parameters) {
        super(messageKey, locale, parameters);
    }

}