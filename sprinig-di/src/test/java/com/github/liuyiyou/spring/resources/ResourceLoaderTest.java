package com.github.liuyiyou.spring.resources;

import junit.framework.Assert;
import org.junit.Test;
import org.springframework.core.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: liuyiyou
 * Date: 14-7-24
 * Time: 下午4:46
 * To change this template use File | Settings | File Templates.
 */
public class ResourceLoaderTest {

    @Test
    public void testResourceLoader(){

        ResourceLoader loader = new DefaultResourceLoader();

        Resource resource  = loader.getResource("classpath:arrayDi.xml");

        Assert.assertEquals(ClassPathResource.class,resource.getClass());


     //   Resource  resource2  = loader.getResource("flie:/src/main/resources/arrayDi.xml");

     //   Assert.assertEquals(UrlResource.class,resource2.getClass());

        Resource resource3  = loader.getResource("arrayDi.xml");

        Assert.assertTrue(resource3 instanceof ClassPathResource);



    }
}
