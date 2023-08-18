import './UserDashboard.css'
import { useEffect, useState } from 'react';
import fetchData from '../../fetch/axiosFetch';


const UserDashBoard = ({ isOpen, closeModal }) => {
  const [data, setData] = useState([]);

  useEffect(() => {
    console.log('dashboard')
    console.log(sessionStorage.getItem('user-credentials').toString());
    fetchData('GET', `/user/email/${sessionStorage.getItem('user-credentials')}`, (data) => {
      setData(data);
    });
  }, []);

  return (
    <div
      className={`user-modal ${isOpen ? 'open' : ''}`}
    >
      <div className="modal-content">
        <h1>Información producto</h1>
        <div className="user-info-containers">
          <div className="user-info-container-one">
            <h3>correo electronico</h3>
            <span>{data.email}</span>
            <h3>nombre</h3>
            <span>{data.firstName}</span>
            <h3>apellido</h3>
            <span>{data.lastName}</span>
            <h3>address</h3>
            <span>{data.address}</span>
            <h3>address2</h3>
            <span>{data.address2}</span>
            <h3>city</h3>
            <span>{data.city}</span>
            <h3>state</h3>
            <span>{data.state}</span>
            <h3>zip</h3>
            <span>{data.zip} </span>
            <h3>country</h3>
            <span>{data.country} </span>
          </div>
          <div className="user-info-container-one">
            <h3>phone</h3>
            <span>{data.phone} </span>
            <h3>fax</h3>
            <span>Verified email: {data.fax} </span>
            <h3>email verified</h3>
            <span>{data.emailVerified ? 'Sí, verificado.' : 'No, a verificar.'} </span>
            <h3>registration date</h3>
            <span>{data.registrationDate} </span>
            <h3>verification code</h3>
            <span>{data.verificationCode}</span>        <h3>IP address</h3>
            <span>{data.ip}</span>
          </div>
        </div>

        <div className="buttons">
          <button className="modal-button gray" onClick={closeModal}>Editar información</button>
          <button className="modal-button gray" onClick={closeModal}>Cerrar</button>
        </div>
      </div>
    </div>
  );
};

export default UserDashBoard;
