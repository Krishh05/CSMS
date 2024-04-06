import React, { useEffect, useRef, useState } from 'react'
import { toast } from 'react-toastify';
import { getCurrentUser } from '../../../../services/auth';
import { privateAxios } from '../../../../services/helper';

function AdminProfile() {
  const [admin, setAdmin] = useState('')
  const [updatedAdmin, setUpdatedAdmin] = useState({ firstName: '', lastName: '', phone: '', email: '' })

  const handleUpdatedAdmin = (event) => {
    const { name, value } = event.target;
    const copyOfUpdatedAdmin = { ...updatedAdmin };
    const [parentName, childName, grandchildName] = name.split('.');
    if (grandchildName) {
      // update a double nested property
      copyOfUpdatedAdmin[parentName][childName][grandchildName] = value;
    } else if (childName) {
      // update a single nested property
      copyOfUpdatedAdmin[parentName][childName] = value;
    } else {
      copyOfUpdatedAdmin[parentName] = value;
    }
    setUpdatedAdmin(copyOfUpdatedAdmin);
  };

  useEffect(() => {
    const id = getCurrentUser().userId;
    privateAxios.get(`/admin/profile/${id}`)
      .then(response => {
        setAdmin(response.data);
        setUpdatedAdmin(response.data);
      })
  }, [])

  const updateProfile = (event) => {
    event.preventDefault();
    const id = getCurrentUser().userId;
    privateAxios.put(`/admin/profile/${id}`, updatedAdmin)
      .then(response => {
        setAdmin(updatedAdmin)
        closeModal();
        toast.success(response.data)
      })
      .catch(response => {
        toast.error(response.data)
      })
  }

  const modalRef = useRef(null);

  const openModal = () => {
    modalRef.current.classList.add('show');
    modalRef.current.style.display = 'block';
    document.body.classList.add('modal-open');
  }

  const closeModal = () => {
    modalRef.current.classList.remove('show');
    modalRef.current.style.display = 'none';
    document.body.classList.remove('modal-open');
  }

  return (
    <>
      <div className='container my-5'>
        <h3 className='utext my-5'>Your Profile</h3>
        <div className='row'>
          <div className='col-md-5 my-3'>
            <label htmlFor='firstName' className='form-label'>First Name</label>
            <p className='lead'>{admin.firstName}</p>
          </div>
          <div className='col-md-5 my-3'>
            <label htmlFor='lastName' className='form-label'>Last Name</label>
            <p className='lead'>{admin.lastName}</p>
          </div>
          <div className='col-md-5 my-3'>
            <label htmlFor='phone' className='form-label'>Phone</label>
            <p className='lead'>{admin.phone}</p>
          </div>
          <div className='col-md-5 my-3'>
            <label htmlFor='email' className='form-label'>Email</label>
            <p className='lead'>{admin.email}</p>
          </div>
        </div>
        <button type='button' className='btn btn-info' onClick={openModal}>Update Profile</button>
      </div>

      <div className='modal fade' id='staticBackdrop' data-bs-backdrop='static' data-bs-keyboard='false' tabIndex='-1' aria-labelledby='staticBackdropLabel' aria-hidden='true' ref={modalRef}>
        <div className='modal-dialog'>
          <div className='modal-content'>
            <div className='modal-header'>
              <h1 className='modal-title fs-5' id='staticBackdropLabel'>Update Profile</h1>
            </div>
            <form className='row g-3'>
              <div className='modal-body'>
                <div className='col-md-5 my-3'>
                  <label htmlFor='firstName' className='form-label'>First Name</label>
                  <input type='text' onChange={handleUpdatedAdmin} className='form-control' name='firstName' placeholder='First Name Here' value={updatedAdmin.firstName} required />
                  <div className='invalid-feedback'>
                    Please enter a valid first name.
                  </div>
                </div>
                <div className='col-md-5 my-3'>
                  <label htmlFor='lastName' className='form-label'>Last Name</label>
                  <input type='text' onChange={handleUpdatedAdmin} className='form-control' name='lastName' placeholder='Last Name Here' value={updatedAdmin.lastName} required />
                  <div className='invalid-feedback'>
                    Please enter a valid last name.
                  </div>
                </div>
                <div className='col-md-5 my-3'>
                  <label htmlFor='phone' className='form-label'>Phone</label>
                  <input type='tel' onChange={handleUpdatedAdmin} className='form-control' name='phone' placeholder='Phone Here' pattern='[0-9]{10}' value={updatedAdmin.phone} required minLength={10} />
                  <div className='invalid-feedback'>
                    Please enter a valid phone number.
                  </div>
                </div>
                <div className='col-md-5 my-3'>
                  <label htmlFor='email' className='form-label'>Email</label>
                  <input type='email' onChange={handleUpdatedAdmin} className='form-control' name='email' placeholder='Email here' value={updatedAdmin.email} required minLength={5} />
                  <div className='invalid-feedback'>
                    Please enter a valid email.
                  </div>
                </div>
              </div>
              <div className='modal-footer'>
                <button type='button' className='btn btn-outline-info' onClick={() => {setUpdatedAdmin(admin); closeModal();}}>Cancel</button>
                <button type='submit' className='btn btn-info mx-3' onClick={updateProfile}>Confirm</button>
              </div>
            </form>
          </div>
        </div>
      </div>
    </>
  )
}

export default AdminProfile