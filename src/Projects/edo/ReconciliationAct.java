package Projects.edo;

public class ReconciliationAct extends Document {
    int abonentId;
    String filialName;
    String dateFrom;
    String dateTo;
    String statusName;

    public ReconciliationAct(int id, String documentType, int abonentId, String filialName, String dateFrom, String dateTo, String statusName) {
        super(id, documentType);
        this.abonentId = abonentId;
        this.filialName = filialName;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.statusName = statusName;
    }

    public int getAbonentId() {
        return abonentId;
    }

    public String getFilialName() {
        return filialName;
    }

    public String getDateFrom() {
        return dateFrom;
    }

    public String getDateTo() {
        return dateTo;
    }

    public String getStatusName() {
        return statusName;
    }

    public String getDocumentInfo() {

        String documentInfo = super.getDocumentInfo();
        return documentInfo + "\nAbonent ID: " + getAbonentId() + "\nFilial Name: " + getFilialName() + "\nDateFrom: " + getDateFrom() + "\nDateTo: " + getDateTo() + "\nAbonent ID: " + getStatusName();

    }
}
