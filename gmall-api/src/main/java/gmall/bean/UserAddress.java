package gmall.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author: tchen
 * @Description:
 * @Date: 2018/12/19 20:12
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)
public class UserAddress implements Serializable {
    private Integer id;
    private String userAddress;
    private String userId;
    private String consignee;
    private String phoneNum;
    private String isDefault;
}
