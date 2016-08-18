package com.paddle.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/8/16.
 */
public class No implements Serializable{
    private int noid;

    public void setNoid(int noid){
        this.noid = noid;
    }

    public int getNoid(){
        return this.noid;
    }
}
