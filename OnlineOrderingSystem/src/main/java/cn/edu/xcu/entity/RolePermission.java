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
@TableName("t_role_permission")
public class RolePermission implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer roleid;

    private Integer permissionid;


    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getPermissionid() {
        return permissionid;
    }

    public void setPermissionid(Integer permissionid) {
        this.permissionid = permissionid;
    }

    @Override
    public String toString() {
        return "RolePermission{" +
        "roleid=" + roleid +
        ", permissionid=" + permissionid +
        "}";
    }
}
