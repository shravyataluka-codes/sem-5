import Employee from "./components/Employee";

function App() {
  return (
    <div>
      <h1>Employee Profile Cards</h1>
      <div className="employee-container">
        <Employee name="Priya Sharma" id="EMP001" department="Engineering" designation="Frontend Developer" salary={60000} />
        <Employee name="Aarav Kumar" id="EMP002" department="HR" designation="Recruiter" salary={45000} />
        <Employee name="Meera Patel" id="EMP003" department="Finance" designation="Accountant" salary={50000} />
        <Employee name="Rahul Singh" id="EMP004" department="Engineering" designation="Backend Developer" salary={70000} />
      </div>
    </div>
  );
}

export default App;

