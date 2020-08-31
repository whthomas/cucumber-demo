package io.github.whthomas.demo.cucumber;

import okhttp3.mockwebserver.Dispatcher;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.Objects;

public class MockWebServerTest {

    public static void main(String[] args) throws IOException {

        // instance for every unit test.
        MockWebServer server = new MockWebServer();

        final Dispatcher dispatcher = new Dispatcher() {

            @NotNull
            @Override
            public MockResponse dispatch(RecordedRequest request) {

                String s = Objects.requireNonNull(request.getPath());
                switch (s) {
                    case "/v1/login/auth/":
                        return new MockResponse().setResponseCode(200);
                    case "v1/check/version/":
                        return new MockResponse().setResponseCode(200).setBody("version=9");
                    case "/v1/profile/info":
                        return new MockResponse().setResponseCode(200).setBody("{\\\"info\\\":{\\\"name\":\"Lucas Albuquerque\",\"age\":\"21\",\"gender\":\"male\"}}");
                }
                return new MockResponse().setResponseCode(404);
            }
        };

        server.setDispatcher(dispatcher);

        server.start(8088);


    }

}
