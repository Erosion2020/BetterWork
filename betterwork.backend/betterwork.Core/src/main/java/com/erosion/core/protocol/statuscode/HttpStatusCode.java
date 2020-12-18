package com.erosion.core.protocol.statuscode;

import org.springframework.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

public class HttpStatusCode {

    //1xx
    public static final StatusCode Continue = new StatusCode(100,"Continue");
    public static final StatusCode SwitchingProtocols = new StatusCode(101,"Switching Protocols");
    public static final StatusCode Processing = new StatusCode(102,"Processing");
    public static final StatusCode Checkpoint = new StatusCode(103,"Checkpoint");

    //2xx
    public static final StatusCode OK = new StatusCode(200,"OK");
    public static final StatusCode Created = new StatusCode(201,"Created");
    public static final StatusCode Accepted = new StatusCode(202,"Accepted");
    public static final StatusCode NonAuthoritativeInformation = new StatusCode(203,"NonAuthoritativeInformation");
    public static final StatusCode NoContent = new StatusCode(204,"NoContent");
    public static final StatusCode ResetContent = new StatusCode(205,"ResetContent");
    public static final StatusCode PartialContent = new StatusCode(206,"PartialContent");
    public static final StatusCode MultiStatus = new StatusCode(207,"MultiStatus");
    public static final StatusCode AlreadyReported = new StatusCode(208,"AlreadyReported");
    public static final StatusCode IMUsed = new StatusCode(226,"IMUsed");

    //3XX
    public static final StatusCode MultipleChoices = new StatusCode(300,"MultipleChoices");
    public static final StatusCode MovedPermanently = new StatusCode(301,"MovedPermanently");
    public static final StatusCode Found = new StatusCode(302,"Found");
    //public static final StatusCode MovedTemporarily = new StatusCode(302,"MovedTemporarily");
    public static final StatusCode SeeOther = new StatusCode(303,"SeeOther");
    public static final StatusCode NotModified = new StatusCode(304,"NotModified");
    public static final StatusCode UseProxy = new StatusCode(305,"UseProxy");
    public static final StatusCode TemporaryRedirect = new StatusCode(307,"TemporaryRedirect");
    public static final StatusCode PermanentRedirect = new StatusCode(308,"PermanentRedirect");

    //4xx
    public static final StatusCode BadRequest = new StatusCode(400,"BadRequest");
    public static final StatusCode Unauthorized = new StatusCode(401,"Unauthorized");
    public static final StatusCode PaymentRequired = new StatusCode(402,"PaymentRequired");
    public static final StatusCode Forbidden = new StatusCode(403,"Forbidden");
    public static final StatusCode NotFound = new StatusCode(404,"NotFound");
    public static final StatusCode MethodNotAllowed = new StatusCode(405,"MethodNotAllowed");
    public static final StatusCode NotAcceptable = new StatusCode(406,"NotAcceptable");
    public static final StatusCode ProxyAuthenticationRequired = new StatusCode(407,"ProxyAuthenticationRequired");
    public static final StatusCode RequestTimeout = new StatusCode(408,"RequestTimeout");
    public static final StatusCode Conflict = new StatusCode(409,"Conflict");
    public static final StatusCode Gone = new StatusCode(410,"Gone");
    public static final StatusCode LengthRequired = new StatusCode(411,"LengthRequired");
    public static final StatusCode PreconditionFailed = new StatusCode(412,"PreconditionFailed");
    public static final StatusCode PayloadTooLarge = new StatusCode(413,"PayloadTooLarge");
    //public static final StatusCode RequestEntityTooLarge = new StatusCode(413,"Request Entity Too Large");
    public static final StatusCode URITooLong = new StatusCode(414,"URITooLong");
    //public static final StatusCode RequestURITooLong = new StatusCode(414,"RequestURITooLong");
    public static final StatusCode UnsupportedMediaType = new StatusCode(415,"UnsupportedMediaType");
    public static final StatusCode RequestedRangeNotSatisfiable = new StatusCode(416,"RequestedRangeNotSatisfiable");
    public static final StatusCode ExpectationFailed = new StatusCode(417,"ExpectationFailed");
    public static final StatusCode IAmTeapot = new StatusCode(418,"IAmTeapot");
    public static final StatusCode InsufficientSpaceOnResource = new StatusCode(419,"InsufficientSpaceOnResource");
    public static final StatusCode MethodFailure = new StatusCode(420,"MethodFailure");
    public static final StatusCode DestinationLocked = new StatusCode(421,"DestinationLocked");
    public static final StatusCode UnprocessableEntity = new StatusCode(422,"UnprocessableEntity");
    public static final StatusCode Locked = new StatusCode(423,"Locked");
    public static final StatusCode FailedDependency = new StatusCode(424,"FailedDependency");
    public static final StatusCode TooEarly = new StatusCode(425,"TooEarly");
    public static final StatusCode UpgradeRequired = new StatusCode(426,"UpgradeRequired");
    //public static final StatusCode URITooLong = new StatusCode(427,"URITooLong");
    public static final StatusCode PreconditionRequired = new StatusCode(428,"PreconditionRequired");
    public static final StatusCode TooManyRequests = new StatusCode(429,"TooManyRequests");
    public static final StatusCode RequestHeaderFieldsTooLarge = new StatusCode(431,"RequestHeaderFieldsTooLarge");
    public static final StatusCode UnavailableForLegalReasons = new StatusCode(451,"UnavailableForLegalReasons");

    //5xx
    public static final StatusCode InternalServerError = new StatusCode(500,"UnavailableForLegalReasons");
    public static final StatusCode NotImplemented = new StatusCode(501,"UnavailableForLegalReasons");
    public static final StatusCode BadGateway = new StatusCode(502,"UnavailableForLegalReasons");
    public static final StatusCode ServiceUnavailable = new StatusCode(503,"UnavailableForLegalReasons");
    public static final StatusCode GatewayTimeout = new StatusCode(504,"UnavailableForLegalReasons");
    public static final StatusCode HTTPVersionNotSupported = new StatusCode(505,"UnavailableForLegalReasons");
    public static final StatusCode VariantAlsoNegotiates = new StatusCode(506,"UnavailableForLegalReasons");
    public static final StatusCode InsufficientStorage = new StatusCode(507,"UnavailableForLegalReasons");
    public static final StatusCode LoopDetected = new StatusCode(508,"UnavailableForLegalReasons");
    public static final StatusCode BandwidthLimitExceeded = new StatusCode(509,"UnavailableForLegalReasons");
    public static final StatusCode NotExtended = new StatusCode(510,"UnavailableForLegalReasons");
    public static final StatusCode NetworkAuthenticationRequired = new StatusCode(511,"UnavailableForLegalReasons");

    public static final Map<Integer,StatusCode> map = new HashMap<>();

    public HttpStatusCode()
    {
        InitStatusCode();
    }

    private static final void InitStatusCode()
    {
        //1xx Series status code
        map.put(100,Continue);
        map.put(101,SwitchingProtocols);
        map.put(102,Processing);
        map.put(103,Checkpoint);
        //2xx Series status code
        map.put(200,OK);
        map.put(201,Created);
        map.put(202,Accepted);
        map.put(203,NonAuthoritativeInformation);
        map.put(204,NoContent);
        map.put(205,ResetContent);
        map.put(206,PartialContent);
        map.put(207,MultiStatus);
        map.put(208,AlreadyReported);
        map.put(226,IMUsed);
        //3xx Series status code
        map.put(300,MultipleChoices);
        map.put(301,MovedPermanently);
        map.put(302,Found);
        map.put(303,SeeOther);
        map.put(304,NotModified);
        map.put(305,UseProxy);
        map.put(307,TemporaryRedirect);
        map.put(308,PermanentRedirect);
        //4xx Series status code
        map.put(400,BadRequest);
        map.put(401,Unauthorized);
        map.put(402,PaymentRequired);
        map.put(403,Forbidden);
        map.put(404,NotFound);
        map.put(405,MethodNotAllowed);
        map.put(406,NotAcceptable);
        map.put(407,ProxyAuthenticationRequired);
        map.put(408,RequestTimeout);
        map.put(409,Conflict);
        map.put(410,Gone);
        map.put(411,LengthRequired);
        map.put(412,PreconditionFailed);
        map.put(413,PayloadTooLarge);
        map.put(414,URITooLong);
        map.put(415,UnsupportedMediaType);
        map.put(416,RequestedRangeNotSatisfiable);
        map.put(417,ExpectationFailed);
        map.put(418,IAmTeapot);
        map.put(419,InsufficientSpaceOnResource);
        map.put(420,MethodFailure);
        map.put(421,DestinationLocked);
        map.put(422,UnprocessableEntity);
        map.put(423,Locked);
        map.put(424,FailedDependency);
        map.put(425,TooEarly);
        map.put(426,UpgradeRequired);
        //map.put(427,);
        map.put(428,PreconditionRequired);
        map.put(429,TooManyRequests);
        map.put(431,RequestHeaderFieldsTooLarge);
        map.put(451,UnavailableForLegalReasons);
        //4xx Series status code
        map.put(500,InternalServerError);
        map.put(501,NotImplemented);
        map.put(502,BadGateway);
        map.put(503,ServiceUnavailable);
        map.put(504,GatewayTimeout);
        map.put(505,HTTPVersionNotSupported);
        map.put(506,VariantAlsoNegotiates);
        map.put(507,InsufficientStorage);
        map.put(508,LoopDetected);
        map.put(509,BandwidthLimitExceeded);
        map.put(510,NotExtended);
        map.put(511,NetworkAuthenticationRequired);

    }

    static boolean Resolver(int statusCode)
    {
        return false;
    }
    private static boolean CheckingRange(int code, int minValue, int maxValue)
    {
        if(code < minValue || code > maxValue)
            return false;
        return true;
    }

    static StatusCode ValueOf(int statusCode){ return null; }
    static StatusCode GetStatusCode(int code){ return null; }

    public boolean isHTTPStatusCode(HttpStatus statusCode) {
        return map.get(statusCode.value()) == null ? false : true;
    }

    public boolean is1xxHTTPStatusCode(HttpStatus statusCode) {
        if(!CheckingRange(statusCode.value(),100,199))
            return false;
        if(map.get(statusCode.value()) == null)
            return false;
        return true;
    }

    public boolean is2xxHTTPStatusCode(HttpStatus statusCode) {
        if(!CheckingRange(statusCode.value(),200,299))
            return false;
        if(map.get(statusCode.value()) == null)
            return false;
        return true;
    }

    public boolean is3xxHTTPStatusCode(HttpStatus statusCode) {
        if(!CheckingRange(statusCode.value(),300,399))
            return false;
        if(map.get(statusCode.value()) == null)
            return false;
        return true;
    }

    public boolean is4xxHTTPStatusCode(HttpStatus statusCode) {
        if(!CheckingRange(statusCode.value(),400,499))
            return false;
        if(map.get(statusCode.value()) == null)
            return false;
        return true;
    }

    public boolean is5xxHTTPStatusCode(HttpStatus statusCode) {
        if(!CheckingRange(statusCode.value(),500,599))
            return false;
        if(map.get(statusCode.value()) == null)
            return false;
        return true;
    }

    public boolean isHTTPStatusCode(StatusCode statusCode) {
        return map.get(statusCode.Code) == null ? false : true;
    }

    public boolean is1xxHTTPStatusCode(StatusCode statusCode) {
        if(!CheckingRange(statusCode.Code,100,199))
            return false;
        if(map.get(statusCode.Code) == null)
            return false;
        return true;
    }

    public boolean is2xxHTTPStatusCode(StatusCode statusCode) {
        if(!CheckingRange(statusCode.Code,200,299))
            return false;
        if(map.get(statusCode.Code) == null)
            return false;
        return true;
    }

    public boolean is3xxHTTPStatusCode(StatusCode statusCode) {
        if(!CheckingRange(statusCode.Code,300,399))
            return false;
        if(map.get(statusCode.Code) == null)
            return false;
        return true;
    }

    public boolean is4xxHTTPStatusCode(StatusCode statusCode) {
        if(!CheckingRange(statusCode.Code,400,499))
            return false;
        if(map.get(statusCode.Code) == null)
            return false;
        return true;
    }

    public boolean is5xxHTTPStatusCode(StatusCode statusCode) {
        if(!CheckingRange(statusCode.Code,500,599))
            return false;
        if(map.get(statusCode.Code) == null)
            return false;
        return true;
    }
}
