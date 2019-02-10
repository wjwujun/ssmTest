package com.ssm.demo.exception;




/*自定义异常*/
public class myException extends Exception {
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


}
