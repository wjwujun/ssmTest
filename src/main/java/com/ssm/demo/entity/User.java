package com.ssm.demo.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;
import java.util.Date;

/*
 Jackson 类库包含了很多注解，可以让我们快速建立 Java 类与 JSON 之间的关系。

@JsonProperty
@JsonProperty 注解指定一个属性用于 JSON 映射，默认情况下映射的 JSON 属性与注解的属性名称相同，不过可以使用该注解的 value 值修改 JSON 属性名，该注解还有一个 index 属性指定生成 JSON 属性的顺序，如果有必要的话。

@JsonIgnore
@JsonIgnore 注解用于排除某个属性，这样该属性就不会被 Jackson 序列化和反序列化。

@JsonIgnoreProperties
@JsonIgnoreProperties 注解是类注解。在序列化为 JSON 的时候，@JsonIgnoreProperties({"prop1", "prop2"}) 会忽略 pro1 和 pro2 两个属性。在从 JSON 反序列化为 Java 类的时候，@JsonIgnoreProperties(ignoreUnknown=true) 会忽略所有没有 Getter 和 Setter 的属性。该注解在 Java 类和 JSON 不完全匹配的时候很有用。

@JsonIgnoreType
@JsonIgnoreType 也是类注解，会排除所有指定类型的属性。

@JsonPropertyOrder
@JsonPropertyOrder 和 @JsonProperty 的 index 属性类似，指定属性序列化时的顺序。

@JsonRootName
@JsonRootName 注解用于指定 JSON 根属性的名称。

* */
/*
* 数据要传输，所以要序列化
* 使用 @Data 注解简化 POJO
*    @Data 包含了 @ToString，@EqualsAndHashCode，@Getter/@Setter 和 @RequiredArgsConstructor 的功能
* */
@Data
public class User implements Serializable {

    @NotEmpty(message = "姓名不能为空")
    private  String username;

    @JsonIgnore   //     在json序列化时将java bean中的一些属性忽略掉，序列化和反序列化都受影响。
    private  String pwd;
    private  String phone;
    private  String salt;
    private Date created;


}
