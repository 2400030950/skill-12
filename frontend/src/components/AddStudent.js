import React, { useState } from "react";
import { addStudent } from "../services/api";

function AddStudent() {

  const [name,setName]=useState("");
  const [email,setEmail]=useState("");
  const [course,setCourse]=useState("");

  const handleSubmit=(e)=>{
    e.preventDefault();

    addStudent({name,email,course}).then(()=>{
      alert("Student Added");
      setName("");
      setEmail("");
      setCourse("");
    });
  };

  return (
    <form onSubmit={handleSubmit}>
      <h2>Add Student</h2>

      <input
        placeholder="Name"
        value={name}
        onChange={(e)=>setName(e.target.value)}
      />

      <input
        placeholder="Email"
        value={email}
        onChange={(e)=>setEmail(e.target.value)}
      />

      <input
        placeholder="Course"
        value={course}
        onChange={(e)=>setCourse(e.target.value)}
      />

      <button type="submit">Add</button>
    </form>
  );
}

export default AddStudent;