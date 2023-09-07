package com.webjava.utils;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import org.apache.commons.beanutils.PropertyUtils;

import java.beans.PropertyDescriptor;
import java.util.HashMap;
import java.util.Map;

public class BeanProtoUtil {

    /**
     * bean抓换为protobuf
     * @param message
     * @param descriptor
     * @param srcObject
     * @throws Exception
     */
    public static void setMessageBuilder(Builder message,Descriptor descriptor,Object srcObject) throws Exception {
        String cname = srcObject.getClass().getName();
        if (srcObject == null) {
            return;
        }
        final PropertyDescriptor[] propertyDescriptors = PropertyUtils.getPropertyDescriptors(srcObject);

        Map map = new HashMap();
        for (final PropertyDescriptor sourceDescriptor : propertyDescriptors) {
            final String pName = sourceDescriptor.getName();
            System.out.println(" processing property "+ pName);
            Object value= PropertyUtils.getProperty(srcObject, pName);
            if(value==null || value == "") continue;

            Descriptors.FieldDescriptor fd=descriptor.findFieldByName(pName) ;

            System.out.println(" property "+  pName+" , found fd :"+ (fd==null ? "nul":"ok"));
            message.setField(fd, value);
            System.out.println(" property "+  pName+"  set ok,");

        }
        return ;
    }
}
