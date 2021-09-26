public class Conditionals {

    public static void main(String[] args) {
        // if a person is sindhi and lives in delhi
        // let him attend the party
        // if the person is punjabi and lives in mumbai
        // let him attend funeral
        // else send them to prison

        String caste = "punjabi";
        String location = "mumbai";

        if(caste == "sindhi" && location == "delhi") {
            System.out.println("goes to party");
        } else if (caste == "punjabi" && location == "mumbai") {
            System.out.println("goes to funeral");
        } else {
            System.out.println("goes to prison");
        }
    }
}
