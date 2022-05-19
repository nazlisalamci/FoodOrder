package com.food_order.app.SendNotification;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAACJhas7g:APA91bFcPmDFaCpqpLbSuoKDgtVc-vhPf82L7I1_-7n285r5MvPW83Rosik4IsUKSF6uYDP08X2YatYFWOtWzpWJgbo_7AZ3gWPlnZ2DMz0ot6zc9xpnj7sVU4RXQerZ6YP9Qw7FMaNh"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body NotificationSender body);
}
