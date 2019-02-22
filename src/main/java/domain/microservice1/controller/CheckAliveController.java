package domain.microservice1.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api
@RestController
@RequestMapping("check")
public class CheckAliveController {


    @ApiOperation(value="check", nickname="check", response=String.class)
    @GetMapping("")
    public String check(){
        return "OK";
    }

}
