import "./Employee.css";

function Employee({ name, id, department, designation, salary }) {
  return (
    <div className="employee-card">
      <h2>{name}</h2>
      <p>ID: {id}</p>
      <p>Department: {department}</p>
      <p>Designation: {designation}</p>
      <p>Salary: ₹{salary}</p>
    </div>
  );
}


export default Employee;
