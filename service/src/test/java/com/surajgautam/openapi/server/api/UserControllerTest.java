package com.surajgautam.openapi.server.api;

import com.surajgautam.openapi.OpenapiApp;
import io.restassured.builder.RequestSpecBuilder;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.openapitools.client.ApiClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = OpenapiApp.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserControllerTest {

    @LocalServerPort
    private int port;

    private ApiClient apiClient;

    @BeforeEach
    void setup() {

        apiClient = ApiClient.api(ApiClient.Config.apiConfig().reqSpecSupplier(() -> new RequestSpecBuilder()
                .setBaseUri("http://localhost").setPort(port)));
    }

    @Test
    void givenValidRequest_WhenGetUsers_ThenReturnOk() {
        List response = apiClient.users().usersGet().execute(r -> r.as(List.class));
        Assertions.assertThat(response)
                .isNotNull()
                .isNotEmpty()
                .contains("zxc");
    }
}