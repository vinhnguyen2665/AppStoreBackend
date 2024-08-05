package com.vinhnq.beans;


import com.vinhnq.service.ReadFileInformationService;
import com.vinhnq.service.impl.ReadFileInformationServiceImpl;

import java.io.File;

public class test {
    public static void main(String[] args) {
        ReadFileInformationService readFileInformationService = new ReadFileInformationServiceImpl();
        AppInfoBean infoBean = readFileInformationService.readFileIPA(
                new File("/home/vinhn/Downloads/HiroCargoTest_2.0.ipa"), new FileSize(15D, "MB"),
                "host");
        System.out.println(infoBean.toString());

    }


}
