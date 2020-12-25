package com.zb.filter;

import com.alibaba.fastjson.JSON;
import com.zb.model.Result;
import com.zb.model.User;
import com.zb.token.TokenUtils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: zhenwei.xu
 * @Date: 2020/12/7 18:02
 */
@WebFilter(filterName = "loginFilter", urlPatterns = {"/*"})
public class LoginFilter implements Filter {

    private String expect_url = "/api/admin/login";
    private String expect_url2 = "/api/admin/register";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
        throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;
        String url = request.getRequestURI();
//        boolean needFilter = !expect_url.equals(url);
        boolean needFilter = !expect_url.equals(url) && !expect_url2.equals(url);
        if (needFilter) {
            String authorization = request.getHeader("Authorization");
            if (null != authorization) {

                // 验证token
                User user = TokenUtils.getToken(authorization);
                if (null != user) {
                    request.setAttribute("token", authorization);
                    chain.doFilter(servletRequest, servletResponse);
                } else {
                    errorResponse(response, "您还未登录");
                }
            } else {
                errorResponse(response, "token不存在");
            }
        } else {
            chain.doFilter(servletRequest, servletResponse);
        }
    }

    private void errorResponse(HttpServletResponse response, String errorMsg) throws IOException {

        Result result = Result.newInstance();
        result.setCode(999);
        result.setMessage(errorMsg);
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");

        response.getWriter().write(JSON.toJSONString(result));
    }

    @Override
    public void destroy() {

    }
}
