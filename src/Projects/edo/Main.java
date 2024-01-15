package Projects.edo;

public class Main {
    public static void main(String[] args) {
        //   Document d = new Document(1, "ReconciliationAct");
        //   System.out.println(d.getDocumentInfo());
        ReconciliationAct r1 = new ReconciliationAct(1, "ReconciliationAct", 12345, "Алматинский филиал", "2022-12", "2022-12", "Подписан");
        System.out.println(r1.getDocumentInfo());
    }
}