package webproject.model;

import javax.validation.constraints.NotBlank;

import lombok.Data;

/**
 * 账号类
 * @author jjww1435
 *
 */
@Data
public class Account {
	@NotBlank(message="账户id不能为空")
	private Integer id;
	@NotBlank(message="账户用户名不能为空")
	private String username;
	@NotBlank(message="账户密码不能为空")
	private String password;
	@NotBlank(message="账户年龄不能为空")
	private Integer age;
}
