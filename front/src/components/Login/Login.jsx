/* eslint-disable no-undef */

import './Login.css'
import { useState, useRef } from 'react';
import { validateUser } from '../../fetch/validateUser';
import { useNavigate } from 'react-router-dom';
import { } from 'awesome-notifications'

const Login = () => {

  const navigate = useNavigate();

  const [passwordViewer, setPasswordViewer] = useState(false);
  // const [userValid, setUserValid] = useState('');

  const email = useRef()
  const password = useRef()

  const handleSubmit = async () => {
    console.log(email.current.value, password.current.value)
    validateUser(email.current.value, password.current.value)
      .then((response) => {
        console.log(response)
        if (response === 200) {
          new AWN().success('Successfully verified')
          navigate("/")
          console.log("usuario correctamente validado")
        }
      })
      .catch((err) => {
        new AWN().alert('Bad credentials')
        console.log(err)
      })
  }

  const handleCheckboxChange = () => {
    setPasswordViewer(!passwordViewer)
  }

  return (
    <>
      <div className="login-card">
        <h1>Login</h1>
        <div className="login-elements">
          <span>username</span>
          <input type="text" placeholder="username" ref={email} />
          <span>password</span>
          <input
            type={passwordViewer ? 'text' : 'password'}
            placeholder="password"
            ref={password}
          />
          <div>
            <input
              type="checkbox"
              checked={passwordViewer}
              onChange={handleCheckboxChange}
            />
            <label>mostrar contraseña</label>
          </div>
        </div>
        <button className="login-button" onClick={handleSubmit}>entrar</button>
      </div>
    </>
  )
}


export default Login