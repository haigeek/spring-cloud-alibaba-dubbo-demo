package com.haigeek.api.service;

import java.util.Map;

/**
 * @author zhaohj
 * @date 2020-02-11 09:39
 */
public interface RestService {
    String param(String param);

    String params(int a, String b);

    String headers(String header, String header2, Integer param);

    String pathVariables(String path1, String path2, String param);

    String form(String form);

    User requestBodyMap(Map<String, Object> data, String param);

    Map<String, Object> requestBodyUser(User user);

}
