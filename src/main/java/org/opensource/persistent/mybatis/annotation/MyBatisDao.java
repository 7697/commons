package org.opensource.persistent.mybatis.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.stereotype.Component;
/**
 * 标注MyBatisDao，以便{@link org.mybatis.spirng.mapper.MapperScannerConfigure}扫描
 * @author king   2016-08-30 23:37
 * @version 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Component
public @interface MyBatisDao {

}
