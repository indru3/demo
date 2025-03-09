package com.xworkz.newyear.constants;

import lombok.Getter;

@Getter
public enum ServiceConstant {
    FILE_PATH("C://project");
        private String path;
   private ServiceConstant(String path) {
       this.path=path;
    }
}
