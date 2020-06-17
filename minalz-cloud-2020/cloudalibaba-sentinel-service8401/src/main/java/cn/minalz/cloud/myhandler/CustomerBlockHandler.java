package cn.minalz.cloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import cn.minalz.cloud.entities.CommonResult;
import cn.minalz.cloud.entities.Payment;

/**
 * @auther minalz
 * @create 2020-06-17 15:32
 */
public class CustomerBlockHandler
{
    public static CommonResult handlerException(BlockException exception)
    {
        return new CommonResult(4444,"按客戶自定义,global handlerException----1");
    }
    public static CommonResult handlerException2(BlockException exception)
    {
        return new CommonResult(4444,"按客戶自定义,global handlerException----2");
    }
}
