package fun.pullock.dubbo.service.impl;

import fun.pullock.dubbo.model.UserDTO;
import fun.pullock.dubbo.query.UserQuery;
import fun.pullock.dubbo.result.CallResult;
import fun.pullock.dubbo.service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public CallResult<UserDTO> getUserById(long userId) {
        CallResult<UserDTO> callResult = new CallResult<>();

        UserDTO userDTO = new UserDTO();
        userDTO.setId(1);
        userDTO.setUserName("test");

        callResult.setModel(userDTO);

        return callResult;
    }

    @Override
    public CallResult<UserDTO> query(UserQuery query) {
        System.out.println(query);

        CallResult<UserDTO> callResult = new CallResult<>();

        UserDTO userDTO = new UserDTO();
        userDTO.setId(10001);
        userDTO.setUserName("testGeneric");

        callResult.setModel(userDTO);

        return callResult;
    }
}
