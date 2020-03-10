package com.dujia.help;


import com.dujia.config.InfoSdateMessage;
import com.dujia.util.RandomCharacterUtil;
import com.dujia.util.ResultModel;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/help")
public class HelpController {

    @ApiOperation(value = "获取字符串", notes = "")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "noneLength", value = "字符长度", dataType = "java.lang.Integer", paramType = "query", required = true),
        @ApiImplicitParam(name = "noneType", value = "字符类型", dataType = "java.lang.String", paramType = "query", required = true)
    })
    @PostMapping("/randomText")
    public ResultModel getRandom(Integer noneLength, String noneType){
        if(noneLength == null && noneType.isEmpty()){
            return new ResultModel(HttpServletResponse.SC_BAD_REQUEST, InfoSdateMessage.DATA_PARAMETER_NULL, false);
        }
        String random = new RandomCharacterUtil().CharacterRandomArray(noneLength,noneType);
        return new ResultModel(HttpServletResponse.SC_OK,InfoSdateMessage.SUCCESS,true);
    }

}
