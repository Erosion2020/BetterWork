package com.erosion.test;

import com.erosion.core.protocol.statuscode.HttpStatusCode;
import com.erosion.core.protocol.statuscode.StatusCode;
import org.junit.Test;

public class TestHttpStatusCode {
    @Test
    public void testInit()
    {
        int code = HttpStatusCode.Accepted.Code;
        String message = HttpStatusCode.Accepted.Message;

        System.out.println(code);
        System.out.println(message);
        HttpStatusCode statusCode = new HttpStatusCode();
        //StatusCode statusCode1 = statusCode.GetStatusCode(100);
        //System.out.println(statusCode1.Code);
        //System.out.println(statusCode1.Message);
    }
}
