package me.cxis.dubbo.service.impl;

import me.cxis.dubbo.model.UserDTO;
import me.cxis.dubbo.query.UserQuery;
import me.cxis.dubbo.result.CallResult;
import me.cxis.dubbo.service.UserService;

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
