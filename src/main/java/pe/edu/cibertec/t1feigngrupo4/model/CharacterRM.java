package pe.edu.cibertec.t1feigngrupo4.model;

import lombok.Data;

import java.util.List;

    @Data
    public class CharacterRM {

        private int id;
        private String name;
        private String status;
        private String species;
        private String type;
        private String gender;

        private Origin origin;
        private Location location;

        private String image;
        private List<String> episode;
        private String url;
        private String created;

        @Data
        public static class Origin {
            private String name;
            private String url;
        }

        @Data
        public static class Location {
            private String name;
            private String url;
        }

        @Data
        public static class ApiResponse {
            private Info info;
            private List<CharacterRM> results;
        }

        @Data
        public static class Info {
            private int count;
            private int pages;
            private String next;
            private String prev;
        }
    }


