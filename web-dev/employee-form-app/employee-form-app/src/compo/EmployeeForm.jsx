import React, { useState } from 'react';

function EmployeeForm() {
  const [formData, setFormData] = useState({
    name: "",
    employeeId: "",
    department: "",
    designation: "",
    salary: ""
  });

  const [submittedData, setSubmittedData] = useState(null);

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData(prev => ({
      ...prev,
      [name]: value
    }));
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    setSubmittedData(formData);
    setFormData({
      name: "",
      employeeId: "",
      department: "",
      designation: "",
      salary: ""
    });
  };

  return (
    <div className="form-container">
      <h1 className="form-heading">Employee Registration Form</h1>
      <form onSubmit={handleSubmit} className="registration-form">
        <div className="form-group">
          <label htmlFor="name">Employee Name:</label>
          <input type="text" id="name" name="name" value={formData.name} onChange={handleChange} required />
        </div>
        <div className="form-group">
          <label htmlFor="employeeId">Employee ID:</label>
          <input type="text" id="employeeId" name="employeeId" value={formData.employeeId} onChange={handleChange} required />
        </div>
        <div className="form-group">
          <label htmlFor="department">Department:</label>
          <input type="text" id="department" name="department" value={formData.department} onChange={handleChange} required />
        </div>
        <div className="form-group">
          <label htmlFor="designation">Designation:</label>
          <input type="text" id="designation" name="designation" value={formData.designation} onChange={handleChange} required />
        </div>
        <div className="form-group">
          <label htmlFor="salary">Salary:</label>
          <input type="text" id="salary" name="salary" value={formData.salary} onChange={handleChange} required />
        </div>
        <button type="submit" className="btn-submit">Add Employee</button>
      </form>

      {submittedData && (
        <div className="submitted-details">
          <h2>Registered Employee Details</h2>
          <p><strong>Name:</strong> {submittedData.name}</p>
          <p><strong>Employee ID:</strong> {submittedData.employeeId}</p>
          <p><strong>Department:</strong> {submittedData.department}</p>
          <p><strong>Designation:</strong> {submittedData.designation}</p>
          <p><strong>Salary:</strong> {submittedData.salary}</p>
        </div>
      )}
    </div>
  );
}

export default EmployeeForm;
