package com.github.liuyiyou.spring.ioc;

/**
 * Created with IntelliJ IDEA.
 * User: liuyiyou
 * Date: 14-7-24
 * Time: 上午11:15
 * To change this template use File | Settings | File Templates.
 */
public class InstanceByStaticFactory {

    public static HelloApi newInstance (String message){
        return new InstanceByConstruct(message);
    }
}
