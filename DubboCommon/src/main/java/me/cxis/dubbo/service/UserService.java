package me.cxis.dubbo.service;

import me.cxis.dubbo.model.UserDTO;
import me.cxis.dubbo.query.UserQuery;
import me.cxis.dubbo.result.CallResult;

public interface UserService {

    CallResult<UserDTO> getUserById(long userId);

    CallResult<UserDTO> query(UserQuery query);
}
