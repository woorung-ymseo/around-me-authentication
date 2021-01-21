package com.around.me.authentication.api.v1.authentication.controller;


import com.around.me.authentication.core.annotaion.version.RestMappingV1;
import com.around.me.authentication.core.dto.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;

@Api(tags = "인증")
@Slf4j
@RequiredArgsConstructor
@RestMappingV1
public class AuthenticationController {


    @ApiImplicitParam(name = "X-Auth-Token", value = "access토큰", required = true,dataType = "String", paramType = "header")
    @ApiOperation(value = "인증")
    @PostMapping(value = "/authentication")
    Response<String> authentication( @RequestBody String paramStr, @ApiIgnore Errors errors, HttpServletResponse response) {

        return Response.ok("성공");
    }
}
//