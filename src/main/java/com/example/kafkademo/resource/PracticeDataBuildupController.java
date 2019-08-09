package com.example.kafkademo.resource;

import com.example.kafkademo.service.PracticeDataBuildupService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "Kafkedemo/api")
@Api(description = "List Employee Names", tags = "Employees")
public class PracticeDataBuildupController {

    private static final Logger LOGGER = LogManager.getLogger(PracticeDataBuildupService.class);

    @Autowired
    private PracticeDataBuildupService practiceDataBuildupService;


    @ApiOperation(value = "Sample Resource Test", notes = "Sample Resource Test1 ")
    @GetMapping(value = "/sendMessage", produces = MediaType.APPLICATION_JSON_VALUE)
    public void test1() {
        practiceDataBuildupService.sendMessage1();
    }

    @ApiOperation(value = "Sample Resource Test", notes = "Sample Resource Test2 ")
    @GetMapping(value = "/sendMessage/{cableAccountNumber}/{divisionId}" , produces = APPLICATION_JSON_VALUE)
    public String test2(
            @ApiParam(value = "Cable Account Number", required = true, defaultValue = "123654789") @PathVariable("cableAccountNumber") String cableAccountNumber,
            @ApiParam(value = "Division ID", required = true, defaultValue = "CHTR.8087") @PathVariable("divisionId") String divisionId
    ){
         return practiceDataBuildupService.sendMessage2(cableAccountNumber, divisionId);

    }

    @ApiOperation(value = "Sample Resource Test", notes = "Sample Resource Test3 ")
    @GetMapping(value = "/sendMessage/{name}" , produces = APPLICATION_JSON_VALUE)
    public String test3(
            @ApiParam(value = "name", required = true, defaultValue = "Vam") @PathVariable("name") String name){
        LOGGER.info(practiceDataBuildupService.sendMessage3(name));
        return practiceDataBuildupService.sendMessage3(name);

    }

}
