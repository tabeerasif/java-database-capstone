# User Story Template

**Title:**
_As a [user role], I want [feature/goal], so that [reason]._

**Acceptance Criteria:**
1. [Criteria 1]
2. [Criteria 2]
3. [Criteria 3]

**Priority:** [High/Medium/Low]
**Story Points:** [Estimated Effort in Points]
**Notes:**
- [Additional information or edge cases]

## Admin User Stories

**Title:** Admin login to portal  
_As an admin, I want to log into the portal with my username and password, so that I can manage the platform securely._

**Acceptance Criteria:**
1. Admin can access login page
2. Admin enters valid credentials
3. Admin is redirected to admin dashboard

**Priority:** High  
**Story Points:** 3  
**Notes:**  
- Should include session management and role-based access.

---

**Title:** Admin logout  
_As an admin, I want to log out of the portal, so that I can protect system access._

**Acceptance Criteria:**
1. Admin clicks logout
2. Session is destroyed
3. User is redirected to home/login page

**Priority:** High  
**Story Points:** 1  
**Notes:**  
- Must ensure cache is cleared and session is invalidated

---

**Title:** Add doctor to portal  
_As an admin, I want to add doctors to the portal, so that they can offer their services._

**Acceptance Criteria:**
1. Admin opens Add Doctor form
2. Admin enters valid information
3. Doctor profile is saved

**Priority:** High  
**Story Points:** 2  
**Notes:**  
- Include validation and duplicate checks

---

**Title:** Delete doctor profile  
_As an admin, I want to delete a doctor's profile, so that I can manage inactive or incorrect entries._

**Acceptance Criteria:**
1. Admin sees doctor list
2. Admin clicks delete
3. Profile is removed after confirmation

**Priority:** Medium  
**Story Points:** 2  
**Notes:**  
- Should prompt confirmation to avoid accidental deletion

---

**Title:** Run stored procedure for usage stats  
_As an admin, I want to run a stored procedure in MySQL CLI, so that I can get the number of appointments per month._

**Acceptance Criteria:**
1. Stored procedure exists
2. Admin runs it via CLI
3. Output shows appointment counts by month

**Priority:** Medium  
**Story Points:** 3  
**Notes:**  
- Useful for reporting and analytics

---

## Patient User Stories

**Title:** View doctor list without logging in  
_As a patient, I want to view a list of doctors without logging in, so that I can explore before signing up._

**Acceptance Criteria:**
1. Public page displays doctor profiles
2. Includes name, specialization, availability
3. No personal details shown

**Priority:** High  
**Story Points:** 2  
**Notes:**  
- SEO-friendly doctor listing page

---

**Title:** Patient registration  
_As a patient, I want to sign up with email and password, so that I can book appointments._

**Acceptance Criteria:**
1. Sign-up form available
2. Email validation and password security
3. Account created and login enabled

**Priority:** High  
**Story Points:** 3  
**Notes:**  
- Consider CAPTCHA for spam prevention

---

**Title:** Patient login  
_As a patient, I want to log into the portal, so that I can manage my bookings._

**Acceptance Criteria:**
1. Valid credentials allow login
2. Role-based dashboard is loaded
3. Session is maintained securely

**Priority:** High  
**Story Points:** 2  
**Notes:**  
- Implement JWT or session-based auth

---

**Title:** Book a doctor appointment  
_As a patient, I want to log in and book an hour-long appointment, so that I can consult a doctor._

**Acceptance Criteria:**
1. Doctor availability is shown
2. Patient selects time slot
3. Appointment is confirmed

**Priority:** High  
**Story Points:** 3  
**Notes:**  
- Prevent double bookings

---

**Title:** View upcoming appointments  
_As a patient, I want to view my upcoming appointments, so that I can prepare accordingly._

**Acceptance Criteria:**
1. Shows future confirmed bookings
2. Includes doctor, time, and location
3. Option to cancel or reschedule

**Priority:** Medium  
**Story Points:** 2  
**Notes:**  
- Should filter past vs future appointments

---

##  Doctor User Stories

**Title:** Doctor login  
_As a doctor, I want to log into the portal, so that I can manage my appointments._

**Acceptance Criteria:**
1. Doctor login page
2. Role-based redirection
3. Session maintained securely

**Priority:** High  
**Story Points:** 2  
**Notes:**  
- Separate login or shared with role-check

---

**Title:** Doctor logout  
_As a doctor, I want to log out of the portal, so that I can protect my data._

**Acceptance Criteria:**
1. Logout option in header
2. Session is destroyed
3. Redirect to login/home

**Priority:** Medium  
**Story Points:** 1  
**Notes:**  
- Simple logout functionality

---

**Title:** View appointment calendar  
_As a doctor, I want to view my appointment calendar, so that I can stay organized._

**Acceptance Criteria:**
1. Calendar view of bookings
2. Clickable events with details
3. Day/week/month toggle

**Priority:** High  
**Story Points:** 3  
**Notes:**  
- Use FullCalendar or similar tool

---

**Title:** Mark unavailability  
_As a doctor, I want to mark unavailability, so that patients only see available slots._

**Acceptance Criteria:**
1. Calendar interface to block time
2. Unavailable slots hidden from patients
3. Saved to database

**Priority:** High  
**Story Points:** 3  
**Notes:**  
- Prevent overlapping schedules

---

**Title:** Update profile information  
_As a doctor, I want to update my profile with specialization and contact info, so that patients see accurate details._

**Acceptance Criteria:**
1. Editable profile page
2. Update saved after validation
3. Profile reflects changes

**Priority:** Medium  
**Story Points:** 2  
**Notes:**  
- Consider image upload, bio, phone number

---

**Title:** View patient details  
_As a doctor, I want to view patient details for upcoming appointments, so that I can be prepared._

**Acceptance Criteria:**
1. Appointment view shows patient info
2. Includes name, reason, and history
3. Access restricted to confirmed appointments

**Priority:** High  
**Story Points:** 3  
**Notes:**  
- Must follow privacy rules
