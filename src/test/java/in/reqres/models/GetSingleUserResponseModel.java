package in.reqres.models;

import lombok.Data;

@Data
public class GetSingleUserResponseModel {
    Data data;
    Support support;

    @lombok.Data
    public static class Data {
        Integer id;
        String email, first_name, last_name, avatar;
    }

    @lombok.Data
    public static class Support {
        String url, text;
    }
}