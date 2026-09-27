package pe.edu.cibertec.t1feigngrupo4.service;

import pe.edu.cibertec.t1feigngrupo4.client.UserClient;
import pe.edu.cibertec.t1feigngrupo4.model.UserPlaceHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserClient userClient;

    public UserService(UserClient userClient) {
        this.userClient = userClient;
    }

    public List<UserPlaceHolder> obtenerUsuarios() {
        return userClient.getUsers()
                .stream()
                .filter(user -> user.getId() % 2 != 0)
                .toList();
    }
}