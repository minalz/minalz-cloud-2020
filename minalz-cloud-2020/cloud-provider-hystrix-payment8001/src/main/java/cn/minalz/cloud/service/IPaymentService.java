package cn.minalz.cloud.service;

/**
 * @description:
 * @author: minalz
 * @date: 2020-06-10 07:44
 **/
public interface IPaymentService {

    String paymentInfo_OK(Integer id);

    String paymentInfo_TimeOut(Integer id);

}
