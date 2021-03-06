package jzhu.com.moduleusers.api;

import io.reactivex.Observable;
import jzhu.com.libprovider.model.UserModel;
import retrofit2.http.GET;

import java.util.List;

public interface UsersApi {

    @GET("/users")
    Observable<List<UserModel>> getUsers();
}
