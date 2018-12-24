package gmall.service;

import gmall.bean.UserAddress;

import java.util.List;

/**
 * @Author: tchen
 * @Description:
 * @Date: 2018/12/19 20:36
 */
public interface OrderService {
    List<UserAddress> init(String userId);
}
