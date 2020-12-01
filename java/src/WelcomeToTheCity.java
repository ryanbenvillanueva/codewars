public class WelcomeToTheCity {
    public String sayHello(String[] name, String city, String state) {
        String fullName = "";

        for (int i = 0; i < name.length; i++) {
            if (i == name.length - 1) {
                fullName += name[i];
            } else {
                fullName += name[i] + " ";
            }
        }

        return "Hello, " + fullName + "! Welcome to " + city + ", " + state + "!";
    }
}
