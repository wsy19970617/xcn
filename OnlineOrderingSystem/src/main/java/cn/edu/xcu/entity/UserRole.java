package cn.edu.xcu.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author xcn
 * @since 2019-11-15
 */
@TableName("t_user_role")
public class UserRole implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer userid;

    private Integer roleid;


    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    @Override
    public String toString() {
        return "UserRole{" +
        "userid=" + userid +
        ", roleid=" + roleid +
        "}";
    }
}
