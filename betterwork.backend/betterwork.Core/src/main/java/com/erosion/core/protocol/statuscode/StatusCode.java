package com.erosion.core.protocol.statuscode;

public class StatusCode {
    public int Code = 0;
    public String Message = null;

    public StatusCode(int code, String message)
    {
        Code = code;
        Message = message;
    }
}
