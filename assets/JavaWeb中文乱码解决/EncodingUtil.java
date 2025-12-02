package util;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.UnsupportedEncodingException;

/**
 * 编码工具类，用于统一处理各种编码设置
 */
public class EncodingUtil {

    /**
     * 设置控制台输出编码为UTF-8
     */
    public static void setConsoleEncoding() {
        try {
            System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        } catch (java.io.UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    /**
     * 设置HTTP请求和响应的编码为UTF-8
     * @param request HTTP请求对象
     * @param response HTTP响应对象
     */
    public static void setHttpRequestResponseEncoding(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
    }

    /**
     * 一次性设置所有编码（控制台、请求、响应）
     * @param request HTTP请求对象
     * @param response HTTP响应对象
     */
    public static void setAllEncodings(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        setConsoleEncoding();
        setHttpRequestResponseEncoding(request, response);
    }
}
