import React from 'react'
import { Link, useNavigate } from 'react-router-dom'
import { handleLogout } from '../../../../services/auth'

function NavBar() {

  const navigate = useNavigate();

  const logout = () => {
    handleLogout();
    //return <Navigate replace={true} to={'/login'}/>
    navigate('/', {replace: true});
  }

  return (
    <nav className='navbar navbar-expand-lg bg-info' data-bs-theme='light'>
      <div className='container'>
        <Link className='navbar-brand'><h1>SwiftS</h1></Link>
        <div className='d-flex'>
          <Link className='btn btn-dark' onClick={logout} role="button">Log Out</Link>
        </div>
      </div>
    </nav>
  )
}

export default NavBar