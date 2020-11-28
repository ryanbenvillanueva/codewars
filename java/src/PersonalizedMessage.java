class PersonalizedMessage {
    static String greet(String name, String owner) {
        String greeting = "";

        if (name.equals(owner)) {
            greeting = "Hello boss";
        } else {
            greeting = "Hello guest";
        }

        return greeting;
    }
}
