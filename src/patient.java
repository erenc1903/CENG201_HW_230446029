public class patient {
    int id; // for every patient id
    String name; // patient name
    int severity; // 1–10 between
    int age;
    public patient(int id, String name, int severity, int age) {
        this.id = id;
        this.name = name;
        this.severity = severity;
        this.age = age;
    }
    @Override // we should use override method
    public String toString() {
        return "ID: " + id +
                ", Name: " + name +
                ", Severity: " + severity +
                ", Age: " + age;
    }
}
