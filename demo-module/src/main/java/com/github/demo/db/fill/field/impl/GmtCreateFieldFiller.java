package com.github.demo.db.fill.field.impl;

import com.github.demo.db.fill.field.FieldFiller;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;

import java.time.LocalDateTime;

/**
 * 创建时间填充器
 *
 * @author mq
 */
@Slf4j
public class GmtCreateFieldFiller implements FieldFiller {

    /**
     * 属性名称
     */
    private static final String FIELD_NAME = "gmtCreate";

    @Override
    public void doFiller(MetaObject metaObject) {
        if (metaObject.hasSetter(FIELD_NAME)) {
            log.debug("start insert fill {}", FIELD_NAME);
            metaObject.setValue(FIELD_NAME, LocalDateTime.now());
        }
    }
}
