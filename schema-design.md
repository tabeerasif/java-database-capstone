# Smart Clinic Schema Design

---

## MySQL Database Design

Structured data like patient records, appointments, and doctor information is best stored in a relational format using MySQL.

### Table: patients
- id: INT, PRIMARY KEY, AUTO_INCREMENT
- full_name: VARCHAR(100), NOT NULL
- email: VARCHAR(100), UNIQUE, NOT NULL
- phone: VARCHAR(15), NOT NULL
- date_of_birth: DATE, NOT NULL
- gender: ENUM('Male', 'Female', 'Other')
- created_at: TIMESTAMP DEFAULT CURRENT_TIMESTAMP

### Table: doctors
- id: INT, PRIMARY KEY, AUTO_INCREMENT
- full_name: VARCHAR(100), NOT NULL
- email: VARCHAR(100), UNIQUE, NOT NULL
- specialization: VARCHAR(100), NOT NULL
- phone: VARCHAR(15)
- availability_start: TIME
- availability_end: TIME
- created_at: TIMESTAMP DEFAULT CURRENT_TIMESTAMP

### Table: appointments
- id: INT, PRIMARY KEY, AUTO_INCREMENT
- doctor_id: INT, FOREIGN KEY REFERENCES doctors(id)
- patient_id: INT, FOREIGN KEY REFERENCES patients(id)
- appointment_time: DATETIME, NOT NULL
- status: ENUM('Scheduled', 'Completed', 'Cancelled') DEFAULT 'Scheduled'
- notes: TEXT

### Table: admins
- id: INT, PRIMARY KEY, AUTO_INCREMENT
- username: VARCHAR(50), UNIQUE, NOT NULL
- password_hash: VARCHAR(255), NOT NULL
- created_at: TIMESTAMP DEFAULT CURRENT_TIMESTAMP

### Table: payments _(optional enhancement)_
- id: INT, PRIMARY KEY, AUTO_INCREMENT
- appointment_id: INT, FOREIGN KEY REFERENCES appointments(id)
- amount: DECIMAL(10,2)
- status: ENUM('Pending', 'Paid', 'Refunded')
- paid_at: TIMESTAMP

> 💡 Considerations:
> - Appointments will be retained even if patients are deleted (set `ON DELETE SET NULL`)
> - Prevent overlapping appointments via code constraints or triggers
> - Admin passwords must be securely hashed and never stored as plain text

---

## MongoDB Collection Design

Flexible or unstructured data like prescriptions, feedback, and logs are best stored in MongoDB.

### Collection: prescriptions

```json
{
  "_id": "ObjectId('665fa91f5c2e8e1a12345678')",
  "patientId": 21,
  "appointmentId": 15,
  "doctorName": "Dr. Rina Mehta",
  "patientName": "Arjun Patel",
  "medications": [
    {
      "name": "Amoxicillin",
      "dosage": "500mg",
      "frequency": "Twice a day"
    },
    {
      "name": "Ibuprofen",
      "dosage": "200mg",
      "frequency": "As needed for pain"
    }
  ],
  "notes": "Patient should rest and hydrate. Come back in a week if not improved.",
  "pharmacy": {
    "name": "HealthPlus Pharmacy",
    "location": "Mumbai, India"
  },
  "createdAt": "2024-06-01T10:00:00Z"
}