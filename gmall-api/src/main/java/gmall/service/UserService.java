package gmall.service;

import gmall.bean.UserAddress;

import java.util.List;

/**
 * @Author: tchen
 * @Description:
 * @Date: 2018/12/19 20:23
 */
public interface UserService {
    List<UserAddress> getUserAddressList(String userId);
}
