import React from 'react'
import './Registration.css'



const Registration = () => {
    let page={
    userid:'',
    firstname:'',
    lastname:'',
    email:'',
    password:'',
    phone:'',
    role:'',
    address:'',
    country:'',
    state:'',
    city:'',
    postalcode:''

    }
    const handleSubmit=(event)=>{
       event.preventDefault()
        page.userid=event.target.userid.value;
        page.firstname=event.target.firstname.value;
        page.lastname=event.target.lastname.value;
        page.email=event.target.email.value;
        page.password=event.target.password.value;
        page.phone=event.target.phone.value;
        page.role=event.target.role.value;
        page.address=event.target.address.value;
        page.country=event.target.country.value;
        page.state=event.target.state.value;
        page.city=event.target.city.value;
        page.postalcode=event.target.postalcode.value;

      
        console.log(page);
        console.log(event);
 
    }
  return (
  <div>Registration Form
  <form onSubmit={handleSubmit}>
    <input type="number" name="userid"placeholder='userid'/>
    <input type="text" name="firstname"placeholder='firstname'/>
    <input type="text" name="lastname"placeholder='lastname'/>
    <input type="text" name="email"placeholder='email'/>
    <input type="password" name="password"placeholder='password'/>
    <input type="number" name="phone"placeholder='phone'/>
    <input type="text" name="role"placeholder='role'/>
    <input type="text" name="address"placeholder='address'/>
    <input type="text" name="country"placeholder='country'/>
    <input type="text" name="state"placeholder='state'/>
    <input type="text" name="city"placeholder='city'/>
    <input type="text" name="postalcode"placeholder='postalcode'/>
     <input type='submit'/>
  </form></div>

  );
}

export default Registration
