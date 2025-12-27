// This class represents a treatment request in the hospital system
    public class TreatmentRequest {

        // ID of the patient who requests treatment
        int patientId;

        // Time when the request is created
        long arrivalTime;

        // Constructor initializes patient ID and arrival time
        public TreatmentRequest(int patientId) {
            this.patientId = patientId;
            // System time is used to simulate arrival time
            this.arrivalTime = System.currentTimeMillis();
        }

        // This method is used to print request information
        @Override
        public String toString() {
            return "Patient ID: " + patientId +
                    ", Arrival Time: " + arrivalTime;
        }
    }
