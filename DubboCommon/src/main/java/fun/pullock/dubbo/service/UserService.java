package fun.pullock.dubbo.service;

import fun.pullock.dubbo.model.UserDTO;
import fun.pullock.dubbo.query.UserQuery;
import fun.pullock.dubbo.result.CallResult;

public interface UserService {

    CallResult<UserDTO> getUserById(long userId);

    CallResult<UserDTO> query(UserQuery query);
}
