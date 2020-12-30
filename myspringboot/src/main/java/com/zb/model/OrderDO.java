package com.zb.model;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OrderDO {

    private Integer id;

    private String orderSn;

    private String receiverKeyword;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    private String memberUsername;

    private Date deliveryTime;

    private Date paymentTime;

    private Date receiveTime;

    private String receiverName;

    private String receiverPhone;

    private String formatAddress;

    private BigDecimal totalAmount;

    private Integer payType;
    //"物流公司"
    private String deliveryCompany;
    //"物流单号"
    private String deliverySn;
}
