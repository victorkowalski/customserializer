package com.vkowalsky.customserializer.model;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * Created by victor on 08.07.17.
 */
public class TestModel {
    public int version;
    public String text;

    public TestModel() {
    }

    public TestModel(int version, String text) {
        this.version = version;
        this.text = text;
    }

    public TestModel(Map<String, Object> data) throws Exception {
        for (Field field : TestModel.class.getDeclaredFields()) {
            field.set(this, data.get(field.getName()));
        }
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
