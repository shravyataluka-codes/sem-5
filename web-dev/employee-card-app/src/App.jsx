// src/App.jsx
import { useState } from "react";
import Employee from "./components/Employee";
import StudentForm from "./components/StudentForm";
import StudentList from "./components/StudentList";
import "./App.css";

function App() {
  const [students, setStudents] = useState([]);

  const addStudent = (student) => {
    setStudents([...students, student]);
  };

  const deleteStudent = (index) => {
    const updated = students.filter((_, i) => i !== index);
    setStudents(updated);
  };

  return (
    <div className="container">
      <h1>Employee Profile Cards</h1>
      <div className="employee-container">
        <Employee name="Priya Sharma" id="EMP001" department="Engineering" designation="Frontend Developer" salary={60000} />
        <Employee name="Aarav Kumar" id="EMP002" department="HR" designation="Recruiter" salary={45000} />
        <Employee name="Meera Patel" id="EMP003" department="Finance" designation="Accountant" salary={50000} />
        <Employee name="Rahul Singh" id="EMP004" department="Engineering" designation="Backend Developer" salary={70000} />
      </div>

      <h1>Student Management System</h1>
      <StudentForm onAddStudent={addStudent} />
      <StudentList students={students} onDelete={deleteStudent} />
    </div>
  );
}

export default App;
