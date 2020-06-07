package cn.minalz.cloud.service;

import cn.minalz.cloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @description:
 * @author: minalz
 * @date: 2020-06-04 22:49
 **/
public interface PaymentService
{
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
