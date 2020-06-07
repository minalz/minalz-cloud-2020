package cn.minalz.cloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: minalz
 * @date: 2020-06-04 22:49
 **/
@Data
//@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T>
{
    private Integer code;
    private String  message;
    private T       data;

    public CommonResult(Integer code, String message)
    {
        this(code,message,null);
    }

    public CommonResult(Integer code, String message, T data)
    {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
