package com.kusitms.assignmentandroid.retrofit;

import com.kusitms.assignmentandroid.retrofit.dto.ApiResponse;
import com.kusitms.assignmentandroid.retrofit.dto.LoginResult;
import com.kusitms.assignmentandroid.retrofit.dto.OrderItemVO;
import com.kusitms.assignmentandroid.retrofit.dto.SerialNumberResult;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitAPI {
    @GET("/login/oauth/kakao")
    Call<LoginResult> getLoginUser(@Query("accessToken") String accessToken);

    @GET("/serialNumber")
    Call<ApiResponse<String>> getSerialNumber();

    @GET("/items")
    Call<ApiResponse<ArrayList<OrderItemVO>>> getItems();
}
