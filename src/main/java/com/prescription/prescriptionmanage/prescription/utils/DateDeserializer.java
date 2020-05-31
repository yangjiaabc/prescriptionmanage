package com.prescription.prescriptionmanage.prescription.utils;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;
import java.util.Date;

/**
 * @program: WeChatServer
 * @description:
 * @author: guozhifu
 * @create: 2018-07-31 18:35
 **/
public class DateDeserializer implements JsonSerializer<Date> {

    @Override
    public JsonElement serialize(Date date, Type type, JsonSerializationContext jsonSerializationContext) {


        return new JsonPrimitive(date.getTime());
    }
}
