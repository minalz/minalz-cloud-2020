package cn.minalz.cloud.service.impl;


import cn.minalz.cloud.dao.PaymentDao;
import cn.minalz.cloud.entities.Payment;
import cn.minalz.cloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description:
 * @author: minalz
 * @date: 2020-06-04 22:49
 **/
@Service
public class PaymentServiceImpl implements PaymentService
{
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id)
    {
        return paymentDao.getPaymentById(id);
    }
}
