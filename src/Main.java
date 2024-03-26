import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {

        ConferenceEvent conferenceEvent = new ConferenceEvent("E001", "AI Conference", "Paris", "Peng Tian", 50, 2, 25, 40, 60);
        conferenceEvent.calculateEventCost();
        System.out.println(conferenceEvent);
        MusicEvent musicEvent = new MusicEvent("E002", "bb", "BB", "bB", 500, 2, 50, 1, 2);
        musicEvent.calculateEventCost();
        System.out.println(musicEvent);
        String startDate = "2024-03-22";
        String endDate = "2024-03-26";
        LocalDate eventStartDate = LocalDate.parse(startDate);
        LocalDate eventEndDate = LocalDate.parse(endDate);
        PastEvent pastEvent = new PastEvent("E003", "cc", "CC", "cC", 50, 3, eventStartDate, eventEndDate, "Paid", true);
        pastEvent.setPaymentDetails("Paid", true);
        System.out.println(pastEvent);
    }
}
