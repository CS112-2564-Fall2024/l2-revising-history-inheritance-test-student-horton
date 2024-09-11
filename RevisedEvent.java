public class RevisedEvent extends HistoricalEvent {
    private String revisedDescription;
    private String citation;

    public RevisedEvent() {
        super();

        this.revisedDescription = "None";
        this.citation = "None";
    }

    public RevisedEvent(String description, Date date, String revisedDescription, String citation) {
        super(description, date);

        this.revisedDescription = revisedDescription;
        this.citation = citation;
    }
    
    public void setRevisedDescription(String revisedDescription)
    {
        this.revisedDescription = revisedDescription;
    }

    public void setCitation(String citation) {
        this.citation = citation;
    }

    public String getRevisedDescription() {
        return this.revisedDescription;
    }

    public String getCitation() {
        return this.citation;
    }

    @Override
    public String toString() {
        String superString = super.toString();

        return superString + '\n' + this.revisedDescription + '\n' + this.citation;
    }

    public boolean equals(Object other) {
        // we can't be equals with null
        if (other == null) {
            return false;
        }

        // we can't be equals if the super isn't equals
        if (!super.equals(other)) {
            return false;
        }

        // we can't be equals if this isn't the same type
        if (!(other instanceof RevisedEvent)) {
            return false;
        }

        // compare our specific information
        RevisedEvent event = (RevisedEvent)other;

        return this.revisedDescription.equals(event.revisedDescription) && this.citation.equals(event.citation);
    }


    public void teach() {
        System.out.println("\n====================================================");
        System.out.println("REVISED HISTORICAL EVENT:");
        System.out.println("====================================================");
        System.out.println(this.toString());    
    }
    
}
