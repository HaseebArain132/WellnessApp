# 🩺 Wellness Monitoring App

A simple Java-based project that models a wellness monitoring system for patients and therapists.  
This system demonstrates core **Object-Oriented Programming (OOP)** concepts like **inheritance**, **composition**, **aggregation**, and **threading** through a real-world inspired application.

## 📚 Project Overview
The application allows patients to track their mood and sleep habits via a `WellnessTracker`. Therapists can view patient information and conduct therapy sessions. An `EmergencyAlertMonitor` thread continuously monitors a patient's mood and triggers an emergency alert if critical conditions are detected.

## 🚀 Features
- **User Management**  
  Abstract `User` class with specialized `Patient` and `Therapist` subclasses.
  
- **Wellness Tracking**  
  Patients have a `WellnessTracker` that records:
  - Mood levels (`MoodEntry`)
  - Sleep logs (`SleepLog`)

- **Therapy Sessions**  
  Therapists can conduct therapy sessions with patients.

- **Emergency Monitoring (Multithreading)**  
  A background thread (`EmergencyAlertMonitor`) watches patient mood levels and raises alerts when necessary.

## 🧩 Key OOP Concepts Demonstrated
| Concept       | Implementation |
|---------------|-----------------|
| **Inheritance**  | `Patient` and `Therapist` inherit from `User`. |
| **Composition**  | `Patient` has a `WellnessTracker`. |
| **Aggregation**  | `TherapySession` uses `Patient` and `Therapist`. |
| **Threading**     | `EmergencyAlertMonitor` extends `Thread`. |

## 🏗️ Project Structure
```
├── Main.java
├── User.java
├── Patient.java
├── Therapist.java
├── WellnessTracker.java
├── MoodEntry.java
├── SleepLog.java
├── TherapySession.java
└── EmergencyAlertMonitor.java
```
