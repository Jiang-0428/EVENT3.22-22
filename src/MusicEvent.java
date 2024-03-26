public class MusicEvent {
    private boolean merchandiseRequired;
    private double merchandiseCost;
    private double musiceventCost;
    private String eventID;
    private String eventName;
    private String eventLocation;
    private String pointOfContact;
    private CalculateEventCostClass calculateEventCostObject;
    private int totalParticipants;
    private int totalEventDays;

    public MusicEvent(String eventID, String eventName, String eventLocation, String pointOfContact, int totalParticipants, int totalEventDays, 
    double breakfastCost, double lunchCost, double dinnerCost){
        
        this.calculateEventCostObject = new CalculateEventCostClass();

        this.eventID = eventID;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.pointOfContact = pointOfContact;
        this.totalParticipants = totalParticipants;
        this.totalEventDays = totalEventDays;
    }

    public void calculateEventCost(){
        musiceventCost = calculateEventCostObject.calculateEventCost() + (getMerchandiseCost() * getTotalParticipants()) * getTotalEventDays();
    }

    public void setMarchandiseRequired(boolean merchandiseRequired){
        this.merchandiseRequired = merchandiseRequired;
    }

    public boolean isMarchandiseRequired(){
        return merchandiseRequired;
    }

    public void setMarchandiseCost(double merchandiseCost){
        this.merchandiseCost = merchandiseCost;
    }

    public double getMerchandiseCost(){
        return merchandiseCost;
    }

    public double getMusiceventCost(){
        return musiceventCost;
    }

    public String getEventID(){
        return eventID;
    }

    public void setEventID(String eventID){
        this.eventID = eventID;
    }

    public String getEventName(){
        return eventName;
    }

    public void setEventName(String eventName){
        this.eventName = eventName;
    }

    public String getEventLocation(){
        return eventLocation;
    }

    public void setEventLocation(String location){
        this.eventLocation = location;
    }

    public String getPointOfContact(){
        return pointOfContact;
    }

    public void setPointOfContact(String pointOfContact){
        this.pointOfContact = pointOfContact;
    }

    public int getTotalParticipants(){
        return totalParticipants;
    }

    public void setTotalParticipants(int totalParticipants){
        this.totalParticipants = totalParticipants;
    }

    public int getTotalEventDays(){
        return totalEventDays;
    }

    public void setTotalEventDays(int totalEventDays){
        this.totalEventDays = totalEventDays;
    }

    public CalculateEventCostClass getCalculateEventCostObject(){
        return calculateEventCostObject;
    }

    public void setCalculateEventCostObject(CalculateEventCostClass calculateEventCostObject){
        this.calculateEventCostObject = calculateEventCostObject;
    }

    @Override
    public String toString(){
        return "Music Concert Event details: " + "\n" +
        "Event ID: " + eventID + "\n" +
        "Event Name: " + eventName + "\n" +
        "Event Location: " + eventLocation + "\n" +
        "Total participants: " + totalParticipants + "\n" +
        "Total event days: " + totalEventDays + "\n" +
        "Total Music Concert event cost: " + musiceventCost ; 
    }



    
}
